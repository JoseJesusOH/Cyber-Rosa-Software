package implementaciones;

import entidades.Gasto;
import interfaces.IConexionBD;
import interfaces.IGastosDAO;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class GastosDAO implements IGastosDAO {

    private final IConexionBD conexion;

    public GastosDAO(IConexionBD conexion) {
        this.conexion = conexion;

    }

    @Override
    public boolean agregar(Gasto gasto) {
        EntityManager em = conexion.crearConexion();

        try {
            em.getTransaction().begin();
            em.persist(gasto);
            em.getTransaction().commit();
            return true;

        } catch (IllegalStateException ex) {
            System.err.println("No fue posible agregar el gasto");
            return false;
        }
    }

    @Override
    public Gasto consultar(int id) {
        EntityManager em = this.conexion.crearConexion();

        try {

            Gasto gastoBD = em.find(Gasto.class, id);

            return gastoBD;
        } catch (IllegalStateException ise) {
            System.err.println("No fue posible consultar el gasto");
            return null;
        }
    }

    @Override
    public List<Gasto> consultarTodos() {
        List<Gasto> gastos = null;
        EntityManager em = conexion.crearConexion();

        try {

            em.getTransaction().begin();

            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<Gasto> criteria = builder.createQuery(Gasto.class);
            TypedQuery<Gasto> query = em.createQuery(criteria);

            gastos = query.getResultList();

            em.getTransaction().commit();
        } catch (IllegalStateException ex) {
            System.err.println("No fue posible consultar todos los gastos");
            return null;
        }

        return gastos;
    }

    @Override
    public List<Gasto> buscarEntre(Calendar inicio, Calendar fin) {
        
        try {
            
            EntityManager em = conexion.crearConexion();
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String fechaInicio = dateFormat.format(inicio.getTimeInMillis());

            String fechaFin = dateFormat.format(fin.getTimeInMillis());

            return em.createQuery(String.format("SELECT g FROM Gasto g WHERE g.fecha >= '%s' AND g.fecha <= '%s'", fechaInicio, fechaFin)).getResultList();

        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar los gastos entre las fechas dadas");
            return null;
        }
    }

    @Override
    public boolean actualizar(Gasto gasto) {
        EntityManager em = conexion.crearConexion();

        try {
            em.getTransaction().begin();

            Gasto gastoBD = em.find(Gasto.class, gasto.getId());

            //gastoBD.setFechaGasto(gasto.getFechaGasto());
            gastoBD.setConcepto(gasto.getConcepto());
            gastoBD.setCosto(gasto.getCosto());
            gastoBD.setAutoriza(gasto.getAutoriza());

            em.getTransaction().commit();
            return true;

        } catch (IllegalStateException ex) {
            System.err.println("No fue posible actualizar la caja");
            return false;
        }
    }

 
}

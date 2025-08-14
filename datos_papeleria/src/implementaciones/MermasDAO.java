package implementaciones;

import entidades.Compra;
import entidades.Merma;
import interfaces.IConexionBD;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import interfaces.IMermaDAO;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class MermasDAO implements IMermaDAO {

    private final IConexionBD conexion;

    public MermasDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean agregar(Merma merma) {
        EntityManager em = this.conexion.crearConexion();
        try {

            em.getTransaction().begin();
            em.merge(merma);
            em.getTransaction().commit();

            return true;

        } catch (IllegalStateException ise) {
            System.err.println("No fue posible guardar la merma");
            return false;
        }
    }

    @Override
    public Merma consultar(int id) {
        EntityManager em = this.conexion.crearConexion();

        try {

            Merma merma = em.find(Merma.class, id);

            return merma;
        } catch (IllegalStateException ise) {
            System.err.println("No fue posible consultar la compra");
            return null;
        }
    }

    @Override
    public Merma consultarUltimaMerma() {
        EntityManager em = this.conexion.crearConexion();
        try {
            var query = em.createNativeQuery("SELECT * FROM mermas ORDER BY id DESC LIMIT 1", Merma.class);
            Merma merma = (Merma) query.getSingleResult();
            return merma;
        } catch (NoResultException nre) {
            System.err.println("No se encontraron resultados");
            return null;
        } catch (IllegalStateException ise) {
            System.err.println("No fue posible consultar la última merma");
            return null;
        }
    }

    @Override
    public List<Merma> consultarTodos() {
        List<Merma> mermas = null;
        EntityManager em = conexion.crearConexion();
        try {

            em.getTransaction().begin();

            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<Merma> criteria = builder.createQuery(Merma.class);
            TypedQuery<Merma> query = em.createQuery(criteria);

            mermas = query.getResultList();

            em.getTransaction().commit();
        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar todas entradas al almacen");
            return null;
        }

        return mermas;
    }

    @Override
    public List<Merma> buscarEntre(Calendar inicio, Calendar fin) {
        List<Merma> mermas = null;
        EntityManager em = conexion.crearConexion();
        try {

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String fechaInicio = dateFormat.format(inicio.getTimeInMillis());

            String fechaFin = dateFormat.format(fin.getTimeInMillis());

            return em.createQuery(String.format("SELECT v FROM Merma v WHERE v.fecha >= '%s' AND v.fecha <= '%s'", fechaInicio, fechaFin)).getResultList();

        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar las compras entre las fechas dadas");
            return null;
        }
    }


}

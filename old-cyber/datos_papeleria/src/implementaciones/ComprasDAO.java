package implementaciones;

import entidades.Compra;
import entidades.Proveedor;

import interfaces.IConexionBD;
import interfaces.ICompraDAO;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class ComprasDAO implements ICompraDAO {

    private final IConexionBD conexion;

    public ComprasDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean agregar(Compra compra) {
        EntityManager em = this.conexion.crearConexion();
        try {

            em.getTransaction().begin();
            em.persist(compra);
            em.getTransaction().commit();

            return true;

        } catch (IllegalStateException ise) {
            System.err.println("No fue posible guardar la entrada al almacen");
            return false;
        }

    }

    @Override
    public Compra consultar(int id) {
        EntityManager em = this.conexion.crearConexion();

        try {

            Compra entradaAlmacen = em.find(Compra.class, id);

            return entradaAlmacen;
        } catch (IllegalStateException ise) {
            System.err.println("No fue posible consultar la compra");
            return null;
        }
    }

    @Override
    public List<Compra> consultarTodos() {
        List<Compra> compras = null;
        EntityManager em = conexion.crearConexion();
        try {

            em.getTransaction().begin();

            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<Compra> criteria = builder.createQuery(Compra.class);
            TypedQuery<Compra> query = em.createQuery(criteria);

            compras = query.getResultList();

            em.getTransaction().commit();
        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar todas compras");
            return null;
        }

        return compras;
    }

    @Override
    public List<Compra> buscarEntre(Calendar inicio, Calendar fin) {

        List<Compra> compras = null;
        EntityManager em = conexion.crearConexion();
        try {

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String fechaInicio = dateFormat.format(inicio.getTimeInMillis());

            String fechaFin = dateFormat.format(fin.getTimeInMillis());

            return em.createQuery(String.format("SELECT v FROM Compra v WHERE v.fecha >= '%s' AND v.fecha <= '%s'", fechaInicio, fechaFin)).getResultList();

        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar las compras entre las fechas dadas");
            return null;
        }

    }

    @Override
    public List<Compra> buscarEntreProveedores(Calendar inicio, Calendar fin, Proveedor proveedor) {
        List<Compra> compras = null;
        EntityManager em = conexion.crearConexion();
        try {

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String fechaInicio = dateFormat.format(inicio.getTimeInMillis());

            String fechaFin = dateFormat.format(fin.getTimeInMillis());

            return em.createQuery(String.format("SELECT v FROM Compra v WHERE v.fecha >= '%s' AND v.fecha <= '%s' AND v.proveedor.id = %d", fechaInicio, fechaFin, proveedor.getId())).getResultList();

        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar compras al proveedor en la fecha dada");
            return null;
        }
    }

}

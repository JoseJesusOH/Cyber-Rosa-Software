package implementaciones;

import entidades.DetalleVenta;
import interfaces.IConexionBD;
import interfaces.IDetalleVentasDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class DetalleVentasDAO implements IDetalleVentasDAO {

    private final IConexionBD conexion;

    public DetalleVentasDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean agregar(DetalleVenta detalleVenta) {

        try {
            EntityManager em = this.conexion.crearConexion();
            em.getTransaction().begin();

            em.persist(detalleVenta);

            em.getTransaction().commit();
            return true;
        } catch (IllegalStateException ise) {
            System.err.println("No fue posible guardar la venta.");
            return false;
        }
    }

    @Override
    public List<DetalleVenta> consultarTodos() {
        try {
            EntityManager em = this.conexion.crearConexion();

            CriteriaBuilder builder = em.getCriteriaBuilder();

            CriteriaQuery<DetalleVenta> criteria = builder.createQuery(DetalleVenta.class);

            TypedQuery<DetalleVenta> query = em.createQuery(criteria);

            return query.getResultList();
        } catch (IllegalStateException ise) {
            System.err.println("No se pudierón consultar los detalles");
            return null;
        }

    }

    @Override
    public List<DetalleVenta> consultarTodas(int idVenta) {
        List<DetalleVenta> detallesVenta = null;
        try {
            EntityManager em = conexion.crearConexion();
            em.getTransaction().begin();
            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<DetalleVenta> criteria = builder.createQuery(DetalleVenta.class);
            Root<DetalleVenta> root = criteria.from(DetalleVenta.class);
            criteria.select(root)
                    .where(builder.equal(root.get("idVenta"), idVenta));
            TypedQuery<DetalleVenta> query = em.createQuery(criteria);
            detallesVenta = query.getResultList();
            em.getTransaction().commit();
        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar todos los detalles de venta");
            return null;
        }
        return detallesVenta;
    }

    @Override
    public List<DetalleVenta> consultarTodas() {

        try {
            EntityManager em = this.conexion.crearConexion();

            CriteriaBuilder builder = em.getCriteriaBuilder();

            CriteriaQuery<DetalleVenta> criteria = builder.createQuery(DetalleVenta.class);

            TypedQuery<DetalleVenta> query = em.createQuery(criteria);

            return query.getResultList();
        } catch (IllegalStateException ise) {
            System.err.println("No se pudierón consultar los detalles");
            return null;
        }

    }

}

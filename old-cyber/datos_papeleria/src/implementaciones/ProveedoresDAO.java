package implementaciones;

import entidades.Proveedor;
import interfaces.IConexionBD;
import interfaces.IProveedoresDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class ProveedoresDAO implements IProveedoresDAO {

    private final IConexionBD conexion;

    public ProveedoresDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean agregar(Proveedor proveedor) {

        EntityManager em = conexion.crearConexion();

        try {
            em.getTransaction().begin();
            em.persist(proveedor);
            em.getTransaction().commit();
            return true;

        } catch (IllegalStateException ex) {
            System.err.println("No fue posible agregar al proveedor");
            return false;
        }
    }

    @Override
    public boolean actualizar(Proveedor proveedor) {

        EntityManager em = conexion.crearConexion();

        try {
            em.getTransaction().begin();

            Proveedor proveedorBD = em.find(Proveedor.class, proveedor.getId());

            proveedorBD.setNombre(proveedor.getNombre());
            proveedorBD.setDireccion(proveedor.getDireccion());
            proveedorBD.setTelefono(proveedor.getTelefono());
            proveedorBD.setEmail(proveedor.getEmail());
            proveedorBD.setWebsite(proveedor.getWebsite());
            proveedorBD.setContacto(proveedor.getContacto());
                    
                    
                    
            em.getTransaction().commit();
            return true;

        } catch (IllegalStateException ex) {
            System.err.println("No se pudo actualizar al proveedor");
            return false;
        }
    }

    @Override
    public boolean eliminar(int id) {

        EntityManager em = conexion.crearConexion();

        try {
            em.getTransaction().begin();

            Proveedor proveedorBD = em.find(Proveedor.class, id);

            em.remove(proveedorBD);

            em.getTransaction().commit();
            return true;

        } catch (IllegalStateException ex) {
            System.err.println("No se pudo eliminar al proveedor");
            return false;
        }
    }

    @Override
    public Proveedor consultar(int id) {

        EntityManager em = conexion.crearConexion();

        try {

            em.getTransaction().begin();

            Proveedor proveedorBD = em.find(Proveedor.class, id);

            em.getTransaction().commit();

            return proveedorBD;

        } catch (IllegalStateException ex) {
            System.err.println("No se pudo consultar al cliente");
            return null;
        }
    }

    @Override
    public List<Proveedor> consultarTodos() {
        List<Proveedor> proveedores = null;

        try {

            EntityManager em = conexion.crearConexion();

            em.getTransaction().begin();

            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<Proveedor> criteria = builder.createQuery(Proveedor.class);
            TypedQuery<Proveedor> query = em.createQuery(criteria);

            proveedores = query.getResultList();

            em.getTransaction().commit();
        } catch (IllegalStateException ex) {
            System.err.println("No fue posible consultar todos los proveedores");
            return null;
        }

        return proveedores;

    }

}

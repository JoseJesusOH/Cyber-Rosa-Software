package implementaciones;

import entidades.Cliente;
import interfaces.IClientesDAO;
import interfaces.IConexionBD;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;


public class ClientesDAO implements IClientesDAO {

    private final IConexionBD conexion;

    public ClientesDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean agregar(Cliente cliente) {

        EntityManager em = conexion.crearConexion();

        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
            return true;

        } catch (IllegalStateException ex) {
            System.err.println("No se pudo agregar al cliente");
            return false;
        }
    }

    @Override
    public boolean actualizar(Cliente cliente) {

        EntityManager em = conexion.crearConexion();

        try {
            em.getTransaction().begin();

            Cliente clienteBD = em.find(Cliente.class, cliente.getId());

            clienteBD.setEmail(cliente.getEmail());
            clienteBD.setNombre(cliente.getNombre());
            clienteBD.setRfc(cliente.getRfc());
            clienteBD.setTelefono(cliente.getTelefono());

            em.getTransaction().commit();
            return true;

        } catch (IllegalStateException ex) {
            System.err.println("No se pudo actualizar al cliente");
            return false;
        }
    }

    @Override
    public boolean eliminar(int id) {

        EntityManager em = conexion.crearConexion();

        try {
            em.getTransaction().begin();

            Cliente clienteBD = em.find(Cliente.class, id);

            em.remove(clienteBD);

            em.getTransaction().commit();
            return true;

        } catch (IllegalStateException ex) {
            System.err.println("No se pudo eliminar al cliente");
            return false;
        }
    }

    @Override
    public Cliente consultar(int id) {

        EntityManager em = conexion.crearConexion();

        try {

            em.getTransaction().begin();

            Cliente clienteBD = em.find(Cliente.class, id);

            em.getTransaction().commit();

            return clienteBD;

        } catch (IllegalStateException ex) {
            System.err.println("No se pudo consultar al cliente");
            return null;
        }
    }

    @Override
    public List<Cliente> consultarTodos() {
        List<Cliente> clientes = null;
        try {
            EntityManager em = conexion.crearConexion();

            em.getTransaction().begin();

            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<Cliente> criteria = builder.createQuery(Cliente.class);
            TypedQuery<Cliente> query = em.createQuery(criteria);

            clientes = query.getResultList();

            em.getTransaction().commit();
            return clientes;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar todos los clientes");
            return null;
        }
    }
}

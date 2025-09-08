package implementaciones;

import entidades.Categoria;
import interfaces.ICategoriasDAO;
import interfaces.IConexionBD;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class CategoriasDAO implements ICategoriasDAO {

    private final IConexionBD conexion;

    public CategoriasDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean agregar(Categoria categoria) {

        EntityManager em = conexion.crearConexion();

        try {
            em.getTransaction().begin();
            em.persist(categoria);
            em.getTransaction().commit();
            return true;

        } catch (IllegalStateException ex) {
            System.err.println("No fue posible agregar la categoria");
            return false;
        }
    }

    @Override
    public boolean actualizar(Categoria categoria) {
        EntityManager em = conexion.crearConexion();

        try {
            em.getTransaction().begin();

            Categoria categoriaBD = em.find(Categoria.class, categoria.getId());

            categoriaBD.setNombre(categoria.getNombre());

            em.getTransaction().commit();
            return true;

        } catch (IllegalStateException ex) {
            System.err.println("No fue posible actualizar la categoria");
            return false;
        }
    }

    @Override
    public boolean eliminar(int id) {
        EntityManager em = conexion.crearConexion();

        try {
            em.getTransaction().begin();

            Categoria categoriaBD = em.find(Categoria.class, id);

            em.remove(categoriaBD);

            em.getTransaction().commit();
            return true;

        } catch (IllegalStateException ex) {
            System.err.println("No fue posible eliminar la categoria");
            return false;
        }

    }

    @Override
    public Categoria consultar(int id) {
        EntityManager em = conexion.crearConexion();

        try {

            em.getTransaction().begin();

            Categoria categoriaBD = em.find(Categoria.class, id);

            em.getTransaction().commit();

            return categoriaBD;

        } catch (IllegalStateException ex) {
            System.err.println("No fue posible consultar la categoria");
            return null;
        }

    }

    @Override
    public List<Categoria> consultarTodos() {
        List<Categoria> categorias = null;
        try {
            EntityManager em = conexion.crearConexion();

            em.getTransaction().begin();

            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<Categoria> criteria = builder.createQuery(Categoria.class);
            TypedQuery<Categoria> query = em.createQuery(criteria);

            categorias = query.getResultList();

            em.getTransaction().commit();
        } catch (IllegalStateException ex) {
            System.err.println("No fue posible consultar todas las categorias");
            return null;
        }

        return categorias;

    }

}

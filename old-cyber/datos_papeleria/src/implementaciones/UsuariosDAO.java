package implementaciones;

import entidades.Usuario;
import interfaces.IConexionBD;
import interfaces.IUsuariosDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class UsuariosDAO implements IUsuariosDAO {
    
    private final IConexionBD conexion;
    
    public UsuariosDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }
    
    @Override
    public boolean agregar(Usuario usuario) {
        
        EntityManager em = conexion.crearConexion();
        
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
            return true;
            
        } catch (IllegalStateException ex) {
            System.err.println("No se pudo agregar al usuario");
            return false;
        }
    }
    
    @Override
    public boolean actualizar(Usuario usuario) {
        
        EntityManager em = conexion.crearConexion();
        
        try {
            em.getTransaction().begin();
            
            Usuario usuarioBD = em.find(Usuario.class, usuario.getId());
            
            usuarioBD.setNombre(usuario.getNombre());
            usuarioBD.setPassword(usuario.getPassword());
            usuarioBD.setRol(usuario.getRol());
            em.merge(usuarioBD);
            em.getTransaction().commit();
            return true;
            
        } catch (IllegalStateException ex) {
            System.err.println("No se pudo actualizar al usuario");
            return false;
        }
    }
    
    @Override
    public boolean eliminar(int id) {
        
        EntityManager em = conexion.crearConexion();
        
        try {
            em.getTransaction().begin();
            
            Usuario usuarioBD = em.find(Usuario.class, id);
            
            em.remove(usuarioBD);
            
            em.getTransaction().commit();
            return true;
            
        } catch (IllegalStateException ex) {
            System.err.println("No se pudo eliminar al usuario");
            return false;
        }
    }
    
    @Override
    public Usuario consultar(int id) {
        
        EntityManager em = conexion.crearConexion();
        try {
            em.getTransaction().begin();
            Usuario usuarioBD = em.find(Usuario.class, id);
            em.getTransaction().commit();
            return usuarioBD;
            
        } catch (IllegalStateException ex) {
            System.err.println("No se pudo consultar al cliente");
            return null;
        }
    }
    
    @Override
    public boolean iniciarSesion(Usuario usuario) {
        EntityManager em = conexion.crearConexion();
        try {
            Usuario usuarioBD = null;
            em.getTransaction().begin();
            TypedQuery<Usuario> query = em.createQuery(
                    "SELECT u FROM Usuario u WHERE u.nombre = :nombre AND u.password = :password AND u.rol = :rol",
                    Usuario.class);
            query.setParameter("nombre", usuario.getNombre());
            query.setParameter("password", usuario.getPassword());
            query.setParameter("rol", usuario.getRol());
            usuarioBD = query.getSingleResult();
            if (usuarioBD != null) {
                usuario.setId(usuarioBD.getId());
            }
            em.getTransaction().commit();
            return usuarioBD != null;
        } catch (NoResultException ex) {
            System.err.println("Nombre de usuario o contraseña incorrectos");
            return false;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudo consultar al usuario");
            return false;
        }
    }
    
    @Override
    public List<Usuario> consultarTodos() {
        List<Usuario> usuarios = null;
        try {
            EntityManager em = conexion.crearConexion();
            em.getTransaction().begin();
            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<Usuario> criteria = builder.createQuery(Usuario.class);
            TypedQuery<Usuario> query = em.createQuery(criteria);
            usuarios = query.getResultList();
            em.getTransaction().commit();
        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar todos los usuarios");
            return null;
        }
        return usuarios;
    }
    
    @Override
    public Usuario obtenerSesion(Usuario usuario) {
        EntityManager em = conexion.crearConexion();
        try {
            Usuario usuarioBD = null;
            em.getTransaction().begin();
            TypedQuery<Usuario> query = em.createQuery(
                    "SELECT u FROM Usuario u WHERE u.nombre = :nombre AND u.password = :password AND u.rol = :rol",
                    Usuario.class);
            query.setParameter("nombre", usuario.getNombre());
            query.setParameter("password", usuario.getPassword());
            query.setParameter("rol", usuario.getRol());
            usuarioBD = query.getSingleResult();
            
            em.getTransaction().commit();
            return usuarioBD;
        } catch (NoResultException ex) {
            System.err.println("Nombre de usuario o contraseña incorrectos");
            return null;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudo consultar al usuario");
            return null;
        }
    }
}

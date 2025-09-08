package implementaciones;

import entidades.Caja;
import entidades.Usuario;
import enumeradores.Estado;
import interfaces.IConexionBD;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import interfaces.ICajasDAO;

public class CajasDAO implements ICajasDAO {

    private final IConexionBD conexion;

    public CajasDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public Caja cajaAbierta() {

        EntityManager em = conexion.crearConexion();
        try {

            em.getTransaction().begin();

            TypedQuery<Caja> query = em.createQuery("SELECT c FROM Caja c WHERE c.estado = :estado", Caja.class);
            query.setParameter("estado", Estado.ABIERTA);
            Caja cajaAbierta = query.getSingleResult();
            em.getTransaction().commit();

            return cajaAbierta;

        } catch (IllegalStateException ex) {
            System.err.println("No se pudo obtener la caja abierta: " + ex.getMessage());
            return null;
        }

    }

    @Override
    public boolean agregar(Caja caja) {

        EntityManager em = conexion.crearConexion();

        try {
            em.getTransaction().begin();
            em.persist(caja);
            em.getTransaction().commit();
            return true;

        } catch (IllegalStateException ex) {
            System.err.println("No se pudo agregar la caja");
            return false;
        }
    }
@Override
public boolean actualizar(Caja caja) {
    EntityManager em = conexion.crearConexion();

    try {
        em.getTransaction().begin();

        Caja cajaBD = em.find(Caja.class, caja.getId());

        if (cajaBD != null) {
            // Actualiza los campos de la caja con los valores del objeto caja
            cajaBD.setEstado(caja.getEstado());
            cajaBD.setFechaApertura(caja.getFechaApertura());
            cajaBD.setFechaCierre(caja.getFechaCierre());
            cajaBD.setSaldoCierre(caja.getSaldoCierre());
            cajaBD.setSaldoInicial(caja.getSaldoInicial());
            cajaBD.setTotalGastos(caja.getTotalGastos());
            cajaBD.setTotalIngresos(caja.getTotalIngresos());

            // Asocia el usuario existente al objeto cajaBD
            cajaBD.setUsuario(em.find(Usuario.class, caja.getUsuario().getId()));

            // Utiliza merge para actualizar la entidad en la base de datos
            em.merge(cajaBD);

            em.getTransaction().commit();
            return true;
        } else {
            System.err.println("La caja no existe en la base de datos.");
            return false;
        }

    } catch (IllegalStateException ex) {
        System.err.println("No fue posible actualizar la caja");
        return false;
    }
}

    @Override
    public boolean eliminar(int id) {
        EntityManager em = conexion.crearConexion();

        try {
            em.getTransaction().begin();

            Caja cajaBD = em.find(Caja.class, id);

            em.remove(cajaBD);

            em.getTransaction().commit();
            return true;

        } catch (IllegalStateException ex) {
            System.err.println("No fue posible eliminar la caja");
            return false;
        }
    }

    @Override
    public Caja consultar(int id) {
        EntityManager em = conexion.crearConexion();

        try {

            em.getTransaction().begin();

            Caja cajaBD = em.find(Caja.class, id);

            em.getTransaction().commit();

            return cajaBD;

        } catch (IllegalStateException ex) {
            System.err.println("No fue posible consultar la caja");
            return null;
        }
    }

    @Override
    public List<Caja> consultarTodos() {
        List<Caja> cajas;
        try {
            EntityManager em = conexion.crearConexion();

            em.getTransaction().begin();

            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<Caja> criteria = builder.createQuery(Caja.class);
            TypedQuery<Caja> query = em.createQuery(criteria);

            cajas = query.getResultList();

            em.getTransaction().commit();
        } catch (IllegalStateException ex) {
            System.err.println("No fue posible consultar todas las cajas");
            return null;
        }

        return cajas;

    }
}

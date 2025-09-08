package implementaciones;

import entidades.DetalleMerma;
import interfaces.IConexionBD;
import interfaces.IDetalleMermaDAO;
import javax.persistence.EntityManager;

public class DetalleMermasDAO implements IDetalleMermaDAO {

    private final IConexionBD conexion;

    public DetalleMermasDAO(IConexionBD conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean agregar(DetalleMerma detalleMerma) {
        EntityManager em = this.conexion.crearConexion();
        try {

            em.getTransaction().begin();
            em.persist(detalleMerma);
            em.getTransaction().commit();

            return true;

        } catch (IllegalStateException ise) {
            System.err.println("No fue posible guardar la merma");
            return false;
        }
    }

}

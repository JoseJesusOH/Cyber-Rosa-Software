package conexion;

import interfaces.IConexionBD;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class ConexionBD implements IConexionBD {

    private EntityManager em;

    @Override
    public EntityManager crearConexion() throws IllegalStateException {
        if (em == null) {
            EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("CyberPapeleriaDatosPU");
            em = emFactory.createEntityManager();
        }

        return em;
    }

}


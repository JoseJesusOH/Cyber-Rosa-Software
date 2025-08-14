
package interfaces;

import javax.persistence.EntityManager;




public interface IConexionBD {
        
    EntityManager crearConexion() throws IllegalStateException;
}



package interfaces;

import entidades.Caja;

public interface ICajasDAO extends IDAO<Caja>{

    public Caja cajaAbierta();
    
}
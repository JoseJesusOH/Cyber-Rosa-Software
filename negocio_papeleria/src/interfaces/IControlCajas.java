
package interfaces;

import entidades.Caja;
import java.util.List;

public interface IControlCajas {
    
    boolean agregar(Caja caja);
   
    boolean actualizar(Caja caja);
    
    boolean eliminar(int id);
    
    Caja consultar(int id);
    
    List<Caja> consultarTodos();

    public Caja cajaAbierta();
}
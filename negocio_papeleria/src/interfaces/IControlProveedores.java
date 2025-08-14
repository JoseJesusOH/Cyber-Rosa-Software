
package interfaces;

import entidades.Proveedor;
import java.util.List;

public interface IControlProveedores {
    
    boolean agregar(Proveedor proveedor);
    
    boolean actualizar(Proveedor proveedor);
    
    boolean eliminar(int id);
    
    Proveedor consultar(int id);
    
    List<Proveedor> consultarTodos();

}

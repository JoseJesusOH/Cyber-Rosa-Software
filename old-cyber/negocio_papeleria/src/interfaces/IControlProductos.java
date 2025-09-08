
package interfaces;

import entidades.Producto;
import java.util.List;

public interface IControlProductos {

    boolean agregar(Producto producto);
    
    boolean actualizar(Producto producto);
     Producto consultarCodigo(long codigo);
    boolean eliminar(int id);
    
      List<Producto> consultarProductosCoincidencias(Object[] parametros);

    Producto consultar(int id);
    
    List<Producto> consultarPorNombre(String nombre);
    
    List<Producto> consultarTodos();
    
    
}

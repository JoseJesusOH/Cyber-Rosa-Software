
package interfaces;

import entidades.DetalleVenta;
import java.util.List;

public interface IDetalleVentasDAO {
            boolean agregar(DetalleVenta t);



    List<DetalleVenta> consultarTodos();
     public List<DetalleVenta> consultarTodas (int idVenta);
       public List<DetalleVenta> consultarTodas ();
    
}

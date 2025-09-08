
package interfaces;

import entidades.DetalleVenta;
import java.util.List;

public interface IControlDetalleVentas {
    boolean agregar (DetalleVenta detalleVenta);
    public List<DetalleVenta> consultarTodas (int idVenta);
        public List<DetalleVenta> consultarTodasDetallesVentas ();

}

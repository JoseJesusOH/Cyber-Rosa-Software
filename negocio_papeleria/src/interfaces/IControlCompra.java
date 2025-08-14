package interfaces;

import entidades.DetalleCompra;
import entidades.Producto;
import entidades.Proveedor;
import java.util.Calendar;
import java.util.List;

public interface IControlCompra {

    boolean agregar(DetalleCompra entradaAlmacen);

    DetalleCompra consultar(int id);

    List<DetalleCompra> consultarTodos();
    
    List<DetalleCompra> buscarEntre (Calendar inicio, Calendar fin);
    
    List<DetalleCompra> buscarEntreProveedores (Calendar inicio, Calendar fin, Proveedor proveedor);
    
    List<DetalleCompra> buscarEntreProductos (Calendar inicio, Calendar fin, Producto producto);
    
}

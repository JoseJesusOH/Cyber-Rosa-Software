package interfaces;

import entidades.Cliente;
import entidades.DetalleVenta;
import entidades.Venta;
import java.util.Calendar;
import java.util.List;

public interface IControlVentas {

    boolean agregar(Venta venta,List<DetalleVenta> detalles);
    
    Venta consultar(int id);
    
    List<Venta> consultarTodas();
    
    List<Venta> buscarEntre(Calendar inicio , Calendar fin);   
    
    List<Venta> buscarEntreCliente(Calendar inicio, Calendar fin, Cliente cliente);
        public List<Venta> consultarVentasCoincidencias(Object[] parametros);
    
}

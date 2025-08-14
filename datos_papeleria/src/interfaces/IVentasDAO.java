package interfaces;

import entidades.Cliente;
import entidades.Venta;
import java.util.Calendar;
import java.util.List;

public interface IVentasDAO {

    
    boolean agregar(Venta t);



    Venta consultar(int id);

    List<Venta> consultarTodos();
    List<Venta> buscarEntre(Calendar inicio , Calendar fin);   
    
    List<Venta> buscarEntreCliente(Calendar inicio, Calendar fin, Cliente cliente);
         List<Venta> consultarVentasCoincidencias(Object[] parametros) ;
    
}

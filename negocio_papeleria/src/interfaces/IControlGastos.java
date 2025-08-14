
package interfaces;

import entidades.Gasto;
import java.util.Calendar;
import java.util.List;

public interface IControlGastos {
    
    int agregar(Gasto gasto);
    
    Gasto consultar(int id);
    
    List<Gasto> consultarTodas();
    
    List<Gasto> buscarEntre(Calendar inicio , Calendar fin);   
    
}
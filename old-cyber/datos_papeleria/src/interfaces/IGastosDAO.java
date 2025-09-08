
package interfaces;

import entidades.Gasto;
import java.util.Calendar;
import java.util.List;

public interface IGastosDAO {
    
        boolean agregar(Gasto t);

    boolean actualizar(Gasto t);

    Gasto consultar(int id);

    List<Gasto> consultarTodos();
    
    
    List<Gasto> buscarEntre(Calendar inicio , Calendar fin);   
    
}
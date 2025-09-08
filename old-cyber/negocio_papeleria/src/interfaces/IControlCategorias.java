package interfaces;

import entidades.Categoria;
import java.util.List;

public interface IControlCategorias {

    boolean agregar(Categoria categoria);

    boolean actualizar(Categoria categoria);

    boolean eliminar(int id);

    Categoria consultar(int id);

    List<Categoria> consultarTodos();
    
    
}

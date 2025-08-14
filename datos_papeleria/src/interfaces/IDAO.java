package interfaces;

import java.util.List;

public interface IDAO<T> {

    boolean agregar(T t);

    boolean actualizar(T t);

    boolean eliminar(int id);

    T consultar(int id);

    List<T> consultarTodos();

}

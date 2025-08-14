package interfaces;

import entidades.Usuario;
import java.util.List;


public interface IControlUsuarios {

    boolean agregar(Usuario usuario);

    boolean actualizar(Usuario usuario);
 public boolean iniciarSesion(Usuario usuario) ;
    boolean eliminar(int id);

    Usuario consultar(int id);

    List<Usuario> consultarTodos();
 public Usuario obtenerSesion(Usuario usuario) ;


}

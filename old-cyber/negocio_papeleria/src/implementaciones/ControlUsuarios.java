package implementaciones;

import entidades.Usuario;

import java.util.List;

import interfaces.IControlUsuarios;
import interfaces.IFachadaDAO;


public class ControlUsuarios implements IControlUsuarios{

  
    private final IFachadaDAO fachadaDAO;

    public ControlUsuarios(IFachadaDAO fachadaDAO) {
        this.fachadaDAO=fachadaDAO;
    }
    @Override
 public boolean iniciarSesion(Usuario usuario) {
     return this.fachadaDAO.iniciarSesion(usuario);
 }
    @Override
    public boolean agregar(Usuario usuario) {
return this.fachadaDAO.agregarUsuario(usuario);
    }

    @Override
    public boolean actualizar(Usuario usuario) {
return this.fachadaDAO.actualizarUsuario(usuario);
    }

    @Override
    public boolean eliminar(int id) {
return this.fachadaDAO.eliminarUsuario(id);
    }

    @Override
    public Usuario consultar(int id) {
return this.fachadaDAO.consultarUsuario(id);
    }

    @Override
    public List<Usuario> consultarTodos() {
 return this.fachadaDAO.consultarTodosUsuarios();
    }

    @Override
    public Usuario obtenerSesion(Usuario usuario) {
     return this.fachadaDAO.obtenerSesion(usuario);
    }
}

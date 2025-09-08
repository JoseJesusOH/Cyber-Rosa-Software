package implementaciones;

import entidades.Cliente;

import java.util.List;
import interfaces.IControlClientes;
import interfaces.IFachadaDAO;


public class ControlClientes implements IControlClientes {

    private final IFachadaDAO fachadaDAO;

    public ControlClientes(IFachadaDAO fachadaDAO) {
        this.fachadaDAO=fachadaDAO;
    }
    @Override
    public boolean agregar(Cliente cliente) {
return this.fachadaDAO.agregarCliente(cliente);
    }

    @Override
    public boolean actualizar(Cliente cliente) {
return this.fachadaDAO.actualizarCliente(cliente);
    }

    @Override
    public boolean eliminar(int id) {
return this.fachadaDAO.eliminarCliente(id);
    }

    @Override
    public Cliente consultar(int id) {
        return this.fachadaDAO.consultarCliente(id);
    }

    @Override
    public List<Cliente> consultarTodos() {
       return this.fachadaDAO.consultarTodosClientes();
    }
}

package implementaciones;

import entidades.Proveedor;

import java.util.List;
import interfaces.IControlProveedores;
import interfaces.IFachadaDAO;


public class ControlProveedores implements IControlProveedores {

 
    private final IFachadaDAO fachadaDAO;

    public ControlProveedores(IFachadaDAO fachadaDAO) {
        this.fachadaDAO=fachadaDAO;
    }

    @Override
    public boolean agregar(Proveedor proveedor) {
return this.fachadaDAO.agregarProveedor(proveedor);
    }

    @Override
    public boolean actualizar(Proveedor proveedor) {
return this.fachadaDAO.actualizarProveedor(proveedor);
       
    }

    @Override
    public boolean eliminar(int id) {

      return this.fachadaDAO.eliminarProveedor(id);
    }

    @Override
    public Proveedor consultar(int id) {

      return this.fachadaDAO.consultarProveedor(id);
    }

    @Override
    public List<Proveedor> consultarTodos() {
     return this.fachadaDAO.consultarTodosProveedores();
    }

}

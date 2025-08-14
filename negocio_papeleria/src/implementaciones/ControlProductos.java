 
package implementaciones;

import entidades.Producto;

import java.util.List;
import interfaces.IControlProductos;
import interfaces.IFachadaDAO;


public class ControlProductos implements IControlProductos{

    private final IFachadaDAO fachadaDAO;

    public ControlProductos(IFachadaDAO fachadaDAO) {
        this.fachadaDAO=fachadaDAO;
    }
    
    
    
    public  Producto consultarCodigo(long codigo){
        return this.fachadaDAO.consultarCodigo(codigo);
    }
    @Override
    public boolean agregar(Producto producto) {
return this.fachadaDAO.agregarProducto(producto);
    }

    @Override
    public boolean actualizar(Producto producto) {
    return this.fachadaDAO.actualizarProducto(producto);
    }

    @Override
    public boolean eliminar(int id) {
    return this.fachadaDAO.eliminarProducto(id);
    }
    
    @Override
    public Producto consultar(int id) {
      return this.fachadaDAO.consultarProducto(id);
    }
    
    @Override
    public List<Producto> consultarPorNombre(String nombre){
            return this.fachadaDAO.buscarProductosPorNombre(nombre);
    }

    @Override
    public List<Producto> consultarTodos() {
    return this.fachadaDAO.consultarTodosProductos();
    } 

    @Override
    public List<Producto> consultarProductosCoincidencias(Object[] parametros) {
    return this.fachadaDAO.consultarProductosCoincidencias(parametros);
    }
}

package implementaciones;

import entidades.Categoria;

import java.util.List;
import interfaces.IControlCategorias;
import interfaces.IFachadaDAO;

public class ControlCategoria implements IControlCategorias {

    private final IFachadaDAO fachadaDAO;

    public ControlCategoria(IFachadaDAO fachadaDAO) {
        this.fachadaDAO=fachadaDAO;
    }

    @Override
    public boolean agregar(Categoria categoria) {
        return fachadaDAO.agregarCategoria(categoria);
    }

    @Override
    public boolean actualizar(Categoria categoria) {
 return fachadaDAO.actualizarCategoria(categoria);
    }

    @Override
    public boolean eliminar(int id) {
 return fachadaDAO.eliminarCategoria(id);    }

    @Override
    public Categoria consultar(int id) {
 return fachadaDAO.consultarCategoria(id);
    }

    @Override
    public List<Categoria> consultarTodos() {
 return fachadaDAO.consultarTodasCategorias();
    }

   

}

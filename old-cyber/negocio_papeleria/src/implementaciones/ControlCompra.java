package implementaciones;

import entidades.DetalleCompra;
import entidades.Producto;
import entidades.Proveedor;

import java.util.Calendar;
import java.util.List;
import interfaces.IControlCompra;

import interfaces.IFachadaDAO;

public class ControlCompra implements IControlCompra {

    private final IFachadaDAO fachadaDAO;

    public ControlCompra(IFachadaDAO fachadaDAO) {
        this.fachadaDAO = fachadaDAO;
    }

    @Override
    public boolean agregar(DetalleCompra entradaAlmacen) {
return this.fachadaDAO.agregarDetalleCompra(entradaAlmacen);
    }

//    @Override
//    public DetalleCompra consultar(int id) {
//return this.fachadaDAO.consultarDetalleCompra(id);
//    }
//
//    @Override
//    public List<DetalleCompra> consultarTodos() {
//return this.fachadaDAO.consultarTodasEntradasAlmacen();
//    }
//
//    @Override
//    public List<DetalleCompra> buscarEntre(Calendar inicio, Calendar fin) {
//return this.fachadaDAO.buscarEntradasAlmacenEntreFechas(inicio, fin);
//    }
//
//    @Override
//    public List<DetalleCompra> buscarEntreProveedores(Calendar inicio, Calendar fin, Proveedor proveedor) {
//return this.fachadaDAO.buscarEntradasAlmacenEntreFechasYProveedor(inicio, fin, proveedor);
//    }
//
//    @Override
//    public List<DetalleCompra> buscarEntreProductos(Calendar inicio, Calendar fin, Producto producto) {
//        return this.fachadaDAO.buscarEntradasAlmacenEntreFechasYProducto(inicio, fin, producto);
//    }

    @Override
    public DetalleCompra consultar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DetalleCompra> consultarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DetalleCompra> buscarEntre(Calendar inicio, Calendar fin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DetalleCompra> buscarEntreProveedores(Calendar inicio, Calendar fin, Proveedor proveedor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DetalleCompra> buscarEntreProductos(Calendar inicio, Calendar fin, Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

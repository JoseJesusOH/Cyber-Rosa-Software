package interfaces;

import entidades.*;
import java.util.Calendar;
import java.util.List;

public interface IFachadaControl {
    public Usuario obtenerSesion(Usuario usuario) 
            ;
    public boolean iniciarSesion(Usuario usuario);
List<Venta> consultarVentasCoincidencias(Object[] parametros);
    public boolean agregarCaja(Caja caja);
 Producto consultarCodigo(long codigo);
    public boolean actualizarCaja(Caja caja);
    List<Producto> consultarProductosCoincidencias(Object[] parametros);

    public boolean cerrarCaja(Caja caja);

    public Caja consultarCaja(int id);

    public List<Caja> consultarCajas();

    public Caja consultarCajaAbierta();

    public int agregarGasto(Gasto gasto);

    public Gasto consultar(int id);

    public List<Gasto> consultarTodas();
    
     public List<DetalleVenta> consultarTodas(int idVenta);

       public List<DetalleVenta> consultarTodasDetallesVentas();

    public List<Gasto> buscarGastosEntreFechas(Calendar inicio, Calendar fin);

    public boolean agregarCategoria(Categoria categoria);

    public boolean actualizarCategoria(Categoria categoria);

    public boolean eliminarCategoria(int id);

    public Categoria consultarCategoria(int id);

    public List<Categoria> consultarTodasCategorias();

    public boolean agregarCliente(Cliente cliente);

    public boolean actualizarCliente(Cliente cliente);

    public boolean eliminarCliente(int id);

    public Cliente consultarCliente(int id);

    public List<Cliente> consultarTodosClientes();

    public boolean agregarProveedor(Proveedor proveedor);

    public boolean actualizarProveedor(Proveedor proveedor);

    public boolean eliminarProveedor(int id);

    public Proveedor consultarProveedor(int id);

    public List<Proveedor> consultarTodosProveedores();

    public List<Venta> buscarVentasEntreFechas(Calendar inicio, Calendar fin);

    public List<Venta> buscarVentasEntreFechasPorCliente(Calendar inicio, Calendar fin, Cliente cliente);

    public Venta consultarVenta(int id);

    public List<Venta> consultarVentas();

    public List<Venta> buscarVentasEntreFechasYCliente(Calendar inicio, Calendar fin, Cliente cliente);

    public boolean agregarVenta(Venta venta, List<DetalleVenta> detalles);

    public boolean agregarDetalleVenta(DetalleVenta detalleVenta);

    public boolean agregarDetalleCompra(DetalleCompra entradaAlmacen);

    public DetalleCompra consultarDetalleCompra(int id);

    public List<DetalleCompra> consultarTodasEntradasAlmacen();

    public List<DetalleCompra> buscarEntradasAlmacenEntreFechas(Calendar inicio, Calendar fin);

    public List<DetalleCompra> buscarEntradasAlmacenEntreFechasYProveedor(Calendar inicio, Calendar fin, Proveedor proveedor);

    public List<DetalleCompra> buscarEntradasAlmacenEntreFechasYProducto(Calendar inicio, Calendar fin, Producto producto);

    public Producto consultarProducto(int id);

    public boolean agregarProducto(Producto producto);

    public boolean actualizarProducto(Producto producto);

    public boolean eliminarProducto(int id);

    public List<Producto> buscarProductosPorNombre(String nombre);

    public List<Producto> consultarTodosProductos();

    public boolean agregarUsuario(Usuario usuario);

    public boolean actualizarUsuario(Usuario usuario);

    public boolean eliminarUsuario(int id);

    public Usuario consultarUsuario(int id);

    public List<Usuario> consultarTodosUsuarios();

    boolean agregar(Merma merma, List<DetalleMerma> detalles);

    Merma consultarMerma(int id);

    List<Merma> consultarTodasMermas();
    
            boolean agregar (DetalleMerma detalleMerma);

    public Caja cajaAbierta();

}

package interfaces;

import entidades.*;

import java.util.Calendar;
import java.util.List;

public interface IFachadaDAO {
 public Usuario obtenerSesion(Usuario usuario) ;
 Producto consultarCodigo(long codigo);
    public boolean agregarCaja(Caja caja);
    List<Producto> consultarProductosCoincidencias(Object[] parametros);

    public boolean actualizarCaja(Caja caja);
      List<Venta> consultarVentasCoincidencias(Object[] parametros) ;
    public boolean eliminarCaja(int id);

    public Caja consultarCaja(int id);

    public List<Caja> consultarCajas();

    public boolean agregarGasto(Gasto gasto);

    public boolean actualizarGasto(Gasto gasto);  
    
    public List<DetalleVenta> consultarTodas (int idVenta);
    
      public List<DetalleVenta> consultarTodasDetallesVentas ();

    public Gasto consultar(int id);

    public List<Gasto> consultarTodos();

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

    public List<Venta> consultarTodasVentas();

    public boolean agregarVenta(Venta venta);

    public boolean agregarDetalleVenta(DetalleVenta detalleVenta);

    public boolean agregarDetalleCompra(DetalleCompra detalleCompra);

    public boolean agregarDetalleMerma(DetalleMerma detalleMerma);

    public boolean agregarCompra(Compra compra);

    public Compra consultarCompra(int id);

    public List<Compra> consultarTodasCompras();

    public List<Compra> buscarComprasEntreFechas(Calendar inicio, Calendar fin);

    public List<Compra> buscarComprasEntreFechasYProveedor(Calendar inicio, Calendar fin, Proveedor proveedor);

    public Producto consultarProducto(int id);

    public boolean agregarProducto(Producto producto);

    public boolean actualizarProducto(Producto producto);

    public boolean eliminarProducto(int id);

    public List<Producto> buscarProductosPorNombre(String nombre);

    public List<Producto> consultarTodosProductos();

    public boolean agregarUsuario(Usuario usuario);
 public boolean iniciarSesion(Usuario usuario) ;
    public boolean actualizarUsuario(Usuario usuario);

    public boolean eliminarUsuario(int id);

    public Usuario consultarUsuario(int id);

    public List<Usuario> consultarTodosUsuarios();

    public boolean agregarMerma(Merma merma);

    public Merma consultarMerma(int id);

    public List<Merma> consultarTodasMermas();

    public List<Merma> buscarMermasEntreFechas(Calendar inicio, Calendar fin);

    public Caja cajaAbierta();


}

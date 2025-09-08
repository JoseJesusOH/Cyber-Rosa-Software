package fachada;

import entidades.Caja;
import entidades.Categoria;
import entidades.Cliente;
import entidades.Compra;
import entidades.DetalleCompra;
import entidades.DetalleMerma;
import entidades.DetalleVenta;
import entidades.Gasto;
import entidades.Merma;
import entidades.Producto;
import entidades.Proveedor;
import entidades.Usuario;
import entidades.Venta;
import fabrica.FabricaDAO;
import interfaces.ICajasDAO;
import interfaces.ICategoriasDAO;
import interfaces.IClientesDAO;
import interfaces.ICompraDAO;
import interfaces.IDetalleCompraDAO;
import interfaces.IDetalleMermaDAO;
import interfaces.IDetalleVentasDAO;
import interfaces.IFachadaDAO;
import interfaces.IGastosDAO;
import interfaces.IMermaDAO;
import interfaces.IProductosDAO;
import interfaces.IProveedoresDAO;
import interfaces.IUsuariosDAO;
import interfaces.IVentasDAO;
import java.util.List;
import java.util.Calendar;

public class FachadaDAO implements IFachadaDAO {

    private final FabricaDAO fabrica = FabricaDAO.getInstancia();

    @Override
    public boolean agregarCaja(Caja caja) {
        try {
            ICajasDAO cajasDAO = fabrica.getCajasDAO();
            return cajasDAO.agregar(caja);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean actualizarCaja(Caja caja) {
        try {
            ICajasDAO cajasDAO = fabrica.getCajasDAO();
            return cajasDAO.actualizar(caja);
        } catch (Exception e) {
            return false;
        }
    }

    public Caja cajaAbierta() {
        try {
            ICajasDAO cajasDAO = fabrica.getCajasDAO();
            return cajasDAO.cajaAbierta();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean eliminarCaja(int id) {
        try {
            ICajasDAO cajasDAO = fabrica.getCajasDAO();
            return cajasDAO.eliminar(id);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Caja consultarCaja(int id) {
        try {
            ICajasDAO cajasDAO = fabrica.getCajasDAO();
            return cajasDAO.consultar(id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Caja> consultarCajas() {
        try {
            ICajasDAO cajasDAO = fabrica.getCajasDAO();
            return cajasDAO.consultarTodos();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean agregarGasto(Gasto gasto) {
        try {
            IGastosDAO gastosDAO = fabrica.getGastosDAO();
            return gastosDAO.agregar(gasto);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean actualizarGasto(Gasto gasto) {
        try {
            IGastosDAO gastosDAO = fabrica.getGastosDAO();
            return gastosDAO.actualizar(gasto);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Gasto consultar(int id) {
        try {
            IGastosDAO gastosDAO = fabrica.getGastosDAO();
            return gastosDAO.consultar(id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Gasto> consultarTodos() {
        try {
            IGastosDAO gastosDAO = fabrica.getGastosDAO();
            return gastosDAO.consultarTodos();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Gasto> buscarGastosEntreFechas(Calendar inicio, Calendar fin) {
        try {
            IGastosDAO gastosDAO = fabrica.getGastosDAO();
            return gastosDAO.buscarEntre(inicio, fin);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean agregarCategoria(Categoria categoria) {
        try {
            ICategoriasDAO categoriasDAO = fabrica.getCategoriasDAO();
            return categoriasDAO.agregar(categoria);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean actualizarCategoria(Categoria categoria) {
        try {
            ICategoriasDAO categoriasDAO = fabrica.getCategoriasDAO();
            return categoriasDAO.actualizar(categoria);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean eliminarCategoria(int id) {
        try {
            ICategoriasDAO categoriasDAO = fabrica.getCategoriasDAO();
            return categoriasDAO.eliminar(id);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Categoria consultarCategoria(int id) {
        try {
            ICategoriasDAO categoriasDAO = fabrica.getCategoriasDAO();
            return categoriasDAO.consultar(id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Categoria> consultarTodasCategorias() {
        try {
            ICategoriasDAO categoriasDAO = fabrica.getCategoriasDAO();
            return categoriasDAO.consultarTodos();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        try {
            IClientesDAO clientesDAO = fabrica.getClientesDAO();
            return clientesDAO.agregar(cliente);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean actualizarCliente(Cliente cliente) {
        try {
            IClientesDAO clientesDAO = fabrica.getClientesDAO();
            return clientesDAO.actualizar(cliente);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean eliminarCliente(int id) {
        try {
            IClientesDAO clientesDAO = fabrica.getClientesDAO();
            return clientesDAO.eliminar(id);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Cliente consultarCliente(int id) {
        try {
            IClientesDAO clientesDAO = fabrica.getClientesDAO();
            return clientesDAO.consultar(id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Cliente> consultarTodosClientes() {
        try {
            IClientesDAO clientesDAO = fabrica.getClientesDAO();
            return clientesDAO.consultarTodos();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean agregarProveedor(Proveedor proveedor) {
        try {
            IProveedoresDAO proveedoresDAO = fabrica.getProveedoresDAO();
            return proveedoresDAO.agregar(proveedor);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean actualizarProveedor(Proveedor proveedor) {
        try {
            IProveedoresDAO proveedoresDAO = fabrica.getProveedoresDAO();
            return proveedoresDAO.actualizar(proveedor);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean eliminarProveedor(int id) {
        try {
            IProveedoresDAO proveedoresDAO = fabrica.getProveedoresDAO();
            return proveedoresDAO.eliminar(id);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Proveedor consultarProveedor(int id) {
        try {
            IProveedoresDAO proveedoresDAO = fabrica.getProveedoresDAO();
            return proveedoresDAO.consultar(id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Proveedor> consultarTodosProveedores() {
        try {
            IProveedoresDAO proveedoresDAO = fabrica.getProveedoresDAO();
            return proveedoresDAO.consultarTodos();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Venta> buscarVentasEntreFechas(Calendar inicio, Calendar fin) {
        try {
            IVentasDAO ventasDAO = fabrica.getVentasDAO();
            return ventasDAO.buscarEntre(inicio, fin);
        } catch (Exception e) {
            return null;
        }
    }

    public List<Venta> consultarVentasCoincidencias(Object[] parametros) {
        try {
            IVentasDAO ventasDAO = fabrica.getVentasDAO();
            IProductosDAO productosDAO = fabrica.getProductosDAO();
            if (parametros[1] != null) {
                long indice = Integer.parseInt((String) parametros[1]);
                parametros[1] = productosDAO.consultarCodigo(indice);
            }
            return ventasDAO.consultarVentasCoincidencias(parametros);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Venta> buscarVentasEntreFechasPorCliente(Calendar inicio, Calendar fin, Cliente cliente) {
        try {
            IVentasDAO ventasDAO = fabrica.getVentasDAO();
            return ventasDAO.buscarEntreCliente(inicio, fin, cliente);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Venta consultarVenta(int id) {
        try {
            IVentasDAO ventasDAO = fabrica.getVentasDAO();
            return ventasDAO.consultar(id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Venta> consultarTodasVentas() {
        try {
            IVentasDAO ventasDAO = fabrica.getVentasDAO();
            return ventasDAO.consultarTodos();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean agregarVenta(Venta venta) {
        try {
            IVentasDAO ventasDAO = fabrica.getVentasDAO();
            return ventasDAO.agregar(venta);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean agregarDetalleVenta(DetalleVenta detalleVenta) {
        try {
            IDetalleVentasDAO detalleVentasDAO = fabrica.getDetalleVentasDAO();
            return detalleVentasDAO.agregar(detalleVenta);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean agregarDetalleCompra(DetalleCompra detalleCompra) {
        try {
            IDetalleCompraDAO detalleCompraDAO = fabrica.getDetalleCompraDAO();
            return detalleCompraDAO.agregar(detalleCompra);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean agregarDetalleMerma(DetalleMerma detalleMerma) {
        try {
            IDetalleMermaDAO detalleMermasDAO = fabrica.getDetalleMermaDAO();
            return detalleMermasDAO.agregar(detalleMerma);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean agregarCompra(Compra compra) {
        try {
            ICompraDAO comprasDAO = fabrica.getComprasDAO();
            return comprasDAO.agregar(compra);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Compra consultarCompra(int id) {
        try {
            ICompraDAO comprasDAO = fabrica.getComprasDAO();
            return comprasDAO.consultar(id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Compra> consultarTodasCompras() {
        try {
            ICompraDAO comprasDAO = fabrica.getComprasDAO();
            return comprasDAO.consultarTodos();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Compra> buscarComprasEntreFechas(Calendar inicio, Calendar fin) {
        try {
            ICompraDAO comprasDAO = fabrica.getComprasDAO();
            return comprasDAO.buscarEntre(inicio, fin);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Compra> buscarComprasEntreFechasYProveedor(Calendar inicio, Calendar fin, Proveedor proveedor) {
        try {
            ICompraDAO comprasDAO = fabrica.getComprasDAO();
            return comprasDAO.buscarEntreProveedores(inicio, fin, proveedor);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Producto> consultarProductosCoincidencias(Object[] parametros) {
        try {
            IProductosDAO productosDAO = fabrica.getProductosDAO();
            return productosDAO.consultarProductosCoincidencias(parametros);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Producto consultarCodigo(long codigo) {
        try {
            IProductosDAO productosDAO = fabrica.getProductosDAO();
            return productosDAO.consultarCodigo(codigo);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Producto consultarProducto(int id) {
        try {
            IProductosDAO productosDAO = fabrica.getProductosDAO();
            return productosDAO.consultar(id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean agregarProducto(Producto producto) {
        try {
            IProductosDAO productosDAO = fabrica.getProductosDAO();
            return productosDAO.agregar(producto);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean actualizarProducto(Producto producto) {
        try {
            IProductosDAO productosDAO = fabrica.getProductosDAO();
            return productosDAO.actualizar(producto);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean eliminarProducto(int id) {
        try {
            IProductosDAO productosDAO = fabrica.getProductosDAO();
            return productosDAO.eliminar(id);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Producto> buscarProductosPorNombre(String nombre) {
        try {
            IProductosDAO productosDAO = fabrica.getProductosDAO();
            return productosDAO.consultarPorNombre(nombre);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Producto> consultarTodosProductos() {
        try {
            IProductosDAO productosDAO = fabrica.getProductosDAO();
            return productosDAO.consultarTodos();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean agregarUsuario(Usuario usuario) {
        try {
            IUsuariosDAO usuariosDAO = fabrica.getUsuariosDAO();
            return usuariosDAO.agregar(usuario);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean actualizarUsuario(Usuario usuario) {
        try {
            IUsuariosDAO usuariosDAO = fabrica.getUsuariosDAO();
            return usuariosDAO.actualizar(usuario);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean iniciarSesion(Usuario usuario) {
        try {
            IUsuariosDAO usuariosDAO = fabrica.getUsuariosDAO();
            return usuariosDAO.iniciarSesion(usuario);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean eliminarUsuario(int id) {
        try {
            IUsuariosDAO usuariosDAO = fabrica.getUsuariosDAO();
            return usuariosDAO.eliminar(id);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Usuario consultarUsuario(int id) {
        try {
            IUsuariosDAO usuariosDAO = fabrica.getUsuariosDAO();
            return usuariosDAO.consultar(id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Usuario> consultarTodosUsuarios() {
        try {
            IUsuariosDAO usuariosDAO = fabrica.getUsuariosDAO();
            return usuariosDAO.consultarTodos();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean agregarMerma(Merma merma) {
        try {
            IMermaDAO mermasDAO = fabrica.getMermasDAO();
            return mermasDAO.agregar(merma);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Merma consultarMerma(int id) {
        try {
            IMermaDAO mermasDAO = fabrica.getMermasDAO();
            return mermasDAO.consultar(id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Merma> consultarTodasMermas() {
        try {
            IMermaDAO mermasDAO = fabrica.getMermasDAO();
            return mermasDAO.consultarTodos();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<Merma> buscarMermasEntreFechas(Calendar inicio, Calendar fin) {
        try {
            IMermaDAO mermasDAO = fabrica.getMermasDAO();
            return mermasDAO.buscarEntre(inicio, fin);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Usuario obtenerSesion(Usuario usuario) {
        try {
            IUsuariosDAO usuariosDAO = fabrica.getUsuariosDAO();
            return usuariosDAO.obtenerSesion(usuario);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<DetalleVenta> consultarTodas(int idVenta) {
        try {
            IDetalleVentasDAO ventasDAO = fabrica.getDetalleVentasDAO();
            return ventasDAO.consultarTodas(idVenta);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<DetalleVenta> consultarTodasDetallesVentas() {
        try {
            IDetalleVentasDAO ventasDAO = fabrica.getDetalleVentasDAO();
            return ventasDAO.consultarTodos();
        } catch (Exception e) {
            return null;
        }
    }

}

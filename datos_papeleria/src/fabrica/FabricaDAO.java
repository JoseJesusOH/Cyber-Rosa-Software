package fabrica;

import implementaciones.*;
import conexion.ConexionBD;
import interfaces.ICajasDAO;
import interfaces.ICategoriasDAO;
import interfaces.IClientesDAO;
import interfaces.ICompraDAO;
import interfaces.IConexionBD;
import interfaces.IDetalleCompraDAO;
import interfaces.IDetalleMermaDAO;
import interfaces.IDetalleVentasDAO;
import interfaces.IGastosDAO;
import interfaces.IMermaDAO;
import interfaces.IProductosDAO;
import interfaces.IProveedoresDAO;
import interfaces.IUsuariosDAO;
import interfaces.IVentasDAO;

public class FabricaDAO {

    private static FabricaDAO instancia;
    private ICategoriasDAO instanceCategoriasDAO;
    private IClientesDAO instanceClientesDAO;
    private IProductosDAO instancePRoductosDAO;
    private IProveedoresDAO instanceProveedoresDAO;
    private IUsuariosDAO instanceUsuariosDAO;
    private IVentasDAO instanceVentasDAO;
    private IMermaDAO instanceMermasDAO;
    private ICompraDAO instanceComprasDAO;
    private final IConexionBD instanceConexionBD;
    private IDetalleVentasDAO instanceDetalleVentasDAO;
    private IDetalleCompraDAO instanceDetalleCompraDAO;
    private IDetalleMermaDAO instanceDetalleMermaDAO;
    private ICajasDAO instanceCajaDAO;
    private IGastosDAO instanceGastosDAO;

    private FabricaDAO() {
        instanceConexionBD = new ConexionBD();

    }

    public static FabricaDAO getInstancia() {
        if (instancia == null) {
            instancia = new FabricaDAO();
        }
        return instancia;
    }

    public ICajasDAO getCajasDAO() {
        if (instanceCajaDAO == null) {
            instanceCajaDAO = new CajasDAO(instanceConexionBD);
        }
        return instanceCajaDAO;
    }

    public IGastosDAO getGastosDAO() {
        if (instanceGastosDAO == null) {
            instanceGastosDAO = new GastosDAO(instanceConexionBD);
        }
        return instanceGastosDAO;
    }

    public IDetalleVentasDAO getDetalleVentasDAO() {
        if (instanceDetalleVentasDAO == null) {
            instanceDetalleVentasDAO = new DetalleVentasDAO(instanceConexionBD);
        }
        return instanceDetalleVentasDAO;
    }

    public IDetalleCompraDAO getDetalleCompraDAO() {
        if (instanceDetalleCompraDAO == null) {
            instanceDetalleCompraDAO = new DetalleComprasDAO(instanceConexionBD);
        }
        return instanceDetalleCompraDAO;
    }

    public IDetalleMermaDAO getDetalleMermaDAO() {
        if (instanceDetalleMermaDAO == null) {
            instanceDetalleMermaDAO = new DetalleMermasDAO(instanceConexionBD);
        }
        return instanceDetalleMermaDAO;
    }

    public ICategoriasDAO getCategoriasDAO() {
        if (instanceCategoriasDAO == null) {
            instanceCategoriasDAO = new CategoriasDAO(instanceConexionBD);
        }
        return instanceCategoriasDAO;
    }

    public IClientesDAO getClientesDAO() {
        if (instanceClientesDAO == null) {
            instanceClientesDAO = new ClientesDAO(instanceConexionBD);
        }
        return instanceClientesDAO;
    }

    public IProductosDAO getProductosDAO() {

        if (instancePRoductosDAO == null) {
            instancePRoductosDAO = new ProductosDAO(instanceConexionBD);
        }

        return instancePRoductosDAO;
    }

    public IProveedoresDAO getProveedoresDAO() {
        if (instanceProveedoresDAO == null) {
            instanceProveedoresDAO = new ProveedoresDAO(instanceConexionBD);
        }
        return instanceProveedoresDAO;
    }

    public IUsuariosDAO getUsuariosDAO() {
        if (instanceUsuariosDAO == null) {
            instanceUsuariosDAO = new UsuariosDAO(instanceConexionBD);
        }
        return instanceUsuariosDAO;
    }

    public IVentasDAO getVentasDAO() {
        if (instanceVentasDAO == null) {
            instanceVentasDAO = new VentasDAO(instanceConexionBD);
        }
        return instanceVentasDAO;
    }
    
    public IMermaDAO getMermasDAO() {
        if (instanceMermasDAO == null) {
            instanceMermasDAO = new MermasDAO(instanceConexionBD);
        }
        return instanceMermasDAO;
    }
    
    public ICompraDAO getComprasDAO() {
        if (instanceComprasDAO == null) {
            instanceComprasDAO = new ComprasDAO(instanceConexionBD);
        }
        return instanceComprasDAO;
    }
}

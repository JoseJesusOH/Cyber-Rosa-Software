
package fabrica;

import implementaciones.*;

import fachada.FachadaDAO;
import interfaces.IControlCajas;
import interfaces.IControlCategorias;
import interfaces.IControlClientes;
import interfaces.IControlCompra;
import interfaces.IControlDetalleMerma;
import interfaces.IControlDetalleVentas;
import interfaces.IControlGastos;
import interfaces.IControlMerma;
import interfaces.IControlProductos;
import interfaces.IControlProveedores;
import interfaces.IControlUsuarios;
import interfaces.IControlVentas;
import interfaces.IFachadaDAO;

public class FabricaControl {

    private static FabricaControl instancia;
    private IControlCategorias instanceCategoriasDAO;
    private IControlClientes instanceClientesDAO;
    private IControlProductos instancePRoductosDAO;
    private IControlProveedores instanceProveedoresDAO;
    private IControlUsuarios instanceUsuariosDAO;
    private IControlVentas instanceVentasDAO;
    private IControlDetalleVentas instanceDetalleVentasDAO;
    private IControlCompra instanceDetalleCompraDAO;
    private IControlCajas instanceCajaDAO;
private IControlGastos instanceGastosDAO;
private final IFachadaDAO fachadaDAO;
    private IControlDetalleMerma instanceDetalleMermasDAO;


private IControlMerma instanceMermaDAO;
    private FabricaControl() {
        fachadaDAO=new FachadaDAO();
    }
    
      public IControlDetalleMerma getDetalleMermaDAO() {
        if (instanceDetalleMermasDAO== null) {
            instanceDetalleMermasDAO = new ControlDetalleMerma(fachadaDAO);
        }
        return instanceDetalleMermasDAO;
    }
    
     public IControlMerma getMermaDAO() {
        if (instanceMermaDAO== null) {
            instanceMermaDAO = new ControlMerma(fachadaDAO);
        }
        return instanceMermaDAO;
    }
  public IControlCajas getCajasDAO(){
      if(instanceCajaDAO==null){
          instanceCajaDAO=new ControlCajas(fachadaDAO);
      }
      return instanceCajaDAO;
  }
  public IControlGastos getGastosDAO(){
      if(instanceGastosDAO==null){
          instanceGastosDAO=new ControlGastos(fachadaDAO);
      }
      return instanceGastosDAO;
  }
    public static FabricaControl getInstancia() {
        if (instancia == null) {
            instancia = new FabricaControl();
        }
        return instancia;
    }

    public IControlDetalleVentas getDetalleVentasDAO() {
        if (instanceDetalleVentasDAO == null) {
            instanceDetalleVentasDAO = new ControlDetalleVentas(fachadaDAO);
        }
        return instanceDetalleVentasDAO;
    }

    public IControlCompra getDetalleCompraDAO() {
        if (instanceDetalleCompraDAO == null) {
            instanceDetalleCompraDAO = new ControlCompra(fachadaDAO);
        }
        return instanceDetalleCompraDAO;
    }

    public IControlCategorias getCategoriasDAO() {
        if (instanceCategoriasDAO == null) {
            instanceCategoriasDAO = new ControlCategoria(fachadaDAO);
        }
        return instanceCategoriasDAO;
    }

    public IControlClientes getClientesDAO() {
        if (instanceClientesDAO == null) {
            instanceClientesDAO = new ControlClientes(fachadaDAO);
        }
        return instanceClientesDAO;
    }

    public IControlProductos getProductosDAO() {

        if (instancePRoductosDAO == null) {
            instancePRoductosDAO = new ControlProductos(fachadaDAO);
        }

        return instancePRoductosDAO;
    }

    public IControlProveedores getProveedoresDAO() {
        if (instanceProveedoresDAO == null) {
            instanceProveedoresDAO = new ControlProveedores(fachadaDAO);
        }
        return instanceProveedoresDAO;
    }

    public IControlUsuarios getUsuariosDAO() {
        if (instanceUsuariosDAO == null) {
            instanceUsuariosDAO = new ControlUsuarios(fachadaDAO);
        }
        return instanceUsuariosDAO;
    }

    public IControlVentas getVentasDAO() {
        if (instanceVentasDAO == null) {
            instanceVentasDAO = new ControlVentas(fachadaDAO);
        }
        return instanceVentasDAO;
    }
}

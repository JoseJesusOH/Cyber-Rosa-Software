package implementaciones;

import entidades.DetalleVenta;

import interfaces.IControlDetalleVentas;
import interfaces.IFachadaDAO;
import java.util.List;

public class ControlDetalleVentas implements IControlDetalleVentas {


    private final IFachadaDAO fachadaDAO;

    public ControlDetalleVentas(IFachadaDAO fachadaDAO) {
        this.fachadaDAO=fachadaDAO;
    }
    
    @Override
    public boolean agregar(DetalleVenta venta){
      
     return this.fachadaDAO.agregarDetalleVenta(venta);
    }

    @Override
    public List<DetalleVenta> consultarTodas(int idVenta) {
        return this.fachadaDAO.consultarTodas(idVenta);
    }

    @Override
    public List<DetalleVenta> consultarTodasDetallesVentas() {
       return this.fachadaDAO.consultarTodasDetallesVentas();
    }


}

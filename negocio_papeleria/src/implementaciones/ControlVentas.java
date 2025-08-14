package implementaciones;

import entidades.Cliente;
import entidades.DetalleVenta;
import entidades.Venta;

import java.util.Calendar;
import java.util.List;

import interfaces.IControlVentas;
import interfaces.IFachadaDAO;

public class ControlVentas implements IControlVentas {

    private final IFachadaDAO fachadaDAO;

    public ControlVentas(IFachadaDAO fachadaDAO) {
        this.fachadaDAO = fachadaDAO;
    }

    @Override
    public boolean agregar(Venta venta, List<DetalleVenta> detalles) {
        int cantidad = 0;
        int stock = 0;
        try {
            this.fachadaDAO.agregarVenta(venta);
            for (int i = 0; i < detalles.size(); i++) {
                detalles.get(i).setVenta(venta);
                cantidad = detalles.get(i).getCantidad();
                stock = (int) detalles.get(i).getProducto().getStock();
                detalles.get(i).getProducto().setStock(stock - cantidad);
                this.fachadaDAO.agregarDetalleVenta(detalles.get(i));
                this.fachadaDAO.actualizarProducto(detalles.get(i).getProducto());
            }
            return true;
        } catch (Exception ex) {

        }
        return false;
    }

    @Override
    public Venta consultar(int id) {
        return this.fachadaDAO.consultarVenta(id);
    }
    public List<Venta> consultarVentasCoincidencias(Object[] parametros){
                return this.fachadaDAO.consultarVentasCoincidencias(parametros);
    }
    @Override
    public List<Venta> buscarEntre(Calendar inicio, Calendar fin) {
        return this.fachadaDAO.buscarVentasEntreFechas(inicio, fin);
    }

    @Override
    public List<Venta> buscarEntreCliente(Calendar inicio, Calendar fin, Cliente cliente) {
        return this.fachadaDAO.buscarVentasEntreFechasPorCliente(inicio, fin, cliente);
    }

    @Override
    public List<Venta> consultarTodas() {
        return this.fachadaDAO.consultarTodasVentas();
    }

}

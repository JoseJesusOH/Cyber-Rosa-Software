package implementaciones;

import entidades.Gasto;

import java.util.Calendar;
import java.util.List;
import interfaces.IControlGastos;
import interfaces.IFachadaDAO;


public class ControlGastos implements IControlGastos {

    
    private final IFachadaDAO fachadaDAO;

    public ControlGastos(IFachadaDAO fachadaDAO) {
        this.fachadaDAO=fachadaDAO;
    }

//    @Override
//    public int agregar(Gasto gasto) {
//       return this.fachadaDAO.agregarGasto(gasto);
//    }
//
//    @Override
//    public Gasto consultar(int id) {
//        return this.fachadaDAO.consultar(id);
//    }
//
//    @Override
//    public List<Gasto> consultarTodas() {
//     return this.fachadaDAO.consultarTodas();
//    }
//
//    @Override
//    public List<Gasto> buscarEntre(Calendar inicio, Calendar fin) {
//    return this.fachadaDAO.buscarGastosEntreFechas(inicio, fin);
//    }

    @Override
    public int agregar(Gasto gasto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Gasto consultar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Gasto> consultarTodas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Gasto> buscarEntre(Calendar inicio, Calendar fin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

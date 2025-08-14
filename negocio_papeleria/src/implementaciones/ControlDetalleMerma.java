/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.DetalleMerma;
import interfaces.IControlDetalleMerma;
import interfaces.IFachadaDAO;

/**
 *
 * @author josej
 */
public class ControlDetalleMerma implements IControlDetalleMerma {

    private final IFachadaDAO fachadaDAO;

    public ControlDetalleMerma(IFachadaDAO fachadaDAO) {
        this.fachadaDAO = fachadaDAO;
    }

    @Override
    public boolean agregar(DetalleMerma detalleMerma) {
        return this.fachadaDAO.agregarDetalleMerma(detalleMerma);
    }

}

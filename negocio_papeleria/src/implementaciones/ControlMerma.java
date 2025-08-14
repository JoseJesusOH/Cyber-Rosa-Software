/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.DetalleMerma;
import entidades.Merma;
import interfaces.IControlMerma;
import interfaces.IFachadaDAO;
import java.util.List;

/**
 *
 * @author josej
 */
public class ControlMerma implements IControlMerma{
    private final IFachadaDAO fachadaDAO;

    public ControlMerma (IFachadaDAO fachadaDAO) {
        this.fachadaDAO = fachadaDAO;
    }
    @Override
    public boolean agregar(Merma merma, List<DetalleMerma> detalles) {
    return fachadaDAO.agregarMerma(merma);
    }

    @Override
    public Merma consultar(int id) {
          return fachadaDAO.consultarMerma(id);
    }

    @Override
    public List<Merma> consultarTodas() {
          return fachadaDAO.consultarTodasMermas();
    }
    
}

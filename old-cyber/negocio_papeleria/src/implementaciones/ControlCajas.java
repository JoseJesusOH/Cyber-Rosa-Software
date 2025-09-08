package implementaciones;

import entidades.Caja;

import java.util.List;
import interfaces.IControlCajas;
import interfaces.IFachadaDAO;

public class ControlCajas implements IControlCajas {

   
 private final IFachadaDAO fachadaDAO;
    public ControlCajas(IFachadaDAO fachadaDAO) {
        this.fachadaDAO=fachadaDAO;
    }
    
    
    public Caja cajaAbierta(){
          return this.fachadaDAO.cajaAbierta();
    }
    
    @Override
    public boolean agregar(Caja caja) {
  return this.fachadaDAO.agregarCaja(caja);
    }

    @Override
    public boolean actualizar(Caja caja) {
       return this.fachadaDAO.actualizarCaja(caja);
    }

    @Override
    public boolean eliminar(int id) {
       return this.fachadaDAO.eliminarCaja(id);
    }

    @Override
    public Caja consultar(int id) {
       return this.fachadaDAO.consultarCaja(id);
    }

    @Override
    public List<Caja> consultarTodos() {
      return this.fachadaDAO.consultarCajas();
    }
}

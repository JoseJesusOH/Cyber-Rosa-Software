package implementaciones;

import entidades.DetalleCompra;
import interfaces.IConexionBD;
import javax.persistence.EntityManager;
import interfaces.IDetalleCompraDAO;

public class DetalleComprasDAO implements IDetalleCompraDAO {

   private final IConexionBD conexion;
    
    
    public DetalleComprasDAO(IConexionBD conexion){
        this.conexion = conexion;
    }

    @Override
    public boolean agregar(DetalleCompra detalleCompra) {
       try{
           EntityManager em = this.conexion.crearConexion();
           em.getTransaction().begin();

           em.persist(detalleCompra);

           em.getTransaction().commit();
           return true;
       }catch (IllegalStateException ise){
           System.err.println("No fue posible guardar la venta.");
           return false;
       }}

 


}

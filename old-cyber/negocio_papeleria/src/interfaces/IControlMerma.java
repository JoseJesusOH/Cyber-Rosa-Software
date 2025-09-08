/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import entidades.DetalleMerma;
import entidades.Merma;
import java.util.List;

/**
 *
 * @author josej
 */
public  interface IControlMerma {
       boolean agregar(Merma merma,List<DetalleMerma> detalles);
    
    Merma consultar(int id);
        List<Merma> consultarTodas();
}
//
//    
//    List<Venta> buscarEntre(Calendar inicio , Calendar fin);   
//    
//    List<Venta> buscarEntreCliente(Calendar inicio, Calendar fin, Cliente cliente);
//    

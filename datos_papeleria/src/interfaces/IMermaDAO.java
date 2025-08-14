package interfaces;


import entidades.Merma;
import java.util.Calendar;
import java.util.List;

public interface IMermaDAO  {
    
    
    boolean agregar(Merma t);



    Merma consultar(int id);

    List<Merma> consultarTodos();
    
    public Merma consultarUltimaMerma() ;
    List<Merma> buscarEntre(Calendar inicio, Calendar fin);
}

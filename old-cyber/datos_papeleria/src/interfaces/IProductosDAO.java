package interfaces;

import entidades.Producto;
import java.util.List;

public interface IProductosDAO extends IDAO<Producto> {

    List<Producto> consultarPorNombre(String nombre);

    Producto consultarCodigo(long codigo);

    List<Producto> consultarProductosCoincidencias(Object[] parametros);
}

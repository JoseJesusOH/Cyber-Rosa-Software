package implementaciones;

import entidades.Cliente;
import entidades.DetalleVenta;
import entidades.Producto;
import entidades.Venta;
import interfaces.IConexionBD;
import interfaces.IVentasDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Subquery;

public class VentasDAO implements IVentasDAO {

    private final IConexionBD conexion;

    public VentasDAO(IConexionBD conexion) {
        this.conexion = conexion;

    }

    @Override
    public boolean agregar(Venta venta) {

        EntityManager em = this.conexion.crearConexion();

        try {

            em.getTransaction().begin();
            em.persist(venta);
            em.getTransaction().commit();

            return true;

        } catch (IllegalStateException ise) {
            System.err.println("No fue posible guardar la venta");
            return false;
        }
    }

    @Override
    public Venta consultar(int id) {
        EntityManager em = this.conexion.crearConexion();

        try {

            Venta venta = em.find(Venta.class, id);

            return venta;
        } catch (IllegalStateException ise) {
            System.err.println("No fue posible consultar la venta");
            return null;
        }
    }

    @Override
    public List<Venta> consultarTodos() {
        List<Venta> ventas = null;
        EntityManager em = conexion.crearConexion();

        try {

            em.getTransaction().begin();

            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<Venta> criteria = builder.createQuery(Venta.class);
            TypedQuery<Venta> query = em.createQuery(criteria);

            ventas = query.getResultList();

            em.getTransaction().commit();
        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar todas las ventas");
            return null;
        }

        return ventas;
    }

    @Override
    public List<Venta> buscarEntreCliente(Calendar inicio, Calendar fin, Cliente cliente) {
        List<Venta> ventas = null;
        EntityManager em = conexion.crearConexion();

        try {

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String fechaInicio = dateFormat.format(inicio.getTimeInMillis());

            String fechaFin = dateFormat.format(fin.getTimeInMillis());

            return em.createQuery(String.format("SELECT v FROM Venta v WHERE v.fecha >= '%s' AND v.fecha <= '%s' AND v.cliente.id = %d", fechaInicio, fechaFin, cliente.getId())).getResultList();

        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar las ventas del cliente en la fecha dada");
            return null;
        }
    }

    @Override
    public List<Venta> consultarVentasCoincidencias(Object[] parametros) {
        List<Venta> ventas = null;
        EntityManager em = conexion.crearConexion();

        try {
            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<Venta> criteria = builder.createQuery(Venta.class);
            Root<Venta> ventaRoot = criteria.from(Venta.class);
            criteria.select(ventaRoot);

            List<Predicate> condiciones = new ArrayList<>();

            if (parametros[0] != null) {
                // Filtra por cliente
                condiciones.add(builder.equal(ventaRoot.get("cliente").get("id"), (int) parametros[0]));
            }

            if (parametros[2] != null) {
                // Filtra por fecha (incluyendo hora)
                condiciones.add(builder.greaterThanOrEqualTo(ventaRoot.get("fecha"), (Date) parametros[2]));
            }

            if (parametros[3] != null && parametros[4] != null) {
                // Filtra por rango de fechas (incluyendo hora)
                condiciones.add(builder.between(ventaRoot.get("fecha"), (Date) parametros[3], (Date) parametros[4]));
            }

            criteria.where(condiciones.toArray(new Predicate[0]));

            TypedQuery<Venta> query = em.createQuery(criteria);
            ventas = query.getResultList();
            List<Venta> ventas2 = new ArrayList<>();

            if (parametros[1] != null && ventas != null) {
                Producto producto = (Producto) parametros[1];
                for (int i = 0; i < ventas.size(); i++) {
                    Venta get = ventas.get(i);
                    List<DetalleVenta> detalles = get.getDetalleVentas();
                    for (int j = 0; j < detalles.size(); j++) {
                        DetalleVenta get1 = detalles.get(j);
                        if (get1.getProducto().getId() == producto.getId()) {
                            ventas2.add(get);
                            break;
                        }
                    }
                }
                if (ventas2.isEmpty()) {
                    return null;
                }
                return ventas2;

            }
       
            return ventas;
        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar ventas con coincidencias");
            return null;
        }

    }

    @Override
    public List<Venta> buscarEntre(Calendar inicio, Calendar fin) {
        List<Venta> ventas = null;
        EntityManager em = conexion.crearConexion();

        try {
            // Utiliza directamente los objetos Calendar para obtener las fechas
            Date fechaInicio = inicio.getTime();
            Date fechaFin = fin.getTime();

            // Utiliza parámetros en la consulta JPQL para prevenir inyección SQL
            String jpql = "SELECT v FROM Venta v WHERE v.fecha >= :fechaInicio AND v.fecha <= :fechaFin";

            return em.createQuery(jpql, Venta.class)
                    .setParameter("fechaInicio", fechaInicio)
                    .setParameter("fechaFin", fechaFin)
                    .getResultList();
        } catch (IllegalStateException ex) {
            System.err.println("No se pudieron consultar las ventas entre las fechas dadas");
            return null;
        }
    }

}

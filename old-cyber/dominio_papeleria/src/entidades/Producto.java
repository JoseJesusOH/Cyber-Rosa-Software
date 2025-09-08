package entidades;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto implements Serializable {

   @Column(name = "utilidad", nullable = false)
    private float utilidad;

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "descripcion", nullable = false, length = 200)
    private String descripcion;

    @Column(name = "marca", nullable = false, length = 20)
    private String marca;

    @Column(name = "codigo", nullable = false, length = 15)
    private long codigo;

    @Column(name = "stock", nullable = false)
    private float stock;

    @Column(name = "precio", nullable = false)
    private float precio;

    @Column(name = "costo", nullable = false)
    private float costo;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idCategoria", nullable = false)
    private Categoria categoria;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "producto")
    private List<DetalleCompra> detalleCompras;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "producto")
    private List<DetalleVenta> detalleVentas;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "producto")
    private List<DetalleMerma> detalleMerma;
    
    
    public Producto() {
    }
    public Producto(Integer id) {
        this.id = id;
    }

    public Producto(Integer id, String nombre, String descripcion, String marca, long codigo, float stock, float precio, float costo, Categoria categoria, List<DetalleCompra> detalleCompras, List<DetalleVenta> detalleVentas, List<DetalleMerma> detalleMerma,float utilidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
        this.costo = costo;
        this.categoria = categoria;
        this.detalleCompras = detalleCompras;
        this.detalleVentas = detalleVentas;
        this.detalleMerma = detalleMerma;
        this.utilidad=utilidad;
    }

    public Producto(String nombre, String descripcion, String marca, long codigo, float stock, float precio, float costo, Categoria categoria, List<DetalleCompra> detalleCompras, List<DetalleVenta> detalleVentas, List<DetalleMerma> detalleMerma,float utilidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
        this.costo = costo;
        this.categoria = categoria;
        this.detalleCompras = detalleCompras;
        this.detalleVentas = detalleVentas;
        this.detalleMerma = detalleMerma;
                this.utilidad=utilidad;

    }

    public Producto(String nombre, String descripcion, String marca, long codigo, float stock, float precio, float costo, Categoria categoria,float utilidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
        this.costo = costo;
        this.categoria = categoria;
           this.utilidad=utilidad;

    }

    public Producto(Integer id, String nombre, String descripcion, String marca, long codigo, float stock, float precio, float costo, Categoria categoria,float utilidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
        this.costo = costo;
        this.categoria = categoria;
                this.utilidad=utilidad;

    }

    public Producto(String nombre, String descripcion, String marca, long codigo, float stock, float precio, float costo, Categoria categoria, List<DetalleCompra> detalleCompras,float utilidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
        this.costo = costo;
        this.categoria = categoria;
        this.detalleCompras = detalleCompras;
                this.utilidad=utilidad;

    }

    public Producto(Integer id, String nombre, String descripcion, String marca, long codigo, float stock, float precio, float costo, Categoria categoria, List<DetalleCompra> detalleCompras,float utilidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
        this.costo = costo;
        this.categoria = categoria;
        this.detalleCompras = detalleCompras;
    }

    public Producto(Integer id, String nombre, String descripcion, String marca, long codigo, float stock, float precio, float costo, Categoria categoria, List<DetalleCompra> detalleCompras, List<DetalleVenta> detalleVentas,float utilidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
        this.costo = costo;
        this.categoria = categoria;
        this.detalleCompras = detalleCompras;
        this.detalleVentas = detalleVentas;
                this.utilidad=utilidad;

    }

    public Producto(String nombre, String descripcion, String marca, long codigo, float stock, float precio, float costo, Categoria categoria, List<DetalleCompra> detalleCompras, List<DetalleVenta> detalleVentas,float utilidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.marca = marca;
        this.codigo = codigo;
        this.stock = stock;
        this.precio = precio;
        this.costo = costo;
        this.categoria = categoria;
        this.detalleCompras = detalleCompras;
        this.detalleVentas = detalleVentas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<DetalleCompra> getDetalleCompras() {
        return detalleCompras;
    }

    public void setDetalleCompras(List<DetalleCompra> detalleCompras) {
        this.detalleCompras = detalleCompras;
    }

    public List<DetalleVenta> getDetalleVentas() {
        return detalleVentas;
    }

    public void setDetalleVentas(List<DetalleVenta> detalleVentas) {
        this.detalleVentas = detalleVentas;
    }

    public List<DetalleMerma> getDetalleMerma() {
        return detalleMerma;
    }

    public void setDetalleMerma(List<DetalleMerma> detalleMerma) {
        this.detalleMerma = detalleMerma;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return nombre;
    }

    public float getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(float utilidad) {
        this.utilidad = utilidad;
    }

}

package entidades;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "detallecompras")

public class DetalleCompra implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
   
    
    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    
    @Column(name = "precioCompra", nullable = false)
    private float precioCompra;
    
    @Column(name = "importe", nullable = false)
    private float importe;
     
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idProducto", nullable = false)
    private Producto producto;
    
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idCompra", nullable = false)
    private Compra compra;

    public DetalleCompra() {
    }

    public DetalleCompra(int cantidad, float precioCompra, float importe) {
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.importe = importe;
    }

    public DetalleCompra(Integer id, int cantidad, float precioCompra, float importe) {
        this.id = id;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.importe = importe;
    }

    public DetalleCompra(int cantidad, float precioCompra, float importe, Producto producto) {
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.importe = importe;
        this.producto = producto;
    }

    public DetalleCompra(int cantidad, float precioCompra, float importe, Producto producto, Compra compra) {
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.importe = importe;
        this.producto = producto;
        this.compra = compra;
    }

    public DetalleCompra(Integer id, int cantidad, float precioCompra, float importe, Producto producto, Compra compra) {
        this.id = id;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.importe = importe;
        this.producto = producto;
        this.compra = compra;
    }

    public DetalleCompra(Integer id, int cantidad, float precioCompra, float importe, Producto producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.importe = importe;
        this.producto = producto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final DetalleCompra other = (DetalleCompra) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return id.toString();
    }

    
}
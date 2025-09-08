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
@Table(name = "detallemermas")

public class DetalleMerma implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @Column(name = "costo", nullable = false)
    private float costo;

    @Column(name = "importe", nullable = false)
    private float importe;
    @Column(name = "motivo", nullable = false, length = 100)
    private String motivo;
    


    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idProducto", nullable = false)
    private Producto producto;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idMerma", nullable = false)
    private Merma merma;

    public DetalleMerma() {
    }

    public DetalleMerma(int cantidad, float costo, float importe, Producto producto, Merma merma,String motivo) {
        this.cantidad = cantidad;
        this.costo = costo;
        this.importe = importe;
        this.producto = producto;
        this.merma = merma;
        this.motivo=motivo;
    }

    public DetalleMerma(Integer id, int cantidad, float costo, float importe, Producto producto, Merma merma,String motivo) {
        this.id = id;
        this.cantidad = cantidad;
        this.costo = costo;
        this.importe = importe;
        this.producto = producto;
        this.merma = merma;
           this.motivo=motivo;
    }

    public DetalleMerma(int cantidad, float costo, float importe) {
        this.cantidad = cantidad;
        this.costo = costo;
        this.importe = importe;
    }

    public DetalleMerma(Integer id, int cantidad, float costo, float importe) {
        this.id = id;
        this.cantidad = cantidad;
        this.costo = costo;
        this.importe = importe;
    }

    public DetalleMerma(Integer id, int cantidad, float costo, float importe, Producto producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.costo = costo;
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

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
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

    public Merma getMerma() {
        return merma;
    }

    public void setMerma(Merma merma) {
        this.merma = merma;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final DetalleMerma other = (DetalleMerma) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "DetalleMerma{" + "id=" + id + ", cantidad=" + cantidad + ", costo=" + costo + ", importe=" + importe + ", motivo=" + motivo + ", producto=" + producto + ", merma=" + merma + '}';
    }

}
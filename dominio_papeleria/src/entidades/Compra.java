package entidades;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "compras")
public class Compra implements Serializable {

    @Basic(optional = false)
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    private int numFactura;
    @Basic(optional = false)
    @Temporal(TemporalType.TIME)
    private Date hora;

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "totalCompra", nullable = false)
    private float totalCompra;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idProveedor", nullable = false)
    private Proveedor proveedor;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "compra")
    private List<DetalleCompra> detalleCompras;

    public Compra() {
    }

    public Compra(Integer numFactura, Calendar fecha, float totalCompra) {
        this.numFactura = numFactura;
        this.fecha = fecha.getTime();
        this.totalCompra = totalCompra;
    }

    public Compra(Integer id, Integer numFactura, Calendar fecha, float totalCompra) {
        this.id = id;
        this.numFactura = numFactura;
        this.fecha = fecha.getTime();
        this.totalCompra = totalCompra;
    }

    public Compra(Integer numFactura, Calendar fecha, float totalCompra, Proveedor proveedor) {
        this.numFactura = numFactura;
        this.fecha = fecha.getTime();
        this.totalCompra = totalCompra;
        this.proveedor = proveedor;
    }

    public Compra(Integer numFactura, Calendar fecha, float totalCompra, Proveedor proveedor, List<DetalleCompra> detalleCompras) {
        this.numFactura = numFactura;
        this.fecha = fecha.getTime();
        this.totalCompra = totalCompra;
        this.proveedor = proveedor;
        this.detalleCompras = detalleCompras;
    }

    public Compra(Integer id, Integer numFactura, Calendar fecha, float totalCompra, Proveedor proveedor) {
        this.id = id;
        this.numFactura = numFactura;
        this.fecha = fecha.getTime();
        this.totalCompra = totalCompra;
        this.proveedor = proveedor;
    }

    public Compra(Integer id, Integer numFactura, Calendar fecha, float totalCompra, Proveedor proveedor, List<DetalleCompra> detalleCompras) {
        this.id = id;
        this.numFactura = numFactura;
        this.fecha = fecha.getTime();
        this.totalCompra = totalCompra;
        this.proveedor = proveedor;
        this.detalleCompras = detalleCompras;
    }

    
    
    public Compra(Integer numFactura, Calendar fecha,  float totalCompra,Calendar hora) {
    this.numFactura = numFactura;
    this.fecha = fecha.getTime();
    this.hora = hora.getTime();
    this.totalCompra = totalCompra;
}

public Compra(Integer id, Integer numFactura, Calendar fecha,  float totalCompra,Calendar hora) {
    this.id = id;
    this.numFactura = numFactura;
    this.fecha = fecha.getTime();
    this.hora = hora.getTime();
    this.totalCompra = totalCompra;
}

public Compra(Integer numFactura, Calendar fecha, float totalCompra, Proveedor proveedor,Calendar hora) {
    this.numFactura = numFactura;
    this.fecha = fecha.getTime();
    this.hora = hora.getTime();
    this.totalCompra = totalCompra;
    this.proveedor = proveedor;
}

public Compra(Integer numFactura, Calendar fecha,  float totalCompra, Proveedor proveedor, List<DetalleCompra> detalleCompras,Calendar hora) {
    this.numFactura = numFactura;
    this.fecha = fecha.getTime();
    this.hora = hora.getTime();
    this.totalCompra = totalCompra;
    this.proveedor = proveedor;
    this.detalleCompras = detalleCompras;
}

public Compra(Integer id, Integer numFactura, Calendar fecha,float totalCompra, Proveedor proveedor ,Calendar hora) {
    this.id = id;
    this.numFactura = numFactura;
    this.fecha = fecha.getTime();
    this.hora = hora.getTime();
    this.totalCompra = totalCompra;
    this.proveedor = proveedor;
}

public Compra(Integer id, Integer numFactura, Calendar fecha, float totalCompra, Proveedor proveedor, List<DetalleCompra> detalleCompras,Calendar hora) {
    this.id = id;
    this.numFactura = numFactura;
    this.fecha = fecha.getTime();
    this.hora = hora.getTime();
    this.totalCompra = totalCompra;
    this.proveedor = proveedor;
    this.detalleCompras = detalleCompras;
}

    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public float getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(float totalCompra) {
        this.totalCompra = totalCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<DetalleCompra> getDetalleCompras() {
        return detalleCompras;
    }

    public void setDetalleCompras(List<DetalleCompra> detalleCompras) {
        this.detalleCompras = detalleCompras;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.id);
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
        final Compra other = (Compra) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", numFactura=" + numFactura + ", fecha=" + fecha + ", totalCompra=" + totalCompra + ", proveedor=" + proveedor + ", detalleCompras=" + detalleCompras + '}';
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

        
}

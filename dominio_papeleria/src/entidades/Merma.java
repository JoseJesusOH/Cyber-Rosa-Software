package entidades;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
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
@Table(name = "mermas")
public class Merma implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fechaMerma", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaMerma;

    @Column(name = "totalMerma", nullable = false)
    private float totalventa;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "merma")
    private List<DetalleMerma> detalleMermas;

    public Merma() {
    }

    public Merma(Calendar fechaMerma, float totalventa, Usuario usuario, List<DetalleMerma> detalleMermas) {
        this.fechaMerma = fechaMerma;
        this.totalventa = totalventa;
        this.usuario = usuario;
        this.detalleMermas = detalleMermas;
    }

    public Merma(Integer id, Calendar fechaMerma, float totalventa, Usuario usuario, List<DetalleMerma> detalleMermas) {
        this.id = id;
        this.fechaMerma = fechaMerma;
        this.totalventa = totalventa;
        this.usuario = usuario;
        this.detalleMermas = detalleMermas;
    }

    public Merma(Calendar fechaMerma, float totalventa, Usuario usuario) {
        this.fechaMerma = fechaMerma;
        this.totalventa = totalventa;
        this.usuario = usuario;
    }

    public Merma(Integer id, Calendar fechaMerma, float totalventa, Usuario usuario) {
        this.id = id;
        this.fechaMerma = fechaMerma;
        this.totalventa = totalventa;
        this.usuario = usuario;
    }

    public Merma(Integer id, Calendar fechaMerma, float totalventa, List<DetalleMerma> detalleMermas) {
        this.id = id;
        this.fechaMerma = fechaMerma;
        this.totalventa = totalventa;
        this.detalleMermas = detalleMermas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getFechaMerma() {
        return fechaMerma;
    }

    public void setFechaMerma(Calendar fechaMerma) {
        this.fechaMerma = fechaMerma;
    }

    public float getTotalventa() {
        return totalventa;
    }

    public void setTotalventa(float totalventa) {
        this.totalventa = totalventa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<DetalleMerma> getDetalleMermas() {
        return detalleMermas;
    }

    public void setDetalleMermas(List<DetalleMerma> detalleMermas) {
        this.detalleMermas = detalleMermas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.id);
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
        final Merma other = (Merma) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return id.toString();
    }

    
    
}
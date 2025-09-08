
package entidades;

import java.io.Serializable;
import java.util.Calendar;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "gastos")
public class Gasto implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "fechaGasto", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaGasto;
    
    @Column(name = "concepto", nullable = false, length = 45)
    private String concepto;
    
    @Column(name = "costo", nullable = false)
    private float costo;
    
    @Column(name = "autoriza", nullable = false, length = 45)
    private String autoriza;
    
   
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idCaja", nullable = false)
    private Caja caja;

    public Gasto() {
    }

    public Gasto(Integer id) {
        this.id = id;
    }

    public Gasto(Calendar fechaGasto, String concepto, float costo, String autoriza) {
        this.fechaGasto = fechaGasto;
        this.concepto = concepto;
        this.costo = costo;
        this.autoriza = autoriza;
    }

    public Gasto(Integer id, Calendar fechaGasto, String concepto, float costo, String autoriza) {
        this.id = id;
        this.fechaGasto = fechaGasto;
        this.concepto = concepto;
        this.costo = costo;
        this.autoriza = autoriza;
    }
    
    

    public Gasto(Calendar fechaGasto, String concepto, float costo, String autoriza, Caja caja) {
        this.fechaGasto = fechaGasto;
        this.concepto = concepto;
        this.costo = costo;
        this.autoriza = autoriza;
        this.caja = caja;
    }

    public Gasto(Integer id, Calendar fechaGasto, String concepto, float costo, String autoriza, Caja caja) {
        this.id = id;
        this.fechaGasto = fechaGasto;
        this.concepto = concepto;
        this.costo = costo;
        this.autoriza = autoriza;
        this.caja = caja;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getFechaGasto() {
        return fechaGasto;
    }

    public void setFechaGasto(Calendar fechaGasto) {
        this.fechaGasto = fechaGasto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getAutoriza() {
        return autoriza;
    }

    public void setAutoriza(String autoriza) {
        this.autoriza = autoriza;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Gasto other = (Gasto) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Gasto{" + "id=" + id + ", fechaGasto=" + fechaGasto + ", concepto=" + concepto + ", costo=" + costo + ", autoriza=" + autoriza + ", caja=" + caja + '}';
    }
    

}
package entidades;

import enumeradores.Estado;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = "cajas")
public class Caja implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fechaApertura", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaApertura;

    @Column(name = "fechaCierre")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar fechaCierre;

    @Column(name = "saldoInicial", nullable = false)
    private float saldoInicial;
    
    @Column(name = "saldoCierre", nullable = false)
    private float saldoCierre;
    
    @Column(name = "totalIngresos", nullable = false)
    private float totalIngresos;
    
    @Column(name = "totalGastos", nullable = false)
    private float totalGastos;
    
    @Column(name = "estado", nullable = false, length = 8)
    @Enumerated (EnumType.STRING)
    private Estado estado;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "caja")
    private List<Gasto> gastos;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "caja")
    private List<Venta> ventas;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    public Caja() {
    }
 public Caja(Integer id) {
this.id=id;
    }

    public Caja(Calendar fechaApertura, float saldoInicial, float saldoCierre, float totalIngresos, float totalGastos, Estado estado, Usuario usuario) {
        
        this.fechaApertura = fechaApertura;
        this.saldoInicial = saldoInicial;
        this.saldoCierre = saldoCierre;
        this.totalIngresos = totalIngresos;
        this.totalGastos = totalGastos;
        this.estado = estado;
        this.usuario = usuario;
    }




    public Caja(Calendar fechaApertura, Calendar fechaCierre, float saldoInicial, float saldoCierre, float totalIngresos, float totalGastos, Estado estado, Usuario usuario) {
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.saldoInicial = saldoInicial;
        this.saldoCierre = saldoCierre;
        this.totalIngresos = totalIngresos;
        this.totalGastos = totalGastos;
        this.estado = estado;
        this.usuario = usuario;
    }

    public Caja(Integer id, Calendar fechaApertura, Calendar fechaCierre, float saldoInicial, float saldoCierre, float totalIngresos, float totalGastos, Estado estado, Usuario usuario) {
        this.id = id;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.saldoInicial = saldoInicial;
        this.saldoCierre = saldoCierre;
        this.totalIngresos = totalIngresos;
        this.totalGastos = totalGastos;
        this.estado = estado;
        this.usuario = usuario;
    }

    public Caja(Calendar fechaApertura, Calendar fechaCierre, float saldoInicial, float saldoCierre, float totalIngresos, float totalGastos, Estado estado, List<Venta> ventas, Usuario usuario) {
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.saldoInicial = saldoInicial;
        this.saldoCierre = saldoCierre;
        this.totalIngresos = totalIngresos;
        this.totalGastos = totalGastos;
        this.estado = estado;
        this.ventas = ventas;
        this.usuario = usuario;
    }

    public Caja(Integer id, Calendar fechaApertura, Calendar fechaCierre, float saldoInicial, float saldoCierre, float totalIngresos, float totalGastos, Estado estado, List<Venta> ventas, Usuario usuario) {
        this.id = id;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.saldoInicial = saldoInicial;
        this.saldoCierre = saldoCierre;
        this.totalIngresos = totalIngresos;
        this.totalGastos = totalGastos;
        this.estado = estado;
        this.ventas = ventas;
        this.usuario = usuario;
    }

public Caja( Estado estado,Calendar fechaApertura, Calendar fechaCierre, float saldoCierre,float saldoInicial, float totalGastos, float totalIngresos,  Integer id) {
        this.id = id;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.saldoInicial = saldoInicial;
        this.saldoCierre = saldoCierre;
        this.totalIngresos = totalIngresos;
        this.totalGastos = totalGastos;
        this.estado = estado;
       
    }

public Caja( Estado estado,Calendar fechaApertura, Calendar fechaCierre, float saldoCierre,float saldoInicial, float totalGastos, float totalIngresos,  Usuario usuario) {
       
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.saldoInicial = saldoInicial;
        this.saldoCierre = saldoCierre;
        this.totalIngresos = totalIngresos;
        this.totalGastos = totalGastos;
        this.estado = estado;
        this.usuario=usuario;
       
    }
    public Caja(Calendar fechaApertura, Calendar fechaCierre, float saldoInicial, float saldoCierre, float totalIngresos, float totalGastos, Estado estado, List<Gasto> gastos, List<Venta> ventas, Usuario usuario) {
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.saldoInicial = saldoInicial;
        this.saldoCierre = saldoCierre;
        this.totalIngresos = totalIngresos;
        this.totalGastos = totalGastos;
        this.estado = estado;
        this.gastos = gastos;
        this.ventas = ventas;
        this.usuario = usuario;
    }

    public Caja(Integer id, Calendar fechaApertura, Calendar fechaCierre, float saldoInicial, float saldoCierre, float totalIngresos, float totalGastos, Estado estado, List<Gasto> gastos, List<Venta> ventas, Usuario usuario) {
        this.id = id;
        this.fechaApertura = fechaApertura;
        this.fechaCierre = fechaCierre;
        this.saldoInicial = saldoInicial;
        this.saldoCierre = saldoCierre;
        this.totalIngresos = totalIngresos;
        this.totalGastos = totalGastos;
        this.estado = estado;
        this.gastos = gastos;
        this.ventas = ventas;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Calendar fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Calendar getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(Calendar fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public float getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(float saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public float getSaldoCierre() {
        return saldoCierre;
    }

    public void setSaldoCierre(float saldoCierre) {
        this.saldoCierre = saldoCierre;
    }

    public float getTotalIngresos() {
        return totalIngresos;
    }

    public void setTotalIngresos(float totalIngresos) {
        this.totalIngresos = totalIngresos;
    }

    public float getTotalGastos() {
        return totalGastos;
    }

    public void setTotalGastos(float totalGastos) {
        this.totalGastos = totalGastos;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }

    public void setGastos(List<Gasto> gastos) {
        this.gastos = gastos;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final Caja other = (Caja) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Caja{" + "id=" + id + ", fechaApertura=" + fechaApertura + ", fechaCierre=" + fechaCierre + ", saldoInicial=" + saldoInicial + ", saldoCierre=" + saldoCierre + ", totalIngresos=" + totalIngresos + ", totalGastos=" + totalGastos + ", estado=" + estado + ", gastos=" + gastos + ", ventas=" + ventas + ", usuario=" + usuario + '}';
    }

    
}
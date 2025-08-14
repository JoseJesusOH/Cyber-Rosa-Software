
package entidades;

import enumeradores.Rol;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    
        private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;
    
    @Column(name = "password", nullable = false, length = 20)
    private String password;
    
    @Column(name = "rol", nullable = false, length = 15)
    @Enumerated (EnumType.STRING)
    private Rol rol;
    
    @OneToMany (cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "usuario")
    private List<Caja> cajas;
    
        
    @OneToMany (cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "usuario")
    private List<Merma> mermas;

    public Usuario() {
    }

   public Usuario(Integer id) {
     this.id=id;
    }


    public Usuario(String nombre, String password, Rol rol) {
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
    }

    public Usuario(Integer id, String nombre, String password, Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
    }

    public Usuario(String nombre, String password, Rol rol, List<Caja> cajas) {
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
        this.cajas = cajas;
    }

    public Usuario(Integer id, String nombre, String password, Rol rol, List<Caja> cajas) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
        this.cajas = cajas;
    }

    public Usuario(String nombre, String password, Rol rol, List<Caja> cajas, List<Merma> mermas) {
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
        this.cajas = cajas;
        this.mermas = mermas;
    }

    public Usuario(Integer id, String nombre, String password, Rol rol, List<Caja> cajas, List<Merma> mermas) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
        this.rol = rol;
        this.cajas = cajas;
        this.mermas = mermas;
    }

    public List<Merma> getMermas() {
        return mermas;
    }

    public void setMermas(List<Merma> mermas) {
        this.mermas = mermas;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public List<Caja> getCajas() {
        return cajas;
    }

    public void setCajas(List<Caja> cajas) {
        this.cajas = cajas;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return nombre;
    }



  
        
}
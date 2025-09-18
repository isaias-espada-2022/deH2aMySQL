package domina.springboot.verduleria.back;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Verdura {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    private String nombre;
    private Double precio;
    private boolean troceable;

    public Verdura() {
    }

    public Verdura(long id, String nombre, Double precio, boolean troceable) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.troceable = troceable;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public boolean isTroceable() {
        return troceable;
    }

    public void setTroceable(boolean troceable) {
        this.troceable = troceable;
    }

}

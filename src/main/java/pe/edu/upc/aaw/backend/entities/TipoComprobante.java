package pe.edu.upc.aaw.backend.entities;

import javax.persistence.*;

@Entity
@Table(name="TipoComprobante")
public class TipoComprobante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", length = 250, nullable = false)
    private String nombre;
    @Column(name = "descipcion", length = 250, nullable = false)
    private String descipcion;

    public TipoComprobante() {
    }

    public TipoComprobante(int id, String nombre, String descipcion) {
        this.id = id;
        this.nombre = nombre;
        this.descipcion = descipcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

}

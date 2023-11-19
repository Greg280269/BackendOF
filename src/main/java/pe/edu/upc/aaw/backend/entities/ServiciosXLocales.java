package pe.edu.upc.aaw.backend.entities;

import javax.persistence.*;

@Entity
@Table(name="ServicioXLocales")
public class ServiciosXLocales {
    @Id // PK-FK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "idServicio")
    private Servicios idServicio;
    @ManyToOne
    @JoinColumn(name = "idLocal")
    private Locales idLocal;

    public ServiciosXLocales() {
    }

    public ServiciosXLocales(int id, Servicios idServicio, Locales idLocal) {
        this.id = id;
        this.idServicio = idServicio;
        this.idLocal = idLocal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Servicios getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Servicios idServicio) {
        this.idServicio = idServicio;
    }

    public Locales getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Locales idLocal) {
        this.idLocal = idLocal;
    }
}

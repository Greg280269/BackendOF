package pe.edu.upc.aaw.backend.dtos;

import pe.edu.upc.aaw.backend.entities.Locales;
import pe.edu.upc.aaw.backend.entities.Servicios;

public class ServiciosXLocalesDTO {

    private int id;
    private Servicios idServicio;
    private Locales idLocal;

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

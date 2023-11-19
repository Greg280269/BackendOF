package pe.edu.upc.aaw.backend.dtos;

import pe.edu.upc.aaw.backend.entities.Eventos;
import pe.edu.upc.aaw.backend.entities.Users;

public class UsersXEventosDTO {

    private int idUsuXEve;
    private Users idUsuario;
    private Eventos idEvento;

    public int getIdUsuXEve() {
        return idUsuXEve;
    }

    public void setIdUsuXEve(int idUsuXEve) {
        this.idUsuXEve = idUsuXEve;
    }

    public Users getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Users idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Eventos getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Eventos idEvento) {
        this.idEvento = idEvento;
    }

}

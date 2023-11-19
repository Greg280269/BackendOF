package pe.edu.upc.aaw.backend.entities;

import javax.persistence.*;

@Entity
@Table(name="UsersXEventos")
public class UsersXEventos {

    @Id // PK-FK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuXEve;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Users idUsuario;
    @ManyToOne
    @JoinColumn(name = "idEvento")
    private Eventos idEvento;

    public UsersXEventos() {
    }

    public UsersXEventos(int idUsuXEve, Users idUsuario, Eventos idEvento) {
        this.idUsuXEve = idUsuXEve;
        this.idUsuario = idUsuario;
        this.idEvento = idEvento;
    }

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

package pe.edu.upc.aaw.backend.serviceinterfaces;

import pe.edu.upc.aaw.backend.entities.UsersXEventos;

import java.util.List;

public interface IUsersXEventosService {

    public void insertar(UsersXEventos s);
    public List<UsersXEventos> list();
    public void delete (int id);
    public UsersXEventos listID(int id);

}

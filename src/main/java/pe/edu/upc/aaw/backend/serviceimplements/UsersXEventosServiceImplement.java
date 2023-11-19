package pe.edu.upc.aaw.backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend.entities.UsersXEventos;
import pe.edu.upc.aaw.backend.repositories.IUsersXEventosRepository;
import pe.edu.upc.aaw.backend.serviceinterfaces.IUsersXEventosService;

import java.util.List;
@Service
public class UsersXEventosServiceImplement implements IUsersXEventosService {
    @Autowired
    private IUsersXEventosRepository ueR;

    @Override
    public void insertar(UsersXEventos s) {
        ueR.save(s);
    }

    @Override
    public List<UsersXEventos> list() {
        return ueR.findAll();
    }

    @Override
    public void delete(int id) {
        ueR.deleteById(id);
    }

    @Override
    public UsersXEventos listID(int id) {
        return ueR.findById(id).orElse(new UsersXEventos());
    }
}

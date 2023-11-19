package pe.edu.upc.aaw.backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.backend.entities.ServiciosXLocales;
import pe.edu.upc.aaw.backend.repositories.IServiciosXLocalesRepository;
import pe.edu.upc.aaw.backend.serviceinterfaces.IServiciosXLocalesService;

import java.util.List;
@Service
public class ServiciosXLocalesServiceImplement implements IServiciosXLocalesService {
    @Autowired
    private IServiciosXLocalesRepository slR;

    @Override
    public void insertar(ServiciosXLocales s) {
        slR.save(s);
    }

    @Override
    public List<ServiciosXLocales> list() {
        return slR.findAll();
    }

    @Override
    public void delete(int id) {
        slR.deleteById(id);
    }

    @Override
    public ServiciosXLocales listID(int id) {
        return slR.findById(id).orElse(new ServiciosXLocales());
    }
}

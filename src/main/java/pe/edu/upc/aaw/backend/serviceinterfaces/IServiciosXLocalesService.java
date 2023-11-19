package pe.edu.upc.aaw.backend.serviceinterfaces;

import pe.edu.upc.aaw.backend.entities.ServiciosXLocales;

import java.util.List;

public interface IServiciosXLocalesService {

    public void insertar(ServiciosXLocales s);
    List<ServiciosXLocales> list();
    public void delete(int id);
    public ServiciosXLocales listID(int id);
}

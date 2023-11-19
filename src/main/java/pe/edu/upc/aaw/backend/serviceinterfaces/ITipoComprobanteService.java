package pe.edu.upc.aaw.backend.serviceinterfaces;

import pe.edu.upc.aaw.backend.entities.TipoComprobante;

import java.util.List;

public interface ITipoComprobanteService {

    public void insertar(TipoComprobante s);
    List<TipoComprobante> list();
    public void delete(int id);
    public TipoComprobante listID(int id);

}

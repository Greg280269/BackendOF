package pe.edu.upc.aaw.backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend.dtos.ServiciosXLocalesDTO;
import pe.edu.upc.aaw.backend.entities.ServiciosXLocales;
import pe.edu.upc.aaw.backend.serviceinterfaces.IServiciosXLocalesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/serviciosXLocales")
public class ServiciosXLocalesController {

    @Autowired
    private IServiciosXLocalesService islS;
    @PostMapping
    public void registrar(@RequestBody ServiciosXLocalesDTO dto){
        ModelMapper m= new ModelMapper();
        ServiciosXLocales o = m.map(dto, ServiciosXLocales.class);
        islS.insertar(o);
    }

    @GetMapping
    public List<ServiciosXLocalesDTO> listar(){
        return islS.list().stream().map(x->{
            ModelMapper M=new ModelMapper();
            return M.map(x,ServiciosXLocalesDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){islS.delete(id);}

    @PutMapping
    public void modificar(@RequestBody ServiciosXLocalesDTO dto)
    {
        ModelMapper m= new ModelMapper();
        ServiciosXLocales o = m.map(dto,ServiciosXLocales.class);
        islS.insertar(o);
    }

    @GetMapping("/{id}")
    public ServiciosXLocalesDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        ServiciosXLocalesDTO dto=m.map(islS.listID(id),ServiciosXLocalesDTO.class);
        return dto;
    }
}

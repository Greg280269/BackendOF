package pe.edu.upc.aaw.backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.backend.dtos.UsersXEventosDTO;
import pe.edu.upc.aaw.backend.entities.UsersXEventos;
import pe.edu.upc.aaw.backend.serviceinterfaces.IUsersXEventosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/UsersXEventosController")
public class UsersXEventosController {
    @Autowired
    private IUsersXEventosService iueS;
    @PostMapping
    public void registrar(@RequestBody UsersXEventosDTO dto){
        ModelMapper m= new ModelMapper();
        UsersXEventos o = m.map(dto, UsersXEventos.class);
        iueS.insertar(o);
    }

    @GetMapping
    public List<UsersXEventosDTO> listar(){
        return iueS.list().stream().map(x->{
            ModelMapper M=new ModelMapper();
            return M.map(x,UsersXEventosDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){iueS.delete(id);}

    @PutMapping
    public void modificar(@RequestBody UsersXEventosDTO dto)
    {
        ModelMapper m= new ModelMapper();
        UsersXEventos o = m.map(dto,UsersXEventos.class);
        iueS.insertar(o);
    }

    @GetMapping("/{id}")
    public UsersXEventosDTO listId(@PathVariable("id")Integer id){
        ModelMapper m=new ModelMapper();
        UsersXEventosDTO dto=m.map(iueS.listID(id),UsersXEventosDTO.class);
        return dto;
    }
}

package gov.sp.fatec.springbotlab04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gov.sp.fatec.springbotlab04.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin
public class UsuarioController {

    @Autowired
    private UsuarioService service; //sempre declare com interface, nunca com usuário
    
    // @GetMapping
    // public List<Usuario> todosUsuarios() {
    //     return service.todosUsuarios();
    // }

    // @PostMapping
    // public Usuario novUsuario(@RequestBody Usuario usuario) {
    //     return service.novoUsuario(usuario);
    // }
    
    // @GetMapping(value = "/{id}") //diferenciar do outro get
    // public Usuario buscarPeloId(@PathVariable("id") Long id) {
    //     return service.buscarPeloId(id);
    // }
}

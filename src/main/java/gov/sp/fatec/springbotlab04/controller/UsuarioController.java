package gov.sp.fatec.springbotlab04.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import gov.sp.fatec.springbotlab04.entity.Usuario;
import gov.sp.fatec.springbotlab04.entity.View;
import gov.sp.fatec.springbotlab04.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin
public class UsuarioController {

    @Autowired
    private UsuarioService service; //sempre declare com interface, nunca com usuário
    
    @GetMapping
    @JsonView(View.ViewUsuario.class)
    public List<Usuario> todosUsuarios() {
        return service.todosUsuarios();
    }

    @PostMapping
    @JsonView(View.ViewUsuario.class)
    public Usuario novUsuario(@RequestBody Usuario usuario) {
        return service.novoUsuario(usuario);
    }
    
    @GetMapping(value = "/{id}") //diferenciar do outro get
    @JsonView(View.ViewUsuarioCompleto.class)
    public Usuario buscarPeloId(@PathVariable("id") Long id) {
        return service.buscarPeloId(id);
    }
}

package gov.sp.fatec.springbotlab04.service;

import java.util.List;

import gov.sp.fatec.springbotlab04.entity.Usuario;

public interface UsuarioService {
    
    public Usuario novoUsuario(Usuario usuario);
    
    public List<Usuario> todosUsuarios();

    public Usuario buscarPeloId(Long id);
}

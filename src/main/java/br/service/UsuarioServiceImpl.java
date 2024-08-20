package br.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import br.gov.sp.fatec.springbotlab04.entity.Usuario;
import br.gov.sp.fatec.springbotlab04.repository.UsuarioRepository;

public class UsuarioServiceImpl implements UsuarioService{
    
    private UsuarioRepository repo;
 
    public UsuarioServiceImpl(UsuarioRepository repo) {
        this.repo = repo;
    }

    @Transactional
    @Override
    public Usuario novoUsuario(Usuario usuario) {
        if (usuario == null ||
            usuario.getNome() == null ||
            usuario.getNome().isBlank() ||
            usuario.getSenha() == null ||
            usuario.getSenha().isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Dados inválidos!");
        }
        return repo.save(usuario);
    }
    
    @Override
    public List<Usuario> todosUsuarios() {
        return repo.findAll();
    }

    @Override
    public Usuario buscarPeloId(Long id) {
        Optional<Usuario> usuarioOp = repo.findById(id);
        if (usuarioOp.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuário não encontrado!");
        }
        return usuarioOp.get();
    }
}

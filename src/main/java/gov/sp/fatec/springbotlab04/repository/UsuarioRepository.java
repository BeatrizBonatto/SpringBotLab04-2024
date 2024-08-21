package gov.sp.fatec.springbotlab04.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gov.sp.fatec.springbotlab04.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
        
}

package src.main.java.com.netflix.usuarioservice.usuario.repository;

import src.main.java.com.netflix.usuarioservice.usuario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    Usuario findByGuidUsuario(Integer guidUsuario);
}

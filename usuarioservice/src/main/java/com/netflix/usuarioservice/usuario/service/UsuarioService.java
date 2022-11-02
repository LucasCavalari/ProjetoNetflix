package src.main.java.com.netflix.usuarioservice.usuario.service;

import src.main.java.com.netflix.usuarioservice.producer.QueueSender;
import src.main.java.com.netflix.usuarioservice.usuario.entity.Usuario;
import src.main.java.com.netflix.usuarioservice.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private QueueSender queueSender;

    public Catalogo salvar(Catalogo usuario) throws JsonProcessingException {
    	ObjectMapper mapper = new ObjectMapper();    	
        queueSender.send(mapper.writeValueAsString(usuario));

        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public Usuario buscarPorId(Integer id) {
        return usuarioRepository.findById(id).get();
    }

    public Usuario buscarPorGuidUsuario(Integer guidUsuario) {
        return usuarioRepository.findByGuidUsuario(guidUsuario);
    }

}

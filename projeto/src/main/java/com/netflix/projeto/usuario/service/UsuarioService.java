package com.netflix.projeto.usuario.service;

import com.netflix.projeto.usuario.entity.Usuario;
import com.netflix.projeto.usuario.repository.UsuarioRepository;
import com.netflix.projeto.Catalogo.FeignCatalogo;
import com.netflix.projeto.Catalogo.CatalogoTo;
import com.netflix.projeto.util.excecao.ExcecaoExemplo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private FeignCatalogo feignCatalogo;

    public Usuario salvar(Usuario usuario) throws ExcecaoExemplo {
        if (usuario.getNome() == null ||
                usuario.getNome().equals("") ||
                usuario.getNome().length() > 300) {

            throw new ExcecaoExemplo("ERR001", "O dados dos usuário estão errados manow.");
        }
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> listar() {
            List<Usuario> usuarios = usuarioRepository.findAll();
            /*for (Usuario u : usuarios) {
                CatalogoTo catalogo = feignCatalogo.buscarPorGuidUsuario(u.getId());

                u.setCatalogoTo(catalogo);
            }*/
        return usuarios;
    }
    public Usuario buscarPorId(Integer id) {
        return usuarioRepository.findById(id).get();
    }

    public void excluir(Integer id) {
        usuarioRepository.deleteById(id);
    }

}
package com.bcopstein.sistvendas.dominio.servicos;


import com.bcopstein.sistvendas.dominio.modelos.UsuarioModel;
import com.bcopstein.sistvendas.dominio.persistencia.IUsuarioRepository;
import com.bcopstein.sistvendas.persistencia.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public record UsuarioService(IUsuarioRepository iUsuarioRepository) {
    @Override
    public IUsuarioRepository iUsuarioRepository() {
        return iUsuarioRepository;
    }


    public List<UsuarioModel> findAll() {
       return iUsuarioRepository.todos();
    }


}
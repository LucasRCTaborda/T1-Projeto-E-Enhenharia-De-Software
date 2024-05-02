package com.bcopstein.sistvendas.dominio.persistencia;


import com.bcopstein.sistvendas.dominio.modelos.UsuarioModel;
import com.bcopstein.sistvendas.persistencia.Usuario;

import java.util.List;

public interface IUsuarioRepository {
    List<UsuarioModel> todos();

    UsuarioModel consultaPorId(long codigo);
}



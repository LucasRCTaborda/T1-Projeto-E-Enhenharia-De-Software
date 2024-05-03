package com.bcopstein.sistvendas.dominio.persistencia;


import com.bcopstein.sistvendas.dominio.modelos.ClienteModel;

import java.util.List;

public interface IClienteRepository  {
    List<ClienteModel> todos ();
    ClienteModel consultaPorId(Long codigo);
}

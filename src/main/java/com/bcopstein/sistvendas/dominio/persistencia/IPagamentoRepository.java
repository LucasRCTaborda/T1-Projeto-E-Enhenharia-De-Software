package com.bcopstein.sistvendas.dominio.persistencia;


import com.bcopstein.sistvendas.dominio.modelos.AssinaturaModel;
import com.bcopstein.sistvendas.dominio.modelos.PagamentoModel;

import java.util.List;

public interface IPagamentoRepository {
    List<PagamentoModel> todos ();
    PagamentoModel consultaPorId(Long codigo);


    List<AssinaturaModel> todosAssinatura ();
    AssinaturaModel consultaPorIdAssinatura(Long codigo);

}

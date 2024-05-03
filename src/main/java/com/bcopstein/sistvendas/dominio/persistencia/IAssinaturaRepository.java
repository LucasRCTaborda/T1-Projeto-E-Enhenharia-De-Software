package com.bcopstein.sistvendas.dominio.persistencia;


import com.bcopstein.sistvendas.dominio.modelos.AplicativoModel;
import com.bcopstein.sistvendas.dominio.modelos.AssinaturaModel;

import java.util.List;

public interface IAssinaturaRepository  {
    List<AssinaturaModel> todosAssinatura ();
    List<List<AplicativoModel>> todosAplicativos();
/*    List<ClienteModel> todosClientes();

    Optional<AssinaturaModel> consultaPorId(Long codigo);
    AssinaturaModel ConsultaporIdAssinatura(long codigo);*/
}

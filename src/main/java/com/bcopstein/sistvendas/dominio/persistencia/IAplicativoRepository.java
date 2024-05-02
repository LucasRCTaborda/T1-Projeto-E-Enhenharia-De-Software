package com.bcopstein.sistvendas.dominio.persistencia;


import com.bcopstein.sistvendas.dominio.modelos.AplicativoModel;
import com.bcopstein.sistvendas.persistencia.Aplicativo;

import java.util.List;

public interface IAplicativoRepository {
List<AplicativoModel> todos ();
AplicativoModel consultaPorId(long codigo);

    AplicativoModel save(AplicativoModel aplicativo);
    List<AplicativoModel> findAll();


}

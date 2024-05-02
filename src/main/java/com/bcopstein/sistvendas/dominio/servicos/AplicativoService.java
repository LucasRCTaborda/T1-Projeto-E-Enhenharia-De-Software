package com.bcopstein.sistvendas.dominio.servicos;

import com.bcopstein.sistvendas.dominio.modelos.AplicativoModel;
import com.bcopstein.sistvendas.dominio.persistencia.IAplicativoRepository;
import com.bcopstein.sistvendas.persistencia.Aplicativo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AplicativoService {
    private final IAplicativoRepository aplicativoRepository;


    public AplicativoService(IAplicativoRepository aplicativoRepository) {
        this.aplicativoRepository = aplicativoRepository;
    }

    public AplicativoModel salvarAplicativo(AplicativoModel aplicativo) {
        return aplicativoRepository.save(aplicativo);
    }

    public List<AplicativoModel> listarAplicativos() {
        return aplicativoRepository.findAll();
    }
}

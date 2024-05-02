package com.bcopstein.sistvendas.persistencia;


import com.bcopstein.sistvendas.dominio.modelos.AplicativoModel;
import com.bcopstein.sistvendas.dominio.persistencia.IAplicativoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class AplicativoRepJpa implements IAplicativoRepository {
    private final AplicativoJpa_itfRep aplicativoRepository;

    @Autowired
    public AplicativoRepJpa(AplicativoJpa_itfRep aplicativoRepository) {
        this.aplicativoRepository = aplicativoRepository;
    }

    @Override
    public List<AplicativoModel> todos() {
        List<Aplicativo> aplicativos = aplicativoRepository.findAll();
        if (aplicativos.size() == 0) {
            return new LinkedList<AplicativoModel>();
        } else {
            return aplicativos.stream()
                    .map(prod -> Aplicativo.toAplicativoModel(prod))
                    .toList();
        }
    }

    @Override
    public AplicativoModel consultaPorId(long id) {
        Aplicativo aplicativo = aplicativoRepository.findById(id);
        System.out.println("Produto de codigo: "+id+": "+aplicativo);
        if (aplicativo == null) {
            return null;
        } else {
            return Aplicativo.toAplicativoModel(aplicativo);
        }
    }

    @Override
    public AplicativoModel save(AplicativoModel aplicativo) {
        return null;
    }

    @Override
    public List<AplicativoModel> findAll() {
        return null;
    }
}






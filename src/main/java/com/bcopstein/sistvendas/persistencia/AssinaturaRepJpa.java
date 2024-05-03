package com.bcopstein.sistvendas.persistencia;

import com.bcopstein.sistvendas.dominio.modelos.AplicativoModel;
import com.bcopstein.sistvendas.dominio.modelos.AssinaturaModel;
import com.bcopstein.sistvendas.dominio.persistencia.IAssinaturaRepository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class AssinaturaRepJpa implements IAssinaturaRepository {
    private List<AssinaturaModel> assinaturas;

    public AssinaturaRepJpa(List<AssinaturaModel> assinaturas) {
        this.assinaturas = assinaturas;
    }

   @Override
    public Optional<AssinaturaModel> todosAssinatura() {
        return assinaturas.stream().findFirst();
    }

    @Override
    public List<List<AplicativoModel>> todosAplicativos() {
    AssinaturaRepJpa jpa=null;

    return jpa.todosAplicativos();
            }
        }
/*
    @Override
    public List<ClienteModel> todosClientes() {
        return assinaturas.stream()
                .map(AssinaturaModel::getClientes)
                .distinct()
                .collect(Collectors.toList());
    }

    @Override
    public Optional<AssinaturaModel> consultaPorId(Long codigo) {
        return assinaturas.stream()
                .filter(assinatura -> assinatura.getCodigo())
                .findFirst();
    }

    @Override
    public AssinaturaModel ConsultaporIdAssinatura(long codigo) {
        return null;
    }

    @Override
    public AssinaturaModel consultaPorIdAssinatura(long codigo) {
        return assinaturas.stream()
                .filter(assinatura -> assinatura.getCodigo() == codigo)
                .findFirst()
                .orElse(null);
    }*/


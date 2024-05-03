package com.bcopstein.sistvendas.aplicacao.dtos;



import com.bcopstein.sistvendas.dominio.modelos.AplicativoModel;
import com.bcopstein.sistvendas.dominio.modelos.AssinaturaModel;
import com.bcopstein.sistvendas.dominio.modelos.ClienteModel;
import com.bcopstein.sistvendas.dominio.servicos.AplicativoService;
import com.bcopstein.sistvendas.dominio.servicos.AssinaturaService;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class AssinaturaDTO {

    private long id;
    private Date inicioVigencia;
    private Date fimVigencia;
    private List<ClienteDTO> clientes;
    private List<AplicativoTDO> aplicativos;

    private AssinaturaService appService;
    public AssinaturaDTO(AssinaturaModel assinatura) {
        this.id = assinatura.getCodigo();
        this.inicioVigencia = appService.getInicioVigencia();
        this.fimVigencia = appService.getFimVigencia();
        clientes = new LinkedList<>();
        aplicativos = new LinkedList<>();

        for (ClienteModel cliente : assinatura.getCliente()) {
            clientes.add(new ClienteDTO(cliente.getcodigo(), cliente.getNome(), cliente.getEmail()));
        }

        for (AplicativoModel aplicativo : assinatura.getAplicativo()) {
            aplicativos.add(new AplicativoTDO(aplicativo.getCodigo(), aplicativo.getNome(), aplicativo.getCustoMensal()));
        }
    }

    public static AssinaturaDTO fromModel(AssinaturaModel assinatura){
        return new AssinaturaDTO(assinatura);
    }
}

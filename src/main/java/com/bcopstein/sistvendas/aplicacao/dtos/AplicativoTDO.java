package com.bcopstein.sistvendas.aplicacao.dtos;

import com.bcopstein.sistvendas.persistencia.Aplicativo;


public class AplicativoTDO {
    private long codigo;
    private String nome;
    private double custoMensal;



    public AplicativoTDO(long codigo, String nome, double custoMensal) {
        this.codigo = codigo;
        this.nome = nome;
        this.custoMensal = custoMensal;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCustoMensal() {
        return custoMensal;
    }

    public void setCustoMensal(double custoMensal) {
        this.custoMensal = custoMensal;
    }

    public static AplicativoTDO fromModel(Aplicativo aplicativo){
        return new AplicativoTDO(aplicativo.getCodigo(), aplicativo.getNome(), aplicativo.getCusto_mensal());
    }
}

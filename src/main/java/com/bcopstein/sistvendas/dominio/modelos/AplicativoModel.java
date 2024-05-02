package com.bcopstein.sistvendas.dominio.modelos;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class AplicativoModel {
    @Id
    @GeneratedValue
    private long codigo;
    private String nome;



    public AplicativoModel(long codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;

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



    @Override
    public String toString() {
        return "AplicativoModel{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                '}';
    }
}

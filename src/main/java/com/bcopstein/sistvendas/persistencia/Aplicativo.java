package com.bcopstein.sistvendas.persistencia;

import com.bcopstein.sistvendas.dominio.modelos.AplicativoModel;
import jakarta.persistence.*;
@Table
@Entity
public class Aplicativo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long ID;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "custo_mensal", nullable = false)
    private double custoMensal;

    public Aplicativo() {
    }

    public Aplicativo(Long codigo, String nome, double custoMensal) {
        this.ID = codigo;
        this.nome = nome;
        this.custoMensal = custoMensal;
    }

    public Long getCodigo() {
        return ID;
    }

    public void setCodigo(Long codigo) {
        this.ID = codigo;
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

    public static Aplicativo fromAplicativoModel(AplicativoModel apModel) {
        return new Aplicativo(apModel.getCodigo(), apModel.getNome(), apModel.getCustoMensal());
    }

    public static AplicativoModel toAplicativoModel(Aplicativo aplicativo) {
        return new AplicativoModel(aplicativo.getCodigo(), aplicativo.getNome(), aplicativo.getCustoMensal());
    }
}

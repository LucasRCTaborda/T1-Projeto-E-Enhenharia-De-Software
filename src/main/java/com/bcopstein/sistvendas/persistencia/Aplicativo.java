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



    public Aplicativo() {
    }

    public Aplicativo(Long codigo, String nome) {
        this.ID = codigo;
        this.nome = nome;

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


    public static Aplicativo fromAplicativoModel(AplicativoModel apModel) {
        return new Aplicativo(apModel.getCodigo(), apModel.getNome() );
    }

    public static AplicativoModel toAplicativoModel(Aplicativo aplicativo) {
        return new AplicativoModel(aplicativo.getCodigo(), aplicativo.getNome());
    }
}

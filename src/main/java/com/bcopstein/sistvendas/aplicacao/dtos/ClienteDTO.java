package com.bcopstein.sistvendas.aplicacao.dtos;

import com.bcopstein.sistvendas.persistencia.Cliente;


public class ClienteDTO {
    private long codigo;
    private String nome;
    private String Email;

    public ClienteDTO(long codigo, String nome, String email) {
        this.codigo = codigo;
        this.nome = nome;
        Email = email;
    }

    public long getcodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }



        public static ClienteDTO fromModel(Cliente cliente){
            return new ClienteDTO(cliente.getcodigo(), cliente.getNome(), cliente.getEmail());
        }
    }




package com.bcopstein.sistvendas.persistencia;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AplicativoJpa_itfRep extends CrudRepository<Aplicativo,Long> {
    List<Aplicativo> findAll();
    Aplicativo findById(long id);
}

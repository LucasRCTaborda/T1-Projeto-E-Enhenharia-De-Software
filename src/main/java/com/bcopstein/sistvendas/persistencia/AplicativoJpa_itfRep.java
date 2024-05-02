package com.bcopstein.sistvendas.persistencia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AplicativoJpa_itfRep extends CrudRepository<Aplicativo,Long> {
    List<Aplicativo> findAll();
    Aplicativo findById(long id);
}

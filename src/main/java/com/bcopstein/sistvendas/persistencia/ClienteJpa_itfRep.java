package com.bcopstein.sistvendas.persistencia;


import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface ClienteJpa_itfRep extends CrudRepository<Cliente,Long> {
    List<Cliente> findAll();
    Cliente findById(long id);
}

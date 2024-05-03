package com.bcopstein.sistvendas.persistencia;


import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PagamentoJpa_itfRep extends CrudRepository<Pagamento, Long> {

    List<Pagamento> findAll();
    Optional<Pagamento> findById(long id);
}

package com.dev.selldisk.repository;

import com.dev.selldisk.model.Client;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {
    List<Client> findByMail(String mail);
}

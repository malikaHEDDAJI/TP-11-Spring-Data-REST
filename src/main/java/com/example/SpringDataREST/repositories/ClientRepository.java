package com.example.SpringDataREST.repositories;

import com.example.SpringDataREST.entities.Client;
import com.example.SpringDataREST.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {
}
package com.bootproject.carrentalapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootproject.carrentalapp.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}

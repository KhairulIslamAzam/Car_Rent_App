package com.bootproject.carrentalapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootproject.carrentalapp.models.Country;

@Repository

public interface CountryRepository extends JpaRepository<Country, Integer> {

}

package com.bootproject.carrentalapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootproject.carrentalapp.models.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}

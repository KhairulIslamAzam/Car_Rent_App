package com.bootproject.carrentalapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bootproject.carrentalapp.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}

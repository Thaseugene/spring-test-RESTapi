package com.example.springtestupd;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScooterRepository extends CrudRepository<Scooter, String> {
}

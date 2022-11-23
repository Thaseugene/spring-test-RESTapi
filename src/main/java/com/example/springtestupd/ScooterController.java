package com.example.springtestupd;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/scooters")
public class ScooterController {

    private final ScooterRepository scooterRepository;

    public ScooterController(ScooterRepository scooterRepository) {
        this.scooterRepository = scooterRepository;
    }

    @GetMapping
    public Iterable<Scooter> getScooters() {
        return scooterRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Scooter> getScooterById(@PathVariable String id) {
        return scooterRepository.findById(id);
    }

    @PostMapping
    public Scooter postScooter(@RequestBody Scooter scooter) {
        return scooterRepository.save(scooter);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Scooter> putScooter(@PathVariable String id, @RequestBody Scooter scooter) {
        return (scooterRepository.existsById(id)) ?
                new ResponseEntity<>(scooter, HttpStatus.OK) :
                new ResponseEntity<>(postScooter(scooter), HttpStatus.CREATED);

    }

    @DeleteMapping("/{id}")
    public void deleteScooter(@PathVariable String id) {
        scooterRepository.deleteById(id);
    }
}
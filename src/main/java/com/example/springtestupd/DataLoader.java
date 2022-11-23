package com.example.springtestupd;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class DataLoader {

    private final ScooterRepository scooterRepository;

    public DataLoader(ScooterRepository scooterRepository) {
        this.scooterRepository = scooterRepository;
    }

    @PostConstruct
    private void loadData() {
        scooterRepository.saveAll(List.of(
                new Scooter("Xiaomi"),
                new Scooter("Kugoo"),
                new Scooter("Ninebot"),
                new Scooter("Vsett")
        ));
    }
}

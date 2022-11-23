package com.example.springtestupd;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Scooter {
    @Id
    private String id;
    private String model;

    public Scooter() {
    }

    public Scooter(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public Scooter(String model) {
        this(UUID.randomUUID().toString(), model);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

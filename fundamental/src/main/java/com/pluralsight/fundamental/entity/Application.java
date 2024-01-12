package com.pluralsight.fundamental.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "app_name", nullable = false)
    private String name;

    @Column(length = 2000)
    private String description;
    private String owner;

    public Application() {

    }

    public Application(String name, String owner, String description) {
        this.name = name;
        this.owner = owner;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + " " + owner + " " + description;
    }

}

package com.pluralsight.fundamental.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Release {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String releaseDate;
    private String description;

    public Release() {

    }

    public Release(Integer id, String description, String releaseDate) {
        this.id = id;
        this.releaseDate = releaseDate;
        this.description = description;
    }
}

package com.example.lostandfound.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

@Entity
public class Item {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Object getName() {
        return null;
    }

    public Object getDescription() {
        return null;
    }

    public Object getStatus() {
        return null;
    }

    public void setName(Object name) {
    }

    public void setDescription(Object description) {
    }

    public void setStatus(Object status) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public enum Status {
        LOST, FOUND, CLAIMED
    }
}


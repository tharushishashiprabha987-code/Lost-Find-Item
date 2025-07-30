package com.example.lostandfound.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

@Entity
public class Request {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue
    private Long id;

    private String details;

    @Enumerated(EnumType.STRING)
    private Status status;

    public void setStatus(Status approved) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public enum Status {
        PENDING, APPROVED, REJECTED
    }
}

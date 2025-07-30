package com.example.lostandfound.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

@Entity
public class User {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    public String getPassword() {
        return null;
    }

    public String getUsername() {
        return null;
    }

    public String getRole() {
        return null;
    }

    public void setUsername(String username) {
    }

    public void setPassword(String encode) {
    }

    public void setRole(Role user) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public enum Role {
        ADMIN, STAFF, USER
    }
}

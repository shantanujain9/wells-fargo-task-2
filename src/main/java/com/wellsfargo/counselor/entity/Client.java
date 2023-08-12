package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private long clientId;

    @Column(nullable = false)
    private String name;

    // Other relevant fields

    protected Client() {
    }

    public Client(String name /* other parameters */) {
        this.name = name;
        // Initialize other fields
    }

    public Long getClientId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Other getters and setters
}

package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    // Other relevant fields

    protected Portfolio() {
    }

    public Portfolio(/* parameters */) {
        // Initialize fields
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    // Other getters and setters
}

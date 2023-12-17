package com.example.api.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Coupon {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Long userId;

    public Coupon() {
    }

    public Coupon(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return Id;
    }
}

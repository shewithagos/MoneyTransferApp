package com.eagle.moneytransferapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class CurrencyRate {
    @Id
    private String currencyCode; // e.g., USD, EUR
    private BigDecimal exchangeRate; // Exchange rate relative to USD
}

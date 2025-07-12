package com.eagle.moneytransferapp.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id @GeneratedValue private Long id;
    @ManyToOne private User fromUser;
    @ManyToOne private User toUser;
    private BigDecimal amountUsd;
    private BigDecimal amountLocal;
    private String targetCurrency;
    private Instant timestamp = Instant.now();
}

package com.eagle.moneytransferapp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    /**
     * Currency code the user prefers for display.
     * All transactions are stored in USD under the hood,
     * but this controls which local code they see.
     */
    @Column(name = "preferred_currency", nullable = false)
    private String preferredCurrency = "USD";

    // Optional: track whether account is active/locked, timestamps, etc.
}


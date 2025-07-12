package com.eagle.moneytransferapp.repo;

import com.eagle.moneytransferapp.model.Transaction;
import com.eagle.moneytransferapp.model.User;
import com.example.moneytransfer.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {}

public interface CurrencyRateRepository extends JpaRepository<CurrencyRate,String> {}

package com.eagle.moneytransferapp.repo;

import com.eagle.moneytransferapp.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {}


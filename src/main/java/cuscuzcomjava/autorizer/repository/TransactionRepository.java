package cuscuzcomjava.autorizer.repository;

import cuscuzcomjava.autorizer.entity.Account;
import cuscuzcomjava.autorizer.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
}

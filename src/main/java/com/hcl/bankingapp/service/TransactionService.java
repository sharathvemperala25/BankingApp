package com.hcl.bankingapp.service;

import java.util.List;
import java.util.Optional;

import com.hcl.bankingapp.entity.Transaction;

public interface TransactionService {
	
	 public List<Transaction> getAllTransactionsForUser(Long customerId);	
	 
     public Optional<Transaction> searchTransaction( Long id);
}

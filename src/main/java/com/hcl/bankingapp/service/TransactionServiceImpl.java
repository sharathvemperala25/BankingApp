package com.hcl.bankingapp.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bankingapp.entity.Transaction;
import com.hcl.bankingapp.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	TransactionService transactionService;
	
	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public List<Transaction> getAllTransactionsForUser(Long customerId) {
		
		return transactionRepository.getAllTransaction(customerId);
	}

	@Override
	public Optional<Transaction> searchTransaction(Long id) {
		return transactionRepository.findById(id);
	}

	

}

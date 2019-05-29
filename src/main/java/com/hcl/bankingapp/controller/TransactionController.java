package com.hcl.bankingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.bankingapp.entity.Transaction;
import com.hcl.bankingapp.service.TransactionService;

@RestController
public class TransactionController {
	@Autowired
	TransactionService transactionService;
	
	
	@GetMapping("/userTransactions")
	public List<Transaction> getAllTransactionsForAccount(@RequestParam Long customerId) {

		List<Transaction> listOfTransaction = transactionService.getAllTransactionsForUser(customerId);
		
		return listOfTransaction;
	}

	
	
}

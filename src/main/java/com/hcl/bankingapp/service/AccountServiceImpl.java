package com.hcl.bankingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.bankingapp.entity.Account;
import com.hcl.bankingapp.repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountRepository accountRepository;

	@Override
	public Account saveAccount(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.save(account);
	}
	
	@Override
	public Account status(Long id, String status) {
		
	Account account= accountRepository.findById(id).get();
	account.setStatus(status);
	accountRepository.save(account);
	 
		return account;
	}
}

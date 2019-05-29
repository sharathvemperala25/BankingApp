package com.hcl.bankingapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.bankingapp.entity.Account;
import com.hcl.bankingapp.service.AccountService;

@RestController
@RequestMapping("/api")
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@PostMapping("/createAccount")
	public Account createAccount(@RequestBody Account account) {
		return accountService.saveAccount(account);
	}
	
	@PostMapping("/status")
	public Account status(@RequestBody Account account)
	{	
		
		return accountService.status(account.getCostumerId(), account.getStatus());
	}

}

package com.hcl.bankingapp.service;

import com.hcl.bankingapp.entity.Account;

public interface AccountService {

	Account saveAccount(Account account);
	public Account status(Long id, String status);
}

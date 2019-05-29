package com.hcl.bankingapp.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Account {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long costumerId;
	
	private Double accountBalance;
	 @NotEmpty(message = "name must not be empty")
	private String customerName;
	private String mobileNumber;
	 @NotEmpty(message = "email must not be empty")
	 @Email(message = "email should be a valid email")
	private String email;
	 @NotEmpty(message = "accountType must not be empty")
	private String accountType;
	private String status;
	private String maritialStatus;
	

	
	
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="account")
	@JsonIgnore
	private List<Transaction> transactions;
	public Long getCostumerId() {
		return costumerId;
	}
	public void setCostumerId(Long costumerId) {
		this.costumerId = costumerId;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	
	
	
	

}

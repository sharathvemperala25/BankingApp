package com.elite.banking.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="accounts")
@SequenceGenerator(name="account_number_seq", initialValue=21234351, allocationSize=100)
public class UserCredentials {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="account_number_seq")
	private Long accountNumber;
	private Long applicationId;
	private String uesr_id;
	private String pwd;
	private Double balance;
	public UserCredentials() {
	}
	public Long getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}
	public String getUesr_id() {
		return uesr_id;
	}
	public void setUesr_id(String uesr_id) {
		this.uesr_id = uesr_id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}

}

package com.hcl.bankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.bankingapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

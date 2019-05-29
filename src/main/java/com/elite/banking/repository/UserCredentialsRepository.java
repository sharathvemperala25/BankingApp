package com.elite.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.elite.banking.entity.UserCredentials;

@Repository
@RepositoryRestResource(collectionResourceRel = "banking", path = "banking")
public interface UserCredentialsRepository extends JpaRepository<UserCredentials,Long>{

}

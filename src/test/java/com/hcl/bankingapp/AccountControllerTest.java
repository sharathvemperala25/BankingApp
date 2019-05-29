package com.hcl.bankingapp;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.hcl.bankingapp.entity.Account;
import com.hcl.bankingapp.repository.AccountRepository;
import com.hcl.bankingapp.service.AccountService;





@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AccountControllerTest {

	@Autowired
	AccountService accountService;
	
	@MockBean
	AccountRepository accountRepositry;

    
    @Test
    public void testGetProductListSuccess() throws URISyntaxException
    {
    	Account tempAccount = new Account();
    	tempAccount.setCostumerId(1L);
    	tempAccount.setAccountBalance(5000.0);
    	tempAccount.setAccountType("savings");
    	tempAccount.setCustomerName("sharath");
    	tempAccount.setStatus("pending");
    	Mockito.when(accountRepositry.save(tempAccount)).thenReturn(tempAccount);
    	Account account = accountService.saveAccount(tempAccount);
    	Optional<Account> optionalAccount = Optional.ofNullable(account);
		assertThat(optionalAccount.isPresent());

    }
    	
    	
}


package com.elite.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elite.banking.entity.UserCredentials;
import com.elite.banking.repository.UserCredentialsRepository;

@RestController
@RequestMapping("/banking")
public class UserCredentialsController {
	@Autowired
	UserCredentialsRepository userCredentialsRepository;
	
	public static String getAlphaNumericString(int n) 
    { 
  
        // chose a Character random from this String 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
	
	@GetMapping("/generatecredentials/{id}")
	public UserCredentials generateUserCredentials(@PathVariable(value = "id") Long applicationId){
		UserCredentials uc=new UserCredentials();
		String user_id=UserCredentialsController.getAlphaNumericString(10);
		String password=UserCredentialsController.getAlphaNumericString(10);
		uc.setApplicationId(applicationId);
		uc.setPwd(password);
		uc.setUesr_id(user_id);
		uc.setBalance(5000.10);
		return userCredentialsRepository.save(uc);
	}
}

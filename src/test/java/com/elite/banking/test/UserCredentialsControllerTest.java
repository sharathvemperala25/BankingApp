package com.elite.banking.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.elite.banking.controller.UserCredentialsController;

public class UserCredentialsControllerTest {
	@Autowired
	UserCredentialsController userCredentialsController;
	
	@SuppressWarnings("static-access")
	@Test
	public void testUserCredentialsControllerforUserId() {
		String user_id=null;
		int limit=10;
		user_id=userCredentialsController.getAlphaNumericString(limit);
		assertNotNull(user_id);
	}
	
}
	

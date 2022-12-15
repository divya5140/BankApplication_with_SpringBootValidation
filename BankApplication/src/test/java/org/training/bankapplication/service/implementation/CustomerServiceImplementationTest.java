package org.training.bankapplication.service.implementation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.training.bankapplication.entity.Account;
import org.training.bankapplication.entity.Customer;
import org.training.bankapplication.repository.AccountRepository;

@ExtendWith(SpringExtension.class)
public class CustomerServiceImplementationTest {
	
	@InjectMocks
	CustomerServiceImplementation customerServiceImplementation;
	
	@Mock
	AccountRepository accountRepository;
	
	@Test
	void testAddCustomer()
	{
		 Account account=new Account();
		 account.setAccountId(1);
		 account.setAccountNumber(12345);
		 account.setAccountType("Saving");
		 account.setBalance(15000);
		 
		 Customer customer=new Customer();
		 customer.setAge(21);
		 customer.setContactNumber("7483060926");
		 customer.setCustomerId(1);
		 customer.setEmailId("divya@gmail.com");
		 customer.setFirstName("Vamsha");
		 customer.setLastName("s p");
		 customer.setPanNumber("xyz1234");
		 
		Mockito.when(accountRepository.save(account)).thenReturn(account);
		assertEquals("Customer Details added and Account created", customerServiceImplementation.addCustomer(account).getMessage());

		 
	}
}

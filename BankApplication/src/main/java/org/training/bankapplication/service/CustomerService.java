package org.training.bankapplication.service;

import org.training.bankapplication.dto.ResponseDto;
import org.training.bankapplication.entity.Account;
import org.training.bankapplication.entity.Customer;

public interface CustomerService {


	ResponseDto addCustomer(Account account);

	
Customer getById(long customerId);
	


	
}

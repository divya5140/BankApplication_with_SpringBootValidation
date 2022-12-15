package org.training.bankapplication.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.training.bankapplication.dto.ResponseDto;
import org.training.bankapplication.entity.Account;
import org.training.bankapplication.entity.Customer;
import org.training.bankapplication.exception.CustomerIdNotFoundException;
import org.training.bankapplication.repository.AccountRepository;
import org.training.bankapplication.repository.CustomerRepository;
import org.training.bankapplication.repository.TransactionRepository;
import org.training.bankapplication.service.CustomerService;

@Service
public class CustomerServiceImplementation implements CustomerService {

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	TransactionRepository transactionRepository;




	@Override
	public ResponseDto addCustomer(Account account) {

		account.setAccountNumber((long) (Math.floor(Math.random() * 9000000000000l) + 1000000000000l));
		accountRepository.save(account);

		return  new ResponseDto("Customer Details added and Account created");

	}

	
	public Customer getById(long customerId)
	{
		return customerRepository.findById(customerId).orElseThrow(
				()-> new CustomerIdNotFoundException("No Customer present with id="+customerId));
	}




}

package org.training.bankapplication.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.training.bankapplication.dto.ResponseDto;
import org.training.bankapplication.entity.Account;
import org.training.bankapplication.entity.Customer;
import org.training.bankapplication.service.CustomerService;



@RestController
@RequestMapping("/bank")
public class CustomerController {

	@Autowired
	CustomerService customerService;



	@PostMapping("/addCustomer")
	public   ResponseEntity<ResponseDto> addCustomer(@RequestBody @Valid Account account) {

		return new ResponseEntity<ResponseDto>(customerService.addCustomer(account),HttpStatus.CREATED);
	}
	
    @GetMapping("/findbyid")
	public ResponseEntity<Customer> getCustomer(@RequestParam long customerId)
	{
	return new ResponseEntity<Customer>(customerService.getById(customerId),HttpStatus.CREATED);

	}










}

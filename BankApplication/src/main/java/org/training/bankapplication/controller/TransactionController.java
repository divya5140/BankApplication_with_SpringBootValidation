package org.training.bankapplication.controller;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.training.bankapplication.dto.ResponseDto;
import org.training.bankapplication.entity.Transaction;
import org.training.bankapplication.service.TransactionService;

@RestController
@RequestMapping("/trans")
public class TransactionController {

	@Autowired
	TransactionService transactionService;



	@PostMapping("/fundTransfer")
	public ResponseDto fundTransfer(@RequestParam @NotNull long fromAccountNumber,@RequestParam @NotNull long toAccountNumber,@RequestParam("Enter the amount") @NotNull int amount) {
		return transactionService.fundTransfer(fromAccountNumber,toAccountNumber,amount);
				
	}
	@GetMapping("/transaction")
	public List<Transaction> getStatement(@RequestParam long accountNumber, @RequestParam String fromDate,String toDate) {
		return transactionService.getStatement(accountNumber, fromDate, toDate);
	}

}

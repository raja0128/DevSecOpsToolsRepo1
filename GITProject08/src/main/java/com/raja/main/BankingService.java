package com.raja.main;

public class BankingService {

	public String transfer(Long accNo, int pwd) {
		return "amount transfered from " + accNo + " succesfully";
	}
	
	public String debitAmount(Long accNo, double amt) {
		return amt + " Amount debited from " + accNo + " successfully";
	}
}

package com.raja.main;

public class BankingService {

	public String transfer(Long accNo, int pwd) {
		return "amount transfered from " + accNo + " succesfully";
	}
	
	public String debitAmount(Long accNo, double amt) {
		return amt + " debited from " + accNo + " successfully";
	}
	
	public String creditAmount(Long accNo, double amt) {
		return amt + " credited to " + accNo + " successfully";
	}
	
	public String changeMobileNumber(Long mblNo) {
		return mblNo + " deleted successfully  1234567890"; 
	}
	
	public String sendRequestForMoney(long mblNo, double amt) {
		return "Request sent Successwfully to " +mblNo + " for Amount:- " + amt;
	}
}

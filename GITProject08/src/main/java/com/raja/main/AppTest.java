package com.raja.main;

public class AppTest {

	public static void main(String[] args) {

		ArithmeticOperations ao = new ArithmeticOperations();

		double result = ao.sum(10, 20);

		float result1 = ao.sub(60f, 50f);
		
		double result2 = ao.mul(20, 30);
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		
	}
}

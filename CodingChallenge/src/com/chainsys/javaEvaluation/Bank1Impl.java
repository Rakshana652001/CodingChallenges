package com.chainsys.javaEvaluation;

import java.util.Scanner;

public class Bank1Impl implements Bank
{

	@Override
	public double getBalance()
	{
		Scanner scan = new Scanner(System.in);
		double bank1;
		
		System.out.println("Enter the amount to deposite in bank1: ");
		bank1=scan.nextDouble();
		
		scan.close();
		
		return bank1;
	}

}

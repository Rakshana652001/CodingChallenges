package com.chainsys.javaEvaluation;

import java.util.Scanner;

public class Bank3Impl implements Bank
{

	@Override
	public double getBalance()
	{
		Scanner scan = new Scanner(System.in);
		double bank3;
		
		System.out.println("Enter the amount to deposite in bank3: ");
		bank3=scan.nextDouble();
		
		scan.close();
		return bank3;
	}

}

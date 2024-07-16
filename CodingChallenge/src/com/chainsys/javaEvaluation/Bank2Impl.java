package com.chainsys.javaEvaluation;

import java.util.Scanner;

public class Bank2Impl implements Bank
{

	@Override
	public double getBalance() 
	{
		Scanner scan = new Scanner(System.in);
		double bank2;
		
		System.out.println("Enter the amount to deposite in bank2: ");
		bank2=scan.nextDouble();
		
		scan.close();
		return bank2;	
	}

}

package com.chainsys.javaEvaluation;

public class BankMainMethod {

	public static void main(String[] args)
	{
		Bank1Impl bank1Impl = new Bank1Impl();
		Bank2Impl bank2Impl = new Bank2Impl();
		Bank3Impl bank3Impl = new Bank3Impl();
		
		double bank1 = bank1Impl.getBalance();
		double bank2 = bank2Impl.getBalance();
		double bank3 = bank3Impl.getBalance();
		
		System.out.println("Deposited Money\n"+"Bank1: "+bank1+"\nBank2: "+bank2+"\nBank3: "+bank3);
		System.out.println(bank1Impl.getBalance());
		System.out.println(bank2Impl.getBalance());
		System.out.println(bank3Impl.getBalance());
	}

}

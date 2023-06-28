package org.system;

public class BankInfo extends AxisBank {

	
	public void deposit()
	{
		System.out.println("deposit account is overriden");
	}
	
	public static void main(String[] args) {
		
		BankInfo bank = new BankInfo();
		bank.deposit();
	}
}

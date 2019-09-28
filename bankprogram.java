package bankTransactions;

import java.util.Scanner;
public class bankprogram {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double initialBalance = 0.0;
	
	System.out.println("$ " +initialBalance);
	System.out.println("Select transaction options: ");
	System.out.println ("(D)eposit");
	System.out.println ("(W)ithdraw");
	System.out.println ("(Q)uit");
	{
	String userInput = in.nextLine();
	if (!userInput.equals("Q"))
	
	if (userInput.equals("D"))
	{
		System.out.println("Enter an amount to deposit.");
		double deposit = in.nextDouble();
	if (deposit >= 0)
		initialBalance = initialBalance + deposit;
		
			System.out.println("Your total balance is: $" +initialBalance);}
		
		else if (userInput.equals("W"))
		{
			System.out.println ("Enter an amount to withdraw. ");
			double withdraw = in.nextDouble();
		if (withdraw >=0);
			initialBalance = initialBalance - withdraw;
			
			System.out.println("Your total balance is: $" +initialBalance);}
	
		else userInput.equals("Q");{
	System.out.println("Thank you for using our bank. Please come again");
		}
		
		
		
	
	
	
	}	
	}
}

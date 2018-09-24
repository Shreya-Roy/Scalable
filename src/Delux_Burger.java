package Oops;
import java.util.Scanner;

public class Delux_Burger extends Hamburger
{
	int answer1;
	
	public Delux_Burger()
	{
		String Bread_Roll = "Brown";
		String meat = "Beef";
	}
	
	public void Extra()
	{
		int price2 = super.price; 
		Scanner s = new Scanner(System.in);
		do
		{
			System.out.println("Thank you choosing Delux Burger");
			System.out.println("You will get Coke and Fries as offer");
			System.out.println("Do you want the offer"
					+ "\n 1. Yes"
					+ "\n 2. No");
			int choice1 = s.nextInt();
			switch(choice1)
			{
				case 1 : System.out.println("You have accepted the offer");
						 price2 = price + 50 + 50;
						 break;
						  
				case 2 : System.out.println("You rejected the offer");
						 break;
			}
			System.out.println("Do you want to continue");
			answer1 = s.nextInt();
			
		}
		while(answer1==1);
		
		System.out.println("The final cost of the burger is" + price2);
	}
	
}

package Oops;

import java.util.Scanner;

public class Bill 
{	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		Hamburger h = new Hamburger();
		Healthy_Burger hb = new Healthy_Burger();
		Delux_Burger db = new Delux_Burger();
		System.out.println("Welcome to Burger Shop");
		System.out.println("Enter your choice of burger"
				+ "\n 1. Normal Burger"
				+ "\n 2. Healthy Burger"
				+ "\n 3. Delux Burger"
				+ "\n 4. Invalid Option");
		int choice = s.nextInt();
		switch(choice)
		{
		case 1: System.out.println("You have selected Normal Burger");
				h.Toppings();
				break;
				
		case 2: System.out.println("You have selected Healthy Burger");
				
				hb.Toppings();
				hb.Additions();
				break;
				
		case 3: System.out.println("You have selected Delux Burger");
				db.Toppings();
				db.Extra();
				break;
				
		case 4: System.out.println("Invalid option");
				break;
		}
		
	}

}

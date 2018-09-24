package Oops;

import java.util.Scanner;

public class Hamburger 
{
	int price;
	int ans;
	//int price1=0;
	//int price2=0;
	
	public Hamburger()
	{
		String Bread_Roll = "Bread";
		String meat = "Beef";	
		price = 40;
	}
	
	public void Toppings()
	{
		Scanner s = new Scanner(System.in);
		do
		{
			System.out.println("Enter the topping you need"
					+ "\n 1. Lettuce"
					+ "\n 2. Tomato "
					+ "\n 3. Carrot"
					+ "\n 4. Cheese"
					+ "\n 5. Invalid option");
			int top = s.nextInt();
			switch(top)
			{
			case 1: System.out.println("you have selected Lettuce");
					price = price + 30;
					break;
					
			case 2: System.out.println("you have selected Tomato");
					price = price + 20;
					break;
					
			case 3: System.out.println("you have selected Carrot");
					price = price + 25;
					break;
					
			case 4: System.out.println("you have selected Cheese");
					price = price + 20;
					break;
					
			case 5: System.out.println("Invalid Option");
					break;
			}
			System.out.println("Do you want to continue");
			ans = s.nextInt();
			
		}
		
		while(ans==1);
		
		
		System.out.println("The final cost of the burger is" + price);
		//price1 = price;
		//price2 = price;
		
	}
	
	
	
}

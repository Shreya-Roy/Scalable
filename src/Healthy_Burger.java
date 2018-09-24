package Oops;
import java.util.Scanner;
public class Healthy_Burger extends Hamburger
{
	int answer;
int price1;
	public Healthy_Burger()
	{
		String Bread_Roll = "Brown";
		String meat = "Beef";
	}
	
	public void Additions()
	{
		price1 = super.price; 
		Scanner s = new Scanner(System.in);
		do
		{
			System.out.println("Enter your choice for extra toppings"
					+ "\n 1.Panner"
					+ "\n 2.Fish"
					+ "\n 3.Invalid Option");
			int choice = s.nextInt();
			switch(choice)
			{
				case 1 : System.out.println("You have selected Panner");
						 price1 = price1 + 50;
						 break;
						 
				case 2 : System.out.println("YOu have selected Fish");
						 price1 = price1+ 80;
						 break;
						 
				case 3 : System.out.println("Invalid Option");
						 break;
			}
			System.out.println("Do you want to continue");
			answer = s.nextInt();
			
		}
		while(answer==1);
		
		System.out.println("The final cost of the burger is" + price1);
	}
}

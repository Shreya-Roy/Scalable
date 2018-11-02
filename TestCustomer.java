package Jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class TestCustomer 
{
	public static void testConnect()
	{
		Customer cust = new Customer();
		try 
		{
			Connection conn = cust.connect();
			if(null != conn)
			{
				System.out.println("Connection not null");
			}
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void testSelect()
	{
		Customer cust = new Customer();
		cust.select();
	}
	
	public static void testSelectWithWhere()
	{
		Customer cust = new Customer();
		String condition = "Nagpur";
		cust.selectWithWhere(condition);
		
	}
	public static void testInsert()
	{
		Customer cust = new Customer();
		Connection conn = null;
		try
		{
			conn = cust.connect();
			if(null != conn)
			{
				int id1 = 4;
				String name1 = "Virat";
				String add1 = "Nashik";
				cust.insert(id1, name1, add1, conn);
				
				int id2 = 5;
				String name2 = "Shilpa";
				String add2 = "Nagpur";
				cust.insert(id2, name2, add2, conn);
			}
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void testUpdate()
	{
		Customer cust = new Customer();
		cust.update();
		
	}
	
	public static void testDelete()
	{
		Customer cust = new Customer();
		cust.delete();		
	}
	public static void main(String[] args) 
	{
		int ans;
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome Customer");
		
		do
		{
			System.out.println("The options are"
					+ "\n 1. Check Connection"
					+ "\n 2. Insert values"
					+ "\n 3. View your Choice"
					+ "\n 4. Update your entry"
					+ "\n 5. Search any entry"
					+ "\n 6. Delete your entry");
			System.out.println("Enter your choice");
			int ch = s.nextInt();
			
			switch(ch)
			{
				case 1 : 
				{
					System.out.println("Checking connection");
					testConnect();
					break;
				}
				
				case 2 :
				{
					System.out.println("Inserting new values");
					testInsert();
					testSelect();
					break;
				}
				case 3 :
				{
					System.out.println("Printing Customer Information");
					testSelect();
					break;
				}
				case 4 :
				{
					System.out.println("Updating the entry");
					testUpdate();
					testSelect();
					break;
				}
				case 5 :
				{
					System.out.println("Searching a entry");
					testSelectWithWhere();
					break;
				}
				case 6 :
				{
					System.out.println("Deleting a entry");
					testDelete();
					testSelect();
					break;
				}
			}
			System.out.println("Do you want to continue");
			ans = s.nextInt();

		}
		while(ans != 0);
		System.out.println("Thank you !!! Visit Again");
		
	}

}

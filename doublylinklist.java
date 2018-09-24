package Collection;
import java.util.*;
import java.math.*;

public class doublylinklist 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		//LinkedList<String> l2 = new LinkedList<String>();
		
		l1.add(1);
		l1.addFirst(2);
		l1.addFirst(3);
		l1.addFirst(4);
		l1.addFirst(1);
		l1.addFirst(2);
		
		System.out.println("Linked list " + l1);
		//LinkedList<Integer> subItems = (LinkedList<Integer>) l1.subList(0, min(l1.size(), 3));
		List<Integer> subItems = l1.subList(0, 3);
		//System.out.println("List is" + l1.subList(0, 3));
		
		char answer;
		do
		{
			
			System.out.println("Enter element:");
			int ele = s.nextInt();
			if(subItems.contains(ele))
			{
				int i=l1.indexOf(ele);
				int a=l1.get(0);
				int b=l1.get(1);
				
				if(i==2)
				{
					l1.set(0, ele);
					l1.add(1, a);
					l1.add(2, b);
				}
				
				if(i==1)
				{
					l1.set(0, ele);
					l1.set(i, a);
				}
			}
			else
			{
				l1.addFirst(ele);
			}

			System.out.println("Do you want to continue: ");
			answer = s.next().charAt(0);
		}
		while(answer=='y');
		subItems = l1.subList(0, 3);
		//subItems = (LinkedList<Integer>) l1.subList(0, min(l1.size(), 3));
		System.out.println("Linked List :" +subItems);

	}

	private static int min(int size, int i) 
	{
		// TODO Auto-generated method stub
		return 0;
	}
		
		
}
	
	
	


package Assignment3;
import java.util.*;

public class EvenOdd 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(5);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(4);
		list.add(3);
		list.add(10);
		
		System.out.println("Using Iterator");
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			int num = iterator.next();
			if(num % 2 == 0)
			{
				System.out.print(num + " ");
				System.out.println();
			}
			else
			{
				iterator.remove();
			}
		}
		System.out.println("Size of list is " + list.size() );
		
		System.out.println();
		
		System.out.println("Using For each");
		for(int i : list)
		{
			if(i % 2 == 0)
			{
				System.out.print(i + " ");
				System.out.println();
			}
			else
			{
				list.remove(i);
			}	
		}
		System.out.println("Size of list is " + list.size() );	
	}
}

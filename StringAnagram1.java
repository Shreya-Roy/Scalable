package Assingment2;

import java.util.Arrays;

public class StringAnagram1 
{
	public static void main(String[] args) 
	{
		String input1 = "c at";
		String input2 = "AC T";
	    isAnagram(input1,input2);
	}
	
	public static void isAnagram(String input1 , String input2)
	{
		boolean status = true;
		
		if(input1.length() != input2.length())
		{
			status = false;
		}
		
		else 
        {
            char[] s1Array = input1.toLowerCase().toCharArray();
            char[] s2Array = input2.toLowerCase().toCharArray();
 
 
            Arrays.sort(s1Array);
            Arrays.sort(s2Array);
            
            status = Arrays.equals(s1Array, s2Array);
        }
		
		if(status = true)
		{
			System.out.println(input1+" and "+input2+" are anagrams");
		}
		
		else
		{
			System.out.println(input1+" and "+input2+" are not anagrams");
		}
	}
		
	
}

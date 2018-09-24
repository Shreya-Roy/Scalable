package Assingment2;

public class StringSplit 
{ 
    public static void main(String args[])
    {  
    	String s1 = "He is a very very nice guy isn't he?";
    	String str2 = Manipulation(s1);
        //System.out.println("Reversed string is " + str2);
    	
    	
    }
    
    public static String Manipulation(String name)
    {
    	int count = 0;
    	for(int i = 0; i<name.length() ; i++)
    	{
    		if(name.charAt(i) == ' ' || name.charAt(i) == '?' || name.charAt(i) == ',' || name.charAt(i) == '\'' || name.charAt(i) == ' ' )
    		{
    			count++;
    			System.out.println();
    		}
    	}
    	
    	System.out.println(count);
    	try
    	{
    		for(int i = 0; i<name.length() ; i++)
    		{
    			if(name.charAt(i) == ' ' || name.charAt(i) == '?' || name.charAt(i) == ',' || name.charAt(i) == '\'' || name.charAt(i) == ' ' )
        		{
        			System.out.println();
        		}
    			else
    			{
    				System.out.println(name.charAt(i));
    			}
    			
    		}
    	}
    	catch(Exception e)
    	{
    	        System.err.println("Caught IOException: " +  e.getMessage());
    	}
		return name;
    }
  
  	
    	
    
    
} 


package Assingment2;


import java.util.*;
    
class reverse
    {
       public static String reverse(String str)
       {
          char array1[] = str.toCharArray();
          char array2[] = new char[str.length()];
          int i = 0;
          int j = 0;
          for(char ch : array1)
          {
        	  if (Character.isLetter(ch))
        	  {
        		  array2[i] = ch;
        		  i++;
        	  }
          }
          
          i--;
          
          while(i>j)
          {
        	  char temp = array2[i];
        	  array2[i] = array2[j];
        	  array2[j] = temp;
        	  j++;
        	  i--;
        	  
          }
          
          for(i=0 , j=0 ; i<str.length() ; i++)
          {
        	  if (Character.isLetter(array1[i]))
        	  {
        		  array1[i] = array2[j];
        		  j++;
        	  }
          }
          
          return new String(array1);
          
          
       }
       
       public static void main(String args[])
       {
    	  String s1 = "sd#%gt$&dfsd";
    	  System.out.println("original string is " + s1);
          String str2 = reverse(s1);
          System.out.println("Reversed string is " + str2);
       }
       
    }

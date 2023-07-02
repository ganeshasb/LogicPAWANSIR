package LOGICAL;

import java.util.Scanner;

public class Palidromestring {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter you String:");
	
	         String str=  sc.next();
	         
	        String org_str =str;
	        
	        
	      String  rev = "";
	      
	      int len=str.length();
	      
	      System.out.println(len);
	      
	      
	      
	      for (int i=len-1; i>=0; i--) {
	    	  
	    	  rev=rev+str.charAt(i);	 
	    	  }
	      System.out.println(rev);
	      
	      if (org_str.equalsIgnoreCase(rev)) {
	    	  System.out.println(org_str+ "  is PAlidrome string");
	      }
	      else {
	    	  System.out.println(org_str+"   is not palidrome");
	      }
	}

}


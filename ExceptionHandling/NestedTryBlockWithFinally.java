package com.learnJava.ExceptionHandling;

public class NestedTryBlockWithFinally{    
	 public static void main(String args[]){   
	 //outer try block   
	  try{    
	  //inner try block 1  
	    try{    
	     System.out.println("going to divide by 0");    
	     int b =39/0;    
	   }  
	    //catch block of inner try block 1  
	    catch(ArithmeticException e)  
	    {  
	      System.out.println(e);  
	    }    
	       
	    
	    //inner try block 2  
	    try{    
	    int a[]=new int[5];    
	  
	    //assigning the value out of array bounds  
	     a[5]=4;    
	     }  
	  
	    //catch block of inner try block 2  
	    catch(ArrayIndexOutOfBoundsException e)  
	    {  
	       System.out.println(e);  
	    }  
	    
	    finally {
			  System.out.println("Finally inner works irrespective exception occurs or not");
		  }
	  
	      
	    System.out.println("other statement");    
	  }  
	  //catch block of outer try block  
	  catch(Exception e)  
	  {  
	    System.out.println("handled the exception (outer catch)");  
	  }    
	  finally {
		  System.out.println("Finally outer works irrespective exception occurs or not");
	  }
	  System.out.println("normal flow..");    
	 }    
	}  
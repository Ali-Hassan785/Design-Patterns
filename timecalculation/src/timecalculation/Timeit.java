package timecalculation;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Timeit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
//		 Arraylist
		int n=100000;
		 ArrayList<Integer> names = new ArrayList<Integer>();
		 
		 for (int i=1; i<=n; i++) 
	            names.add(i); 
	  
		 //Linkedlist
		 LinkedList<Integer> object = new LinkedList<Integer>(); 
		 
		long startTime = System.currentTimeMillis();
		System.out.println(startTime+" ms");
        int total=0;
	     
	      for (double i = 0; i < n; i++) {
	         total+=names.get((int) i);
	      }

	      long stopTime = System.currentTimeMillis();
	      System.out.println(stopTime+" ms");
	      long elapsedTime = stopTime - startTime;
	      System.out.println(elapsedTime+" ms" +"  total  " +total);
	   
	 
	      
	      for (int i=1; i<=n; i++) 
	            object.add(i); 
	    
	 	 
			long startTime1 = System.currentTimeMillis();
			System.out.println(startTime1+" ms");
	        int total1=0;
		     
		      for (double i = 0; i < n; i++) {
		         total1+=names.get((int) i);
		      }

		      long stopTime1 = System.currentTimeMillis();
		      System.out.println(stopTime1+" ms");
		      long elapsedTime1 = stopTime1 - startTime1;
		      System.out.println(elapsedTime1+" ms"  +"  total  " +total1);
	}
}

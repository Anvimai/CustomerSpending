package a1;

import java.util.Scanner;

public class A1Novice {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double total = 0.0;
		double totalEach = 0.0;
		int numEach = 0;
		double priceEach = 0.0;
		
		
		int numCust = scan.nextInt();
		//Double[] Total = new Double[numCust];
		
		
		for (int i = 0; i<numCust; i++, total = 0) {
			
			
		String firstName = scan.next();
		String lastName = scan.next();
		int numItems = scan.nextInt();
		
		 for (int in = 0; in < numItems; in++) {
			 
			 
			 
			  numEach = scan.nextInt();
			 String nameEach = scan.next();
			  priceEach = scan.nextDouble();
			  
			  totalEach = numEach*priceEach; 
			  total += totalEach;
			  
			 
			  
			  
		 }
		 System.out.print(firstName.charAt(0) + ". ");
		System.out.print(lastName +": ");
		 System.out.println(total);
		 
		}
		 
		
		
}//end main

}

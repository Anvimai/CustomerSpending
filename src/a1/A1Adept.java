package a1;

import java.util.Scanner;

public class A1Adept {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numEach = 0;
		double total = 0;
		double totalEach = 0.0;
		double storeTotal = 0.0;
		double billAvg = 0.0;
		double low = 0.0;
		double high = 0.0;
		String fNameM = "";
		String lNameM = "";
		String fNameL = "";
		String lNameL = "";
		
		
		
		//********************************************************
		
		int storCount = scan.nextInt();
		
		//Arrays for item names and prices 
		
		String[] ItemList = new String[storCount];
		Double[] ItemPriceList = new Double[storCount];
		
		
		//for loop to input item names and prices and assign those values to their
		//respective arrays.
		
		for (int i = 0; i < storCount; i++) {
			
			
			ItemList[i] = scan.next();
			
			ItemPriceList[i] = scan.nextDouble();
			
		}//end for loop 
		
		
		//********************************************************
		
		//input number of customers
		
		int numCust = scan.nextInt();
		
		//creating arrays to hold total and name values
		
		
		Double[] Total = new Double[numCust];
		String[] FirstName = new String[numCust];
		String[] LastName = new String[numCust];
		
		//nested for loop to input customer order information
		//begin outer for loop
			
		for (int i = 0; i<numCust; i++, total = 0) {
			
			
		String firstName = scan.next();
		String lastName = scan.next();
		int numItems = scan.nextInt();
		
		//begin inner for loop
		
		 for (int in = 0; in < numItems; in++) {
			 
			 
			 
			 numEach = scan.nextInt();
			 String nameEach = scan.next();
			 //Grab totalEach from GetPerItemTotal method
			 totalEach = GetPerItemTotal(ItemList, ItemPriceList, nameEach, numEach);
			 
			
			 
			 total += totalEach; 
			  
			  
			 
			
		 }//end inner for loop
		 
		//outer for loop is populating Total array with each customers total purchase value,
		//and populating Name arrays with corresponding customer names.
		//OutPut: Bill Average is calculated here.
		 
		Total[i]=total; 
		FirstName[i] = firstName;
		LastName[i] = lastName; 
		 
		 storeTotal += total; 
		 billAvg = storeTotal/numCust; 
		
		
		}//end outer for loop
		
		scan.close();
		
		//begin highest and lowest bill calculations
		
		high = Total[0];
		
		//highest bill for loop

		for (int i = 1; i<Total.length; i++) {
			
			 
			
			if (high<Total[i]) {
				
				high = Total[i];
			}
			
			}//end highest for loop
		
		
		
		
		low = Total[0];
		
		//begin lowest bill for loop
		
		for (int i = 1; i<Total.length; i++) {
			
			 
			
			if (low>Total[i]) {
				
				low = Total[i];
			}
			
			}//end lowest for loop
		
		//for loop to find customer name corresponding to highest bill
		
		for (int i = 0; i<Total.length; i++) {
			
			if(high==Total[i]) {
				
				fNameM = FirstName[i];
				lNameM = LastName[i];
			}
			
		}//end for loop
		
		
		//for loop to find customer name corresponding to lowest bill
		for (int i = 0; i<Total.length; i++) {
			
			if(low==Total[i]) {
				
				fNameL = FirstName[i];
				lNameL = LastName[i];
			}
			
		}//end for loop

		//print output
		//Biggest: First Last Value
		//Smallest: First Last Value
		//Average: Value
		
		System.out.printf("Biggest: " + fNameM + " " + lNameM + " (%.2f)", high);
		System.out.println();
		System.out.printf("Smallest: " + fNameL + " " + lNameL +  " (%.2f)", low);
		System.out.println();
		
		System.out.printf("Average: %.2f", billAvg);
		System.out.println();
	
		
		
}//end main
	
	//****************************************************************************

public static double GetPerItemTotal(String[] arr, Double[] pL, String s, int x) {
	
	double total = 0.0;
	 for(int i = 0; i < arr.length; i++) {
		 
		 //if statement calculating total per customer.
		 
		 if(s.equals(arr[i])) {
			 
			  total = pL[i]*x;
			
			 
		 	}//end if statement.
		 
		
	
	 	}
	 
	 return total; 
	 
}//end GetPerItemTotal method************************************************************



	//****************************************************************************


	
}//end class

package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numCustomers = scan.nextInt();
		String[] custFirstName = new String[numCustomers];
		String[] custLastName = new String[numCustomers];
		int numOfItems = 0 ;
		Double[] Total = new Double[numCustomers];
		double total = 0.0;
		double itemPriceTotal = 0.0;
		
		//for loop start
		for( int i = 0; i < numCustomers; i++) {
		
			custFirstName[i] = scan.next();
			custLastName[i] = scan.next();
			numOfItems = scan.nextInt();
			
			
			
			//nest for loop start
			
			for (int in = 0; in < numOfItems; in++) {
				
				int numOfEach = scan.nextInt();
				String itemName = scan.next();
				double itemPrice = scan.nextDouble();
				
				itemPriceTotal = itemPrice*numOfEach; 
				
			}//nest for loop end
			
			
				
		}//for loop end
		
		total += itemPriceTotal; 
		
		for (int in = 0; in < numCustomers; in++) {
			Total[in] = total;
		}
			
		

		//test print
		for (int i = 0; i < numCustomers; i++) {
		System.out.print(custFirstName[i].charAt(0) + ". ");
		System.out.print(custLastName[i] +": ");
		String totalstring  = String.format("%.2f", Total[i]);
		System.out.println(totalstring);
		}
		
	}
}

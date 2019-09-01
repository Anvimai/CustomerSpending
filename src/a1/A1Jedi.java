package a1;


import java.util.Scanner; 


public class A1Jedi {

public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int numEach = 0;
	int numItems = 0;
	String nameEach = "";
	int numCust = 0;
	 
	
	
	
	int storCount = scan.nextInt();
	
	
	String[] ItemList = new String[storCount];
	int[] ItemCount = new int[storCount];
	int[] NumCustBought = new int[storCount];
	
	
	//*****************************************************************************
	
	//begin for loop populating ItemList array and accepting Item Price.
	
		for (int i = 0; i < storCount; i++) {
		
		
			ItemList[i] = scan.next();
			Double ItemPriceList = scan.nextDouble();	
		
		}//end for loop populating ItemList array and accepting Item Price.
	 
//**************************************************************************************
		
		numCust = scan.nextInt();
		
		Double[] Total = new Double[numCust];
		String[] FirstName = new String[numCust];
		String[] LastName = new String[numCust];
		String NameEach = "";
		String NAMEEach = "";
		String NAMEEACH = "";
		
		for (int i = 0; i < numCust; i++){
			
			String firstName = scan.next();
			String lastName = scan.next();
			FirstName[i] = firstName;
			LastName[i] = lastName; 
			
			numItems = scan.nextInt();
			
			String[] ShoppingList = new String[numItems];
			
			for (int in = 0; in <numItems; in++) {
				
				
				numEach = scan.nextInt();
				
				nameEach = scan.next();
				
				
				
				
				for (int ind = 0; ind < storCount; ind++) {
					
					
					
					if(nameEach.compareTo(ItemList[ind])==0) {
						
						
						
						ItemCount[ind] += numEach;
						
					if((nameEach.compareTo(NameEach)!=0)&&(NumCustBought[ind]<=i)) {
						
						NumCustBought[ind]++;}
						
					NameEach = nameEach;
					NAMEEach = NameEach; 
					NAMEEACH =NAMEEach;
					
					}
					
					
					
					
				}
				
				
				
			}
			
			NameEach = "";
			NAMEEach = ""; 
			NAMEEACH ="";
		
		
		}
		
		
//************************************************************************************************		
		//begin print loop
					
				for (int in = 0; in<storCount; in++) {
					
					if (NumCustBought[in]==0) {
						
						System.out.print("No customers bought ");
						
					}
					
					else {
						
					System.out.print(NumCustBought[in] + " customers bought ");
					
					}
					
					if(ItemCount[in]==0) {
						
						System.out.print("");
					}
					
					else {
						
					System.out.print( ItemCount[in] + " ");
					
					}
					System.out.println(ItemList[in] + " ");
					
					
				}//end print loop
				
//***********************************************************************************************

 }//end main
	
}	

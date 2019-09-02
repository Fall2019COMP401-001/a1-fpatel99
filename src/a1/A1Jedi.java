package a1;

import java.util.Scanner;
import java.util.Arrays;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int totalitems= scan.nextInt();
		String[] NameArr= new String[totalitems];
		
		for (int i = 0; i<totalitems; i++) {
			String ItemName= scan.next();
			NameArr[i] = ItemName;
				
			Double ItemPrice = scan.nextDouble();
			Double[] PriceArr= new Double[totalitems];
			PriceArr[i] = ItemPrice;
			}
		
		int[] totalamounts = new int[totalitems];
		int[] totalcustomers = new int[totalitems];
		int numberofcustomers = scan.nextInt();

			for (int j=0; j<numberofcustomers; j++) {
				String FirstName = scan.next();
				String LastName = scan.next();
				int ItemNumber = scan.nextInt();
				
				//int[] amounts = new int[ItemNumber];
				//String[] items = new String[ItemNumber];
				
				for(int k=0; k<ItemNumber; k++) {
					
					int Amount = scan.nextInt();
					//amounts[k]= Amount;
					
					String Item = scan.next();
					//items[k]= Item;
					
					int index= Arrays.binarySearch(NameArr, Item);
					totalamounts[index] += Amount;
					
					if (Amount>0) {
						totalcustomers[index] += 1;
					}

					}
				if (j== numberofcustomers-1) {
					for (int r = 0; r<totalitems; r++) {
						if (totalamounts[r] > 0) {
						System.out.println(totalcustomers[r]+" customers bought "+totalamounts[r]+" "+NameArr[r]);
				}
						else {
							System.out.println("No customers bought "+NameArr[r]);
						}
			
		}
			
					
				}
	}
	}
}

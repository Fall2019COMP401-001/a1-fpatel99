package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		
		int totalitems= scan.nextInt();
		for (int i = 0; i<totalitems; i++) {
			String ItemName= scan.next();
			String[] NameArr= new String[totalitems];
			NameArr[i] = ItemName;
				
			Double ItemPrice = scan.nextDouble();
			Double[] PriceArr= new Double[totalitems];
			PriceArr[i] = ItemPrice;
			
			System.out.println(ItemName);
			System.out.println(ItemPrice);
			}
		
		int numberofcustomers = scan.nextInt();
		for (int j=0; j<numberofcustomers; j++) {
			String FirstName = scan.next();
			String LastName = scan.next();
			int ItemNumber = scan.nextInt();
			
			for(int k=0; k<ItemNumber; k++) {
				int Amount = scan.nextInt();
				String Item = scan.next();
				
				System.out.println(FirstName+LastName);
			}
		}
		
		
		
	}
}

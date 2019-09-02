package a1;

import java.util.Scanner;
import java.util.Arrays;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int totalitems= scan.nextInt();
		String[] NameArr= new String[totalitems];
		Double[] PriceArr= new Double[totalitems];
		
		for (int i = 0; i<totalitems; i++) {
			String ItemName= scan.next();
			
			NameArr[i] = ItemName;
				
			Double ItemPrice = scan.nextDouble();

			PriceArr[i] = ItemPrice;
			
			System.out.println(ItemName);
			System.out.println(ItemPrice);
			}
		
		int numberofcustomers = scan.nextInt();
		for (int j=0; j<numberofcustomers; j++) {
			String FirstName = scan.next();
			String LastName = scan.next();
			int ItemNumber = scan.nextInt();
			
			double Sum = 0;
			double MaxCost = 0;
			String MaxSpender = "";
			double MinCost = 0;
			String MinSpender = "";
			double TotalSpend = 0;
			double Average = 0;
			
			for(int k=0; k<ItemNumber; k++) {
				int Amount = scan.nextInt();
				String Item = scan.next();
				
				int Index = Arrays.binarySearch(NameArr, Item);
				double Price = PriceArr[Index];
				
				
				Sum += (Price*Amount);
				
				System.out.println(FirstName+LastName);
				
				if (Sum > MaxCost) {
					MaxCost= Sum;
					MaxSpender= (FirstName+" "+LastName);
				}
				
				if (Sum < MinCost) {
					MinCost= Sum;
					MinSpender= (FirstName+" "+LastName);
				}
				
				if (k == ItemNumber-1) {
					TotalSpend+= Sum;}
			}
				if (j == numberofcustomers-1) {
					Average= (TotalSpend / numberofcustomers);
					}
				
				System.out.println("Biggest: "+MaxSpender+" ("+MaxCost+")");
				System.out.println("Smallest: "+MinSpender+" ("+MinCost+")");
				System.out.println("Average: "+Average);
			}
		
		
		
		
	}
}

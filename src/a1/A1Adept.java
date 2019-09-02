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
			
			}
		
		double TotalSpend = 0;
		String Average = "";
		double ufMaxCost = 0;
		String MaxSpender = "";
		double ufMinCost = 100000000;
		String MinSpender = "";
		String MaxCost="";
		String MinCost= "";
		
		int numberofcustomers = scan.nextInt();
		for (int j=0; j<numberofcustomers; j++) {
			String FirstName = scan.next();
			String LastName = scan.next();
			int ItemNumber = scan.nextInt();
			
			double Sum = 0;
			
			for(int k=0; k<ItemNumber; k++) {
				int Amount = scan.nextInt();
				String Item = scan.next();
				
				int Index = Arrays.binarySearch(NameArr, Item);
				double Price = PriceArr[Index];
				
				
				Sum += (Price*Amount);
				
				if (k== ItemNumber-1) {
				if (Sum > ufMaxCost) {
					ufMaxCost = Sum;
					MaxCost= String.format("%.2f", ufMaxCost);
					MaxSpender= (FirstName+" "+LastName);
				
				}
				
				if (Sum < ufMinCost) {
					ufMinCost = Sum;
					MinCost= String.format("%.2f", ufMinCost);
					MinSpender= (FirstName+" "+LastName);
				}
				
				if (k == ItemNumber-1) {
					TotalSpend+= Sum;}

				if (j == numberofcustomers-1) {
					double UnformattedAv= (TotalSpend / numberofcustomers);
					Average= String.format("%.2f", UnformattedAv);
					
				
				System.out.println("Biggest: "+MaxSpender+" ("+MaxCost+")");
				System.out.println("Smallest: "+MinSpender+" ("+MinCost+")");
				System.out.println("Average: "+Average);
				}
				}
			}
		}
		
		}		
}

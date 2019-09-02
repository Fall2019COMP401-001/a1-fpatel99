package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		// Your code follows here.
		
	    int totalcustomers = scan.nextInt();// Read user input
	    
		for (int i = 0; i < totalcustomers; i++) {
			
			String firstname = scan.next();
			String lastname = scan.next();
			int itemtypes = scan.nextInt();
			
			char firstinitial = firstname.charAt(0);
			
			for (int j = 0; j < itemtypes; j++) {
			
				int numitems = scan.nextInt();
				String item = scan.next();
				double price = scan.nextDouble();
				
				double totalitem = (numitems * price);
				double[] totaling = new double[itemtypes];
				totaling[j] = totalitem;
				
				double sum=+ totaling[j];
				String.format("%.2f", totalitem);
				
				if (j == itemtypes-1) {		
					System.out.println(firstinitial+". "+lastname+": "+totalitem);
					
				}
					
			
				
				
			
	    	
	    	
	    
			}
		}
	}
}


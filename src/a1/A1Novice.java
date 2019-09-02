package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		// Your code follows here.
		
	    int totalcustomers = scan.nextInt();// Read user input
	    
		for (int i = 0; i <= totalcustomers; i++) {
			
			String firstname = scan.next();
			String lastname = scan.next();
			int itemtypes = scan.nextInt();
			
			for (int j = 0; j <= itemtypes; j++) {
			
				int numitems = scan.nextInt();
				String item = scan.next();
				double price = scan.nextDouble();
				
				double totalitem = (numitems * price);
				double[] totaling = new double[itemtypes];
				totaling[j] = totalitem;
				
				double placeholder= 0;
				
				double total= totaling[j]+ placeholder;
				
				System.out.println(total);
				
			}
	
					
		System.out.println(firstname+". "+lastname+":");
				
				
			
				
				
				
			
	    	
	    	
	    	
	    
			
			
		}
	}
}


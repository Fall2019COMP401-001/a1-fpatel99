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
			double sum = 0;
			for (int j = 0; j < itemtypes; j++) {
			
				int numitems = scan.nextInt();
				String item = scan.next();
				double price = scan.nextDouble();
				
				double totalitem = (numitems * price);
				
				double[] totaling = new double[itemtypes];
				totaling[j] = totalitem;
				
				double sum1= sum(totaling);
				
				
				
				
				if (j == itemtypes-1) {	
					String finalnumber= String.format("%.2f", sum1 );
					System.out.println(firstinitial+". "+lastname+": "+finalnumber);
					
					
			
				
				}
			
	    	
	    	
	    
			}
		}
	}

	private static double sum(double[] totaling) {
		// TODO Auto-generated method stub
		return 0;
	}
}


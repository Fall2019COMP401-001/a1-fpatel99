package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		// Your code follows here.
		
	    int totalcustomers = scan.nextInt();// Read user input
	    System.out.println(totalcustomers);
	    
	    
		for (int i = 0; i <= totalcustomers; i++) {
			
			String firstname = scan.next();
			String lastname = scan.next();
			int itemtypes = scan.nextInt();
			int totaling = 0;
			
			for (int j = 0; j <= itemtypes; j++);
			
				int numitems = scan.nextInt();
				String item = scan.next();
				double price = scan.nextDouble();
				
				int totalitem = (int) (numitems * price);
				
				int[] costs = new int[totalitem];
						
				for (int k = 0; k<= itemtypes; k++);
				
					int totalcost = totaling + totalitem;
			
			System.out.println(totalcost);
				
				
				
				
				
				
			
	    	
	    	
	    	
	    
	    	
	    
	    
	    }
		
	}

	private static Object calculateValueSum(int[] costs) {
		// TODO Auto-generated method stub
		return null;
	}
}

package powerprogram;

import java.util.Scanner;

public class PowerProg {

	public static void main(String[] args) {
		
	Scanner number = new Scanner (System.in);
	
	double base = number.nextDouble();
	double exponent = number.nextDouble();
	
    
	 double result = 1;

	    for ( int i=1; i<=exponent; i++) {
	    	System.out.println("before calculation result ="+result);
	    	result = result * base;
	    	System.out.println("after calculation result ="+result);
	    	System.out.println("increament ="+i);
	    }
	    

}

}


package exercsOO;

import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class exerc3 {

	public static void main(String[] args) {
		// Bhaskara's formula calculator
		
		Scanner input = new Scanner (System.in);
		DecimalFormat numberFormat = new DecimalFormat("#.##");
		
		int a, b, c;
		double result1, result2, delta;
		
		System.out.println("Given the formula \"ax^2+bx+c = 0\", insert a:");
		a = input.nextInt();
		System.out.println("Insert b:");
		b = input.nextInt();
		System.out.println("Insert c:");
		c = input.nextInt();
		
		delta = ((b*b) - (4*a*c));
		
		if (delta > 0) {
			result1 = ((-1*b) + Math.sqrt(delta))/(2*a);
			result2 = ((-1*b) - Math.sqrt(delta))/(2*a);
			
			System.out.println("The roots of the equation are: x1 = " +numberFormat.format(result1)+ "  and x2 = " +numberFormat.format(result2));
			
		} else if (delta == 0) {
			result1 = (-1*b)/(2*a);
			System.out.println("The root of the equation is: x = " +result1);
			
		} else {
			System.out.println("There are no roots for this equation.");
			
		}
		
		
		
	}

}

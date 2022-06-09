package exercsOO;

import java.util.Scanner;

public class exerc1 {
	
	public static void main (String[] args) {
		/*Program that calculates a driver's
		  fine according to his speed;    */
		
		int maxSpeed, driverSpeed, fine;
		Scanner input = new Scanner (System.in);
		
		System.out.println("What is the speed limit of the road?");
		maxSpeed = input.nextInt();
		System.out.println("What is the speed of the driver?");
		driverSpeed = input.nextInt();
		
		if (driverSpeed > (maxSpeed + 30)) {
			fine = 200;
			
		} else if (driverSpeed > (maxSpeed + 10)){
			fine = 100;

		} else if (driverSpeed > maxSpeed){
			fine = 50;
			
		} else {
			fine = 0;
		}
		
		System.out.println("The value of the fine is = " + fine);
		
	}

}

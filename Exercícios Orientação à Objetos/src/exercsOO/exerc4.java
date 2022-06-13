package exercsOO;

import java.util.Scanner;

public class exerc4 {

	public static void main(String[] args) {
		// Code to determine which date is further in the future;
		
		Scanner input = new Scanner (System.in);

		int day1, day2, mon1, mon2, ye1, ye2;
		
		System.out.println("Insert the first date, using space between the numbers:");
		day1 = input.nextInt();
		mon1 = input.nextInt();
		ye1 = input.nextInt();
		
		System.out.println("Now insert the second date:");
		day2 = input.nextInt();
		mon2 = input.nextInt();
		ye2 = input.nextInt();
		
		if (ye1 > ye2) {
			System.out.println("The first date is further in the future then the second one.");
			
		} else  if ((ye1 == ye2) & (mon1 > mon2)){
			System.out.println("The first date is further in the future then the second one.");

		} else if ((ye1 == ye2) & (mon1 == mon2) & (day1 > day2)) {
			System.out.println("The first date is further in the future then the second one.");
			
		} else if((ye1 == ye2) & (mon1 == mon2) & (day1 == day2)) {
			System.out.println("The dates are the same.");
			
		} else {
			System.out.println("The second date is further in the future then the first one.");
		}

		System.out.println(day1 + "/" + mon1 + "/" + ye1);
		System.out.println(day2 + "/" + mon2 + "/" + ye2);
		
	}

}

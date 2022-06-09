package exercsOO;

import java.util.Scanner;

public class exerc2 {

	public static void main(String[] args) {
		/* Verifying if a character is a
		 * number, vowel or consonant.   */
		
		Scanner input = new Scanner (System.in);
		
		char ch;
		int chAscii;
		
		System.out.println("Write a character:");
		ch = input.next().charAt(0);
		chAscii = (int) ch;
		
		if (chAscii < 58 & chAscii > 47) {
			System.out.println("You wrote a number.");
			
		} else if (chAscii == 65 || chAscii == 97 || 
				   chAscii == 69 || chAscii == 101 || 
				   chAscii == 73 || chAscii == 105 || 
				   chAscii == 79 || chAscii == 111 || 
				   chAscii == 85 || chAscii == 117) {
			System.out.println("You wrote a vowel.");
			
		} else if ((chAscii > 64 & chAscii < 91) || 
				   (chAscii > 97 & chAscii < 123)) {
			System.out.println("You wrote a consonant.");

		} else {
			System.out.println("You wrote a special character.");
		}


	}

}

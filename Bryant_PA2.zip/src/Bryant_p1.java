import java.util.Scanner;


public class Bryant_p1 {
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		String inputNum, inputNum2;
		int dig1, dig2, dig3, dig4, temp1;
		System.out.println("Enter a four digit number");
		inputNum = scnr.next();
		
		dig1 = (inputNum.charAt(0) - 48);
		dig2 = (inputNum.charAt(1) - 48);
		dig3 = (inputNum.charAt(2) - 48);
		dig4 = (inputNum.charAt(3) - 48); 
		
		
		dig1 = (dig1 + 7) % 10;
		dig2 = (dig2 + 7) % 10;
		dig3 = (dig3 + 7) % 10;
		dig4 = (dig4 + 7) % 10;
		
		temp1 = dig1;
		dig1 = dig3;
		dig3 = temp1;
		
		temp1 = dig2;
		dig2 = dig4;
		dig4 = temp1;
		
		System.out.println("The encrypted number is " + dig1 + dig2 + dig3 + dig4);
		
		System.out.println("Enter a four digit number that you want to decrypt");
		inputNum2 = scnr.next();
		decrypt(inputNum2);
		scnr.close();
	}
	public static void decrypt(String num) {
		
		int dig1, dig2, dig3, dig4, temp2;
	
		dig1 = (num.charAt(0) - 48);
		dig2 = (num.charAt(1) - 48);
		dig3 = (num.charAt(2) - 48);
		dig4 = (num.charAt(3) - 48);
		
		dig1 = (dig1 + 3) % 10;
		dig2 = (dig2 + 3) % 10;
		dig3 = (dig3 + 3) % 10;
		dig4 = (dig4 + 3) % 10;
		
		temp2 = dig1;
		dig1 = dig3;
		dig3 = temp2;
		
		temp2 = dig2;
		dig2 = dig4;
		dig4 = temp2;
		
		System.out.println("The decrypted number is " + dig1 + dig2 + dig3 + dig4);
		
	}
	
}
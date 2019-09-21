import java.util.Scanner;

public class Bryant_p3 {
	public static void main (String [] args) {
		Scanner scnr = new Scanner(System.in);
		int i, j, maxPos = 0, minPos = 0;
		double choice = 0, sum = 0, max = 0, min = 10;
		String[] topics = new String[5];
		double[][] responses = new double[5][10];
		double[] average = new double[5];
		double[] total = {0,0,0,0,0};
		
		topics[0] = "Climate Change";
		topics[1] = "Gun Control";
		topics[2] = "Vaping Deaths";
		topics[3] = "Police Violence";
		topics[4] = "Politcs";
		
		
		
		for (i = 0; i < 5; i++){
	         for (j = 0; j < 10; j++){
	        	System.out.println("Rate this topic from 1-10: " + topics[i]);
	     		choice = scnr.nextInt();
	     		responses[i][j] = choice;
	     		sum = choice + sum;
	         }
	         total[i] = sum;
	         average[i] = sum / 10;
	         sum = 0;
	      }
		System.out.println(topics[0] + "    " + topics[1] + "    " + topics[2] + "    " + topics[3] + "    " + topics[4]);
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 10; j++) {
				System.out.print(responses[i][j] + "    ");
			}
			System.out.println("The average ratings for this row is " + average[i]);
			if(total[i] > max) {
				max = total[i];
				maxPos = i;
			}
			if(total[i] < min) {
				min = total[i];
				minPos = i;
			}
		}
		System.out.println("The issue with highest point total is  " + topics[maxPos] + " with a count of " + max);
		System.out.println("The issue with lowest point total is  " + topics[minPos] + " with a count of " + min);
		scnr.close();
	}
}

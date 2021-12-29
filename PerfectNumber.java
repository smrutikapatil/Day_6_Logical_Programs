package bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter any number:");
		number = sc.nextInt();
		perfectnumber (number);
	}
	public static void perfectnumber (int number) {
		int i , sum = 0;
		for(i = 1; i <=number/2 ; i++) {
			if(number % i == 0 ) {
				sum = sum += i;
			}
		}
		if (sum == number) {
		System.out.println("it is a perfect number");
	}
		else {
			System.out.println("it is not perfect number");
		}
   }
}
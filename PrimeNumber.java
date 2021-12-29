package bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		boolean flag = true; 
		int num;
		System.out.println("Enter any number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i=2; i<num /2; i++) 
		{
			if(num % i == 0)
				flag = false;
		}
		if(flag == true) 
		{
		System.out.println("It is a prime number");	
		}
		else {
		System.out.println("It is not prime number");		
		}
	}
}

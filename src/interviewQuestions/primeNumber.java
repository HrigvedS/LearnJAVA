package interviewQuestions;

import java.util.Scanner;
//Program to take user input and give output that number is prime or not
public class primeNumber {

	public static void main(String[] args) {
		
		int a=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number");
		int number= sc.nextInt();
		
		if(number<1){
			System.out.println("Its not a valid input");
			
		}
		else {
		
		for(int i=2; i<=number/2; i++) {
			if(number% i ==0) {
				a=a+1;
			}
			}
		if(a<1) {
			System.out.println("Its a Prime number");
		}
		else {
			System.out.println("Its not a prime number");
		}
		}
		sc.close();

	}
}







package Basics;

import java.util.Scanner;

public class conditionalStatmentsIfElse {
	
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
//		int age= sc.nextInt();
//		
//		if (age>=18) {
//			System.out.println("u are adult");
//		}
//		else {
//			System.out.println("U are child");
//		}
		
//		int x= sc.nextInt();
//		
//		if (x%2 ==0) {
//			System.out.println("Even number");
//		}
//		else {
//			System.out.println("Odd Number");
//		}
//		
	int x= sc.nextInt();
	int y= sc.nextInt();
		
		if (x==y) {
			System.out.println("Equal");
		}
		else if(x>y) {
			System.out.println("x is big");
		}
		else {
			System.out.println("y is big");
		}
		
	}

}

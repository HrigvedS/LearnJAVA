package interviewQuestions;

import java.util.Scanner;

public class odd_even {

public static void main(String args[]) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any number to find the Type (Odd/Even)");
	 int number= sc.nextInt();
	sc.close();

	if(number %2 ==0) {
		System.out.println("It is a even number");
	}
	else{
		System.out.println("it is a odd number");
	}
}

}

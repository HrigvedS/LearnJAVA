package interviewQuestions;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String Name= s.nextLine();
		
		System.out.println("Given Input :"+Name);
		
		String NewName="";
		
		for(int i=Name.length()-1; i>=0;i--) {
			
			NewName = NewName+Name.charAt(i);
			
		}
		System.out.println("Reversed String :" + NewName);
		

	}

}

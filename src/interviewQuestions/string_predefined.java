package interviewQuestions;

import java.util.Scanner;

public class string_predefined {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.println("Enter any word");

StringModification st = new StringModification();
st.reverse(sc.next());
System.out.println("Enter any word with number to extract the value");
st.Extractnumber(sc.next(), 0);

sc.close();
		
		
	}

}
class StringModification{
	
	public String reverse(String name) {
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
		return rev;
		
	}
	public int Extractnumber(String name, int number) {
		int in = -1;
		 for (int i = 0; i < name.length(); i++) {
		        char c = name.charAt(i);
		        if (Character.isDigit(c)) { // Check if the character is a digit
		            in = Character.getNumericValue(c); 
			}
			System.out.println(in);
		}
		return in;
		
		
	}
	
}
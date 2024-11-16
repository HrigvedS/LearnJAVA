//Write a program to separate the Capital letter and the small letters from the sentence.

package interviewQuestions;

public class CapitalLetterSepration {

	public static void main(String[] args) {
		
		String s = "WelcoMe To JavA Questions";
		
		int Lower= 0;
		int Upper= 0;
		
		for(int i =0; i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>=65 && ch<=90)//for this number you can follow ASCII values
			{
				Upper++;
			}
			else
			{
				Lower++;
			}
		}
	System.out.println("Lower ="+ Lower);
	System.out.println("Upper ="+ Upper);
		
	}
}

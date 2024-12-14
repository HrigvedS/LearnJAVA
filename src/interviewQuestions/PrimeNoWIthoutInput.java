package interviewQuestions;

public class PrimeNoWIthoutInput {

	public static void main(String[] args) {
		int in= 11;//input depends on user
		int a= 0;
		
		if(in<2) {
			System.out.println("Its not a correct entry");
		}
		else {
		
		for(int i=2; i<=in/2; i++) {
			if(in%i==0) {
				a=a+1;
			}	
		}
		if(a<1) {
			System.out.println("Its a Prime Number");
		}
		else {
			System.out.println("Its not a prime number");
		}
		
	}
	}
}

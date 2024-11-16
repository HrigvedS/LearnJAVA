package interviewQuestions;

import java.util.Scanner;

public class LargetElemetInArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int q[]=new int [5];
		System.out.println("Enter the value");
		for(int i=0;i<5;i++) {
			q[i]=s.nextInt();
		}
		int max = q[0];
		for(int i=1;i<5;i++) {
			if(q[i]>max) {
				max=q[i];
			}
		}
System.out.println("max"+max);
	}

}

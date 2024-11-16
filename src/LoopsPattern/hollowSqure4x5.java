package LoopsPattern;

public class hollowSqure4x5 {

	public static void main(String[] args) {
		//outerloop
		for (int i=1;i<=4;i++) {
			//inner loop
			for (int j=1;j<=5;j++) {
				if (i==1 || j==5 || i==4 || j==1 ) {
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}System.out.println();
		}
			

	}

}

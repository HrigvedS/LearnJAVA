package LoopsPattern;

public class mirrorRightAngle4x4 {

	public static void main(String[] args) {
		
		int n= 4;
		//outer loop
		for (int i=1;i<=n;i++) {
			//inner loop
			for (int j=n;j<=n-1; j--) {
				System.out.print(" ");
			}
			for (int j=1; j<=n;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}

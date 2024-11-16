package Basics;
//
//import java.util.Scanner;
//
//public class myFirstCode {
//
//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int N = scanner.nextInt();
//        
//        if (N % 2 != 0) {
//            System.out.println("Weird");
//        } else {
//            if (N >= 2 && N <= 5) {
//                System.out.println("Not Weird");
//            } else if (N >= 6 && N <= 20) {
//                System.out.println("Weird");
//            } else if (N > 20) {
//                System.out.println("Not Weird");
//            }
//        }
//
//        scanner.close();
//    }
//}



public class myFirstCode {

//	  // Create a checkAge() method with an integer variable called age
//	  static void checkAge(double age) {
//
//	    // If age is less than 18, print "access denied"
//	    if (age < 18) {
//	      System.out.println("Access denied - You are not old enough!");
//
//	    // If age is greater than, or equal to, 18, print "access granted"
//	    } else {
//	      System.out.println("Access granted - You are old enough!");
//	    }
//
//	  }
//
//	  public static void main(String[] args) {
//	    checkAge(18); // Call the checkAge method and pass along an age of 20
//	  }
	
	public static void main(String args[]) {
		
		Studentinfo stu = new Studentinfo();
		stu.age= 54;
		stu.name="ayus";
		stu.studentinfo();
	}
}
	class Studentinfo{
		String name;
		int age;
		
		public void studentinfo() {
			System.out.println(this.name);
			System.out.print(this.age);
			
		}}
		
		
	
	
		
		
		
		

	// Outputs "Access granted - You are old enough!"
// Outputs "I just got executed!"
















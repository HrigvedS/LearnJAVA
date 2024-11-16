package Basics;

public class multiMethods {

	public static void StringOutput1(String name) {
		System.out.println(name);
	}
	
	public static String StringOutput2(String name) {
		System.out.println(name);
		return name;
	}
	//I have one question above methods are same ? These are two different way or something else.
	
	
	public static int NumericOutput(int a, int b, int c) {
		
		return a+b+c;
		
	}
	
	public static int NumericOutput(int a, int b) {
		
		return a*b;
	}

	
	public static void main(String[] args) {
		StringOutput1("Hrigved");
		StringOutput2("Sharma");
		System.out.println(NumericOutput(5,10,50));
		System.out.println(NumericOutput(5,10));

	}

}

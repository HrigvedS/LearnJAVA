package Basics;

import java.util.Scanner;

public class conditionalStatementSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		
		switch (button) {
		case 1: System.out.println("Hello");
		break;
		case 2: System.out.println("Namasty");
		break;
		case 3: System.out.println("Bonjour");
		break;
		case 4: System.out.println("khamagadi");
		break;
		}
		
	}
}

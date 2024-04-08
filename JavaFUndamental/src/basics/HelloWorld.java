package basics;

import java.util.Scanner;

public class HelloWorld {	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		System.out.print("Enter your gender(M/F): ");
		char gender = scanner.next().charAt(0);
		System.out.print("Enter your Phone Number: ");
		double number = scanner.nextDouble();
		
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
		System.out.println("Number : " + number);
	}
	
}

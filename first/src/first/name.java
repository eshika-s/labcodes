package first;

import java.util.Scanner;

public class name {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name= sc.nextLine();
		System.out.println(name.charAt(3));
	}

}

package ScannerClass;

import java.util.Scanner;

public class Scanner1 {

	// Scanner is a Final class which can not be inherited.
	// It is present in java.util package so it has to be Imported

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter any single String");
		String s1 = scn.next();
		System.out.println(s1);
		System.out.println(s1.length());

		System.out.println("Enter any interger");
		int i = scn.nextInt();
		System.out.println(i);

		System.out.println("Enter any double value");
		double d = scn.nextDouble();
		System.out.println(d);

		System.out.println("Enter any boolean value");
		boolean b = scn.nextBoolean();
		System.out.println(b);

		// To enter a character
		System.out.println("Enter any String");
		String s3 = scn.next();
		char ch = s3.charAt(0);
		System.out.println(ch);

		// To enter multiple words
		System.out.println("Enter multiple words");
		String s2 = scn.nextLine();
		System.out.println(s2);

	}

}

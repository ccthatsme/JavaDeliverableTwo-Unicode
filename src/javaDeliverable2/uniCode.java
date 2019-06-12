package javaDeliverable2;


import java.util.Scanner;
public class uniCode {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String str1;
		String str2;
		int Total1 = 0;
		int Total2 = 0;
		
		System.out.println("Enter a single string: ");
		str1 = scnr.nextLine();
		System.out.println("Enter one more string: ");
		str2 = scnr.nextLine();

		int i = 0;
		int x;
		for (x = str1.charAt(i); i < str1.length(); ++i) {
			int y = str1.charAt(i);
			System.out.print(str1.charAt(i) + ": " + y + "\r\n");
			Total1 = Total1 + y;
		}


		int z = 0;
		int a;
		for (a = str2.charAt(z); z < str2.length(); ++z) {
			int c = str2.charAt(z);
			System.out.print(str2.charAt(z) + ": " + c + "\r\n");
			Total2 = Total2 + c;
		}
		System.out.println("First String's Numeric Unicode Total: " + Total1);
		System.out.println("Second String's Numeric Unicode Total: " + Total2);
		System.out.println("Difference between the two totals(as an absolute value) is: " + Math.abs(Total1 - Total2));


	}
	}



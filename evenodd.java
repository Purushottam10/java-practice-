package tryproj;

import java.util.Scanner;

public class evenodd {
	private int number;
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
	}

	public void check() {
		if(number%2==0)
		{
			System.out.println("even");
		}
		else System.out.println("odd");
			 
	}
}

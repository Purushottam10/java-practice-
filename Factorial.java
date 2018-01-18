import java.util.Scanner;

public class Factorial {
	private static Scanner sc;

	public static void main(String[] args) {
		sc=new Scanner(System.in);
		int n,i=1,fact=1;
		System.out.println("enter the number");
		n=sc.nextInt();
		while(i<=n) {
			fact=fact*i;
			i++;
			System.out.println("factoria of "+ i +"! = "+fact);
		}
		System.out.println("factoria of "+ n+ "!="+fact);
		
	}
}

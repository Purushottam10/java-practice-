package tryproj;

import java.util.Scanner;

class process{
	private int a,b,c;
	private Scanner sc;
	public void accept() {
		sc = new Scanner(System.in);
		System.out.println("enter the numbers for checking");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	}
	int  greatestnum() {
		if(a>b)
		{
			if(a>c)
				{
				return a;
				}
			return c;
			
		}
		else if(b>a)
		{
			if(b>c)
			return b;
			else return c;
		}
		
		return 0;
		
		
	}
}
public class greatestnum {
	public static void main(String [] arg) {
		int greatestno;
		
		process pr1=new process();
		pr1.accept();
		greatestno=pr1.greatestnum();
		System.out.println(greatestno+ " "+"greatest no ");
	}
	

}

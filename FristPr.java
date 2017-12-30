package tryproj;

import java.util.Scanner;

public class FristPr {
	 static int phy,che,ds,average ;

	public static  int  inputdata()
	{
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the marks of physics ");
		phy=sc.nextInt();
		System.out.println("enter the marks of chemistry ");
		che=sc.nextInt();
		System.out.println("enter the marks of data structure ");
		ds=sc.nextInt();
		average=(phy+che+ds)/3;
        return average;
		}
	
	public static void main (String []arg ) {
		String name;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the student name ");
		name=sc.next();
		inputdata();
		System.out.println("average marks is "+average);
	
	}
}

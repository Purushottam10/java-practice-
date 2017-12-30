package tryproj;

import java.util.Scanner;


class Perfor{
	private int a,b,ch;
	Scanner sc=new Scanner(System.in);
	public void menuitem () {
		
		System.out.println("1 for sum ");
		System.out.println("2 for sub ");
		System.out.println("3 for mul ");
		System.out.println("4 for divide ");
		System.out.println("5 for Exit ");
		
		
	}
	public void accept() {
		
		System.out.println("enter the numbers ");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	
	public void choice() {
	
		
		do{	menuitem();
			System.out.println("enter the choice ");
			ch=sc.nextInt();
		
			switch(ch) {
		
		case 1:System.out.println("sum of number :"+(a+b));
		break;
		
		case 2:System.out.println("subtraction of number :"+(a-b));
		break;
		
		case 3:
			System.out.println("mul of number :"+a*b);
			break;
		case 4:
			System.out.println("division of number :"+a/b);
			break;
		default:System.out.println("wrong choice ");
		
				
		}		
		
		}while(ch<5);
		
	}
	}

	
	public class SwitchCase {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
          Perfor pr=new Perfor();
          pr.accept();
          pr.choice();
          
		}

	}


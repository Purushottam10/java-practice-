package tryproj;

import java.util.Scanner;

class Acceptdata{
	
	int ary1[][]=new int[3][3];
	Scanner sc=new Scanner(System.in);
	
	public void accept() {
		System.out.println("enter the matrix data");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ary1[i][j]=sc.nextInt();
			}
		}
	}
		public void sumoflowertr() {
			int sum=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i<j)
						sum=sum+ary1[i][j]	;
				}
			}
			System.out.println("sum of the lower tringale "+ sum);
			
		}
		public void sumofuppertr() {
			int sum=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i>j)
						sum=sum+ary1[i][j]	;
					
				}
			}
			System.out.println("show the messae for upper case ");
			System.out.println("sum of the upper tringale "+ sum);
		}
		public void sumoftr() {
			int sum=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(i==j)
						sum=sum+ary1[i][j]	;
				}
			}
			System.out.println("sum of the diagonale"+ sum);
		}
		public void transpose() {
			int[][] transposem=new int[3][3];
			for(int i=0; i<3; ++i)
			{  for(int j=0; j<3; ++j)
		        {
		            transposem[j][i] = ary1[i][j];
		        }
			}
			for(int i=0 ;i<3;i++) {
				for(int j=0;j<3;j++)
					{
					System.out.print(transposem[i][j]+" ");
					
					}
				System.out.println("");
			}
            
		}
		public void menu() {
			System.out.println("chose the key for operation ");
			int ch=0;
			System.out.println("1 sum of upprer triagle");
			System.out.println("2 sum of lower triagle");
			System.out.println("3 sum of diagonal triagle");
			System.out.println("4 traspose of matrix ");
			do{ 
				System.out.println("enter the choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1:sumofuppertr();
			break;
			case 2:
				sumoflowertr();
				break;
			case 3:
				sumoftr();
				break;
			case 4:
				transpose();
				break;
				default:
					System.out.println("wrong choice");
				
				
			}
				
			}while(ch<5);
			
		}
	}
	
public class MatrixOperation {
public static void main(String []ar) {
	Acceptdata in1=new Acceptdata();
	in1.accept();
	in1.menu();
	
}
}

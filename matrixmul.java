package tryproj;

import java.util.Scanner;

class Inputdata
{
	int ary1[][]=new int[3][3];
	int ary2[][]=new int[3][3];
	int ary3[][]=new int[3][3];
	Scanner sc=new Scanner(System.in);
	
	public void accept() {
		System.out.println("enter the matrix data");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ary1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the matrix data");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				ary2[i][j]=sc.nextInt();
			}
		}
		
	}
	public void calcuation() {
		 System.out.println("Multiplying the matrices...");
	        for (int i = 0; i < 3; i++)
	        {
	            for (int j = 0; j < 3; j++)
	            {
	                for (int k = 0; k < 3; k++)
	                {
	                    ary3[i][j] = ary3[i][j] + ary1[i][k] * ary2[k][j];
	                }
	            }
	        }
	        System.out.println("The product is:");
	        for (int i = 0; i < 3; i++)
	        {
	            for (int j = 0; j < 3; j++)
	            {
	                System.out.print(ary3[i][j] + " ");
	            }
	            System.out.println();
	        }
		
	}
	
}

public class matrixmul {
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int res[][]=new int[3][3];
	
	public static void main(String arg[]) {
		Inputdata indata=new Inputdata();
		
		indata.accept();
		indata.calcuation();
		
	}

}

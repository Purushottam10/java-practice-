//import java.io.*;
import java.util.Scanner;

public class GetIntArray {

	int ary[];
	int n ;
	public void getdata() {
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the value");
		 n=sc.nextInt();
		 
		 ary=new int[n];
		 System.out.println("enter int");
		 for(int i=0;i<n;i++) {
			 ary[i]=sc.nextInt();
		 }
		//System.out.println(ary[1]);
		}
	
	void calculate() {
		int i=0, min=ary[0];


		while(i<n){
		           if(	min>=ary[i]) {
			           
		        	   min=ary[i];
		        	   i+=1;
		           }
		           else {
		        	   i+=1;
		           }
		      }
		System.out.println(min);
	}
	}


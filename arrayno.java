package tryproj;

import java.util.Scanner;

public class arrayno {
	Scanner  sc=new Scanner(System.in);	
	int count=0 , count1=0;
	/*arrayno(){
		System.out.println("enter the no of size of array");
		n=sc.nextInt();
		System.out.println("enter the no of size of array"+n);
	}*/
	//System.out.println(n);
	
	int ary[]=new int[5];
	public void getdata() {
		
		
		
		System.out.println("enter the data ");
		for(int i=0;i<5;i++) {
			ary[i]=sc.nextInt();
		}
		
	}
	public void calcutate() {
		for(int i=0;i<5;i++) {
			if(ary[i]%2==0) {
				count+=1;
				
			}
			else {
				count1+=1;
			}
		}
		if(count%2==0&&count1%2!=0) {
			System.out.println("the no of even no is even time  and odd no is odd time ");
		}
		else System.out.println("no");
		
	}

}

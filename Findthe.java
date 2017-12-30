package tryproj;

import java.util.Scanner;

class accept {
	int ary1[]=new int[5];
		Scanner sc=new Scanner(System.in);
	public void getdata() {
      System.out.println("enter the tree length");
		
		for(int i=0;i<5;i++) {
			ary1[i]=sc.nextInt();
		}
		
	}
	public void check() {
		int temp=0,i=0;
		temp=ary1[0];
		while(i<5) {
			if(temp>ary1[i])
				{
				i++;
				}
			else {
				temp=ary1[i];
				System.out.println(temp);
					i++;
				}
	}
}
	
}
public class Findthe {
public static void main(String []arg) {
	accept a=new accept();
	a.getdata();
	a.check();
	
}
}

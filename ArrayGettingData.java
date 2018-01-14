import java.util.Scanner;

public class ArrayGettingData {
	int n;
	Scanner scanner= new Scanner(System.in);
	
	void getdata() {
		//System.out.println("enter the length of array");
		//n=scanner.nextInt();
		String str=new String();
		System.out.println("enter the input ");
		str=scanner.next();
		//str=str.toUpperCase();
		int count=0,count1=0;
		n=str.length();
		char []ary=new char[n];
		ary=str.toCharArray();
		for(int i=0;i<n;i++) {
			if(ary[i]=='1'||ary[i]=='2'||ary[i]=='3'||ary[i]=='4'||ary[i]=='5'||ary[i]=='6'||ary[i]=='7'||ary[i]=='8'||ary[i]=='9') {
				//System.out.println("special symbol"+ary[i]);
				count+=1;
			}
			else //System.out.println(ary[i]);
			count1+=1;
		}
		System.out.println("no of integer used   "+count+"  no of alphabates :"+count1);
	}
}

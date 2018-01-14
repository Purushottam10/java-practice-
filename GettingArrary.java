import java.io.*;
import java.util.Scanner;

public class GettingArrary {
int  n ;
char ary[];
String str=new String();
void getdata() {
	//Scanner sc=new Scanner(System.in);
	BufferedReader sc =new BufferedReader(new InputStreamReader(System.in));
	try {
       // System.out.println("enter the length of string ");
		System.out.println("enter the string");
		str=sc.readLine();
		n=str.length();
		ary=new char[n];
		
		ary=str.toCharArray();
	}
	catch(Exception ex ) {
		System.out.println(ex);
	}
}
}

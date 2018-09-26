package selfpratics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Kth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String str=new String();
        char c=0;
       // StringBuffer strb=new StringBuffer(str);
        try {
			str =sc.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        char [] ch=str.toCharArray();
        int  count=0,scount=0;
        for(int i=0;i<(str.length()-1);i++) {
        	//char c =ch[i];
        for(int j=i+1;j<(str.length()-1);j++) {
        	if(ch[i]==ch[j]) {
        		count++;
        	}
        }
        if(scount<=count) {
        	scount=count;
        	count=0;
        	c=ch[i];
        }
          else {
        	count=0;//c=ch[i];
        	
          }
        }
       /* System.out.println(c);
      str.replaceAll(" ", "");//('c', 'c');
*/	
        for( char chr:ch) {
        	if(chr!=c) {
        		System.out.print(chr);
        	}
        }
        	
        	}

}

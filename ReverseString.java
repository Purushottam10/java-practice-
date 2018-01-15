


public class ReverseString {

	GettingArrary gda=new  GettingArrary();
	void reversingstr() {
		int count =0;
 	
		for(int i=0;i<gda.str.length();i++)
		{
			count=0;
			if((gda.ary[i]>='a'&&gda.ary[i]<='z')) {
			count+=1;
			}
		else System.out.println("not a valid string");
		break;
		}
		if(count==gda.str.length()) {
			for(int i=gda.n-1;i>=0;i--) {
			System.out.print(gda.ary[i]);
		}
			
	}else System.out.println("not a valid string");
}
}

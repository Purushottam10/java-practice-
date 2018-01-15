//reverse the String having only lowerr alphabates
public class ReverseString {

	GettingArrary gda=new  GettingArrary();
	void reversingstr() {
		int count =0,i=0;
 	//char ary[] =new char[gda.str.length()];
		while(i<gda.str.length())
		{
			if((gda.ary[i]>='a'&&gda.ary[i]<='z')) {
			i++;
			count=i;
			}
		else {
			System.out.println("not a valid string");
			break;
		}
		
		}
		if(count==gda.str.length()) {
			for( i=gda.n-1;i>=0;i--) {
			System.out.print(gda.ary[i]);
		}
			
	}
		}
}

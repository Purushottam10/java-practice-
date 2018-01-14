
public class ReverseString {

	GettingArrary gda=new  GettingArrary();
	void reversingstr() {
		int count =0;
 	//char ary[] =new char[gda.str.length()];
		for(int i=0;i<gda.str.length();i++)
		{
			if((gda.ary[i]>='a'&&gda.ary[i]<='z')) {
			//ary[i]=gda.ary[i];
			count+=1;
			}
		else System.out.println("not a valid string");
		break;
		}
		if(count>0) {
			for(int i=gda.n-1;i>=0;i--) {
			System.out.print(gda.ary[i]);
		}
	}
}
}

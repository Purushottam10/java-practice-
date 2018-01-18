
public class PalidromeString {
	GettingArrary gd= new GettingArrary();
	boolean revesingString() {
		//System.out.println("hello");
		boolean flag=true;
		int i=0;
		while(i<(gd.str.length())/2+1) {
				if(gd.ary[i]!=gd.ary[gd.str.length()-i-1]) {
			     flag=false;
		      }
			else {
				flag=true;
			}
			i++;
		}
		if(flag==true) {
			 System.out.println("String is Armstrong ::"+gd.str);
		}
		else System.out.println("String is not Armstron ::"+gd.str);
		return true;
	}

}

public class ReverseString {

	GettingArrary gda=new  GettingArrary();
	void reversingstr() {
		int counta =0,i=0,count1=0,scount=0;
 			while(i<gda.str.length())
		{
			if((gda.ary[i]>='a'&&gda.ary[i]<='z')) {
			i++;
			counta=i;
			}
			else if(gda.ary[i]>='A'&&gda.ary[i]<='Z') {
				i+=1;
				count1+=1;
				
			}
			else if(gda.ary[i]>=27&&gda.ary[i]<=64){
				i+=1;
				scount+=1;
						}
			else if(gda.ary[i]>=91&&gda.ary[i]<=96) {
				i++;
				scount+=1;
				
			}
		
		}
		if(counta==gda.str.length()) {
			for( i=gda.n-1;i>=0;i--) {
			System.out.print(gda.ary[i]);
		}
		}
			if(count1>0&&scount==0) {
				System.out.println("no of capital alphabate"+count1);
			}
			if(scount>=1&&count1==0) {
				System.out.println("no of special character "+scount);
			}
			if(count1>=1&&scount>=1) {
				System.out.println("no of capital alphabate  ::  "+count1+"  no of special character :: "+scount);
			}
			
	}
		}

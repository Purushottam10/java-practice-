
public class ImpReverse {
public static void main(String []arg) {
	GettingArrary gd=new GettingArrary();
	gd.getdata();
	ReverseString rs=new ReverseString();
	//System.out.println(gd.ary[2]);
	try{
		rs.gda=gd;
		rs.reversingstr();
	}
	catch(Exception ex){
		System.out.println(ex);
	}
}
}



public class FindMin {
	
	
	public void calculate() {
		GetIntArray ob=new GetIntArray();
		int min,i=0;
	 GetIntArray gd=new GetIntArray();
		System.out.println(ob.n);
//System.out.println(gd.ary[1]);
    System.out.println("in the find "+""+ob.n);
try{
	min=ob.ary[0];


while(i<ob.n){
           if(	min >=ob.ary[i]) {
	            System.out.println(ob.ary[i]);
        	   min=ob.ary[i];
        	   i++;
           }
           i++;
      }
System.out.println(min);
}

catch(Exception ex){
	System.out.println(ex);
}
  }
}

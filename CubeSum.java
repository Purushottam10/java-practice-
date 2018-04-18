package arraytest;

public class CubeSum {

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,rem,temp;  
	    int n=370;//It is the number to check armstrong  7^3=343, 3^3=27 343+27=370
	    
	    temp=n;
	    if (n<=0) {
	    	System.out.println("number must be greater than 0 ");
	    }
	    else{
	    	  
	    
	    while(n>0)  
	    {  
	    rem=n%10;  
	    n=n/10;  
	    sum=sum+(rem*rem*rem);  
	    } 
	    if(temp==sum)  
		    System.out.println
		    (1);   
		    else  
		        System.out.println(0); 
	    }
	
	     
	}

}

import java.util.Scanner;

public class TableOfNum {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=1;  
	    sc = new Scanner(System.in);
		 System.out.println("enter the no to write the table");
	    n=sc.nextInt();
	    while(i<=10) {
	     System.out.println(n+" * "+i+"="+ n*i);
	     i++;
	    }
	}

}

/*1->n-Primeable number 

*/package arraytest;

public class PrimeArray {

	public static void main(String[] args) {
		int a[] = {9,15,13};
		int len = a.length;
		int a2[] = new int[len];
		int n = 2, flag = 0;
		for (int i = 0; i < len; i++) {
			a2[i] = a[i] + n;
		}
		for (int j = 0; j < len; j++) {
			
			for (int k = 2; k < a2[j]/2; k++) {
				 
				if (a2[j] % k == 0) {
					flag =  1;
					
				}

			}
		}
		if (flag == 0) {
			System.out.println("n-primable");
		} else
			System.out.println(" not n-primable");

	}
}

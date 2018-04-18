package arraytest;

public class AbsulateNumber {
	public static void main(String[] arg) {
		int a[] = {0,-3,0,-4,0};//define the array
		int len = a.length;
		int diff[] = new int[len];

		int num1;
		int num2;
		for (int i = 0; i < len-1; i++) {
			num1 = a[i];
			num2 = a[i + 1];
			diff[i] = num1 - num2;
			if (diff[i] < 0) {
				diff[i] = -1 * diff[i];

			}

		}

		for (int j = 0; j < len-1; j++) {
			if(a[0]<0) {
				diff[0]=-1*diff[0];
			}
			System.out.println(diff[j]);
		}
	}
}

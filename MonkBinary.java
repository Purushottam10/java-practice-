package selfpratics;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Scanner;
 
public class MonkBinary  {
	static double eps = (double) 1e-6;
 
	public static void main(String[] args) throws FileNotFoundException {
	Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		// InputReader in = new InputReader(new FileInputStream("in.txt"));
		// PrintWriter out = new PrintWriter(new FileOutputStream("out.txt"));
 
		int t = 1;
 
		for (int w = 1; w <= t; w++) {
 
			int n = in.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
 
			}
			long ans = 0;
			for (int i = 0; i < n; i++) {
				long an = 0;
				a[i] = a[i] ^ 1;
				int cnt = 0;
				int xor = 0;
				int cnt2 = 1;
				for (int j = 0; j < n; j++) {
					xor = xor ^ a[j];
					if (xor == 0) {
						cnt2++;
						an = an + cnt;
					} else {
						an = an + cnt2;
						cnt++;
					}
				}
				a[i] = a[i] ^ 1;
				ans = Math.max(ans, an);
			}
			out.println(ans);
		}
 
		out.close();
	}
 
}
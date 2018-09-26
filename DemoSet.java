package selfpratics;
/*
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {
public static void main(String[]arg) {
	//Set<Integer > name=new HashSet<>();
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int []array=new int[a];
	int sum=0;
	for(int i=0;i<a;i++) {
		array[i]=sc.nextInt();
	}
	for(int i=0;i<array.length;i++) {
		sum=sum+array[i];
	}
System.out.println(sum);
	SecondLarg scl=new SecondLarg();
	System.out.println(scl.secondLarge(array, a));
    }
 }

 class SecondLarg{
	 public int secondLarge(int []arry ,int a) {
		 int max=0,second=0;
		 if(arry.length<2) {
			 System.out.println("not found  two no");
		 }
		 for(int i=0;i<a;i++) {
			 if(arry[i]>max) {
				 second=max;
				 max=arry[i];
				 }
				 else if (arry[i]>second && arry[i]!=max) {
				second=arry[i];	
				}
			 }
		 
		 
		 return second;
	 }
 }

*/
/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
*/
import java.util.*;
import java.io.IOException;
 
 import java.io.DataInputStream;
    import java.io.FileInputStream;
    import java.io.IOException;
    import java.io.InputStreamReader;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
class TestClass {
    
    
    
    public static class Gas_Station implements Comparable<Gas_Station>
    {
        public int Location, Price, Distance;
        
        public Gas_Station(int L,int P, int D)
        {
           Location=L;
           Price=P;
           Distance=D;
        }
        
        public int getPrice()
        {
            return Price;
        }
        
        public int getDist()
        {
            return Distance;
        }
        public int getLoc()
        {
            return Location;
        }
        
        @Override
        public int compareTo(Gas_Station G)
        {
            return Integer.compare(this.getPrice(), G.getPrice());
        }
        
        
    }
    
    public static long Greedy_Gas(String[] GAS_PRICES,String[] DISTANCES_TO_NEXT,int CASE_SIZE)
    {
        int last=CASE_SIZE;
        int loc;
        long cost=0;
        long temp_dist=0;
        PriorityQueue<Gas_Station> PQ =new PriorityQueue<Gas_Station>(CASE_SIZE);
        Gas_Station[] GS=new Gas_Station[CASE_SIZE];
        for(int i=0; i<CASE_SIZE;i++ )
        {
        	Gas_Station G_temp=new Gas_Station(i, Integer.parseInt(GAS_PRICES[i]),Integer.parseInt(DISTANCES_TO_NEXT[i]));
        	PQ.add(G_temp);
            GS[i]=G_temp;
        }
        
 
        while(!PQ.isEmpty()&&last>0)
        {
            Gas_Station G=PQ.poll();
            loc=G.getLoc();
            if(loc<last)
            {
            	
            	for(int i=loc;i<last;i++ )
            	{
            		temp_dist+=GS[i].getDist();
            	}
            	
                cost+=G.getPrice()*temp_dist;
                last=loc;
                temp_dist=0;
            }
        }
        
        return cost;
    }
	
    
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        
        
	        
	        
	        Reader sc = new Reader();
		int tcNumber = sc.nextInt();
		long petrolCosts[] = new long[(int) 100000];
		long chkPoints = 0;
		for (int tccounter = 0; tccounter < tcNumber; tccounter++) {
			chkPoints = sc.nextLong();
			long petrolVolume = 0;
			for (int costCounter = 0; costCounter < chkPoints; costCounter++)
				petrolCosts[costCounter] = sc.nextInt();
			long minimumcost = petrolCosts[0];
			for (int petrolcounter = 0; petrolcounter < chkPoints; petrolcounter++) {
 
				if (minimumcost > petrolCosts[petrolcounter]) {
					minimumcost = petrolCosts[petrolcounter];
				}
 
				petrolVolume += minimumcost * sc.nextInt();
 
			}
	
			System.out.println(petrolVolume);
		}
		sc.close();
	        
 
    }
}
class Reader
        {
            final private int BUFFER_SIZE = 1 << 16;
            private DataInputStream din;
            private byte[] buffer;
            private int bufferPointer, bytesRead;
     
            public Reader()
            {
                din = new DataInputStream(System.in);
                buffer = new byte[BUFFER_SIZE];
                bufferPointer = bytesRead = 0;
            }
     
            public Reader(String file_name) throws IOException
            {
                din = new DataInputStream(new FileInputStream(file_name));
                buffer = new byte[BUFFER_SIZE];
                bufferPointer = bytesRead = 0;
            }
     
            public String readLine() throws IOException
            {
                byte[] buf = new byte[64]; // line length
                int cnt = 0, c;
                while ((c = read()) != -1)
                {
                    if (c == '\n')
                        break;
                    buf[cnt++] = (byte) c;
                }
                return new String(buf, 0, cnt);
            }
     
            public int nextInt() throws IOException
            {
                int ret = 0;
                byte c = read();
                while (c <= ' ')
                    c = read();
                boolean neg = (c == '-');
                if (neg)
                    c = read();
                do
                {
                    ret = ret * 10 + c - '0';
                }  while ((c = read()) >= '0' && c <= '9');
     
                if (neg)
                    return -ret;
                return ret;
            }
     
            public long nextLong() throws IOException
            {
                long ret = 0;
                byte c = read();
                while (c <= ' ')
                    c = read();
                boolean neg = (c == '-');
                if (neg)
                    c = read();
                do {
                    ret = ret * 10 + c - '0';
                }
                while ((c = read()) >= '0' && c <= '9');
                if (neg)
                    return -ret;
                return ret;
            }
     
            public double nextDouble() throws IOException
            {
                double ret = 0, div = 1;
                byte c = read();
                while (c <= ' ')
                    c = read();
                boolean neg = (c == '-');
                if (neg)
                    c = read();
     
                do {
                    ret = ret * 10 + c - '0';
                }
                while ((c = read()) >= '0' && c <= '9');
     
                if (c == '.')
                {
                    while ((c = read()) >= '0' && c <= '9')
                    {
                        ret += (c - '0') / (div *= 10);
                    }
                }
     
                if (neg)
                    return -ret;
                return ret;
            }
     
            public char nextChar() throws IOException {
                byte c = read();
                while (c <= ' ')
                    c = read();
                return (char)c;
            }
            
            private void fillBuffer() throws IOException
            {
                bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
                if (bytesRead == -1)
                    buffer[0] = -1;
            }
     
            private byte read() throws IOException
            {
                if (bufferPointer == bytesRead)
                    fillBuffer();
                return buffer[bufferPointer++];
            }
     
            public void close() throws IOException
            {
                if (din == null)
                    return;
                din.close();
            }
        }
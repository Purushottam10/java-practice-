//maximum equal Array
package arraytest;

public class ArraryTest {
public static void main(String[] args) {
	int a[]= {-2,-4,-6,-8,-11,13,16,16};
	int len=a.length;
	int min,max,i,countMin,countMax;
	if(len==0)
	{
		System.out.println("Empty Array");
	}
	else if(len==1)
	{
		System.out.println("Array Must Have atleast 2 elements");
	}
	else
	{
		min=a[0];
		max=a[0];
		for(i=1;i<len;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		if(min==max)
		{
			System.out.println("Array Must Contain 2 different elements");
			
		}
		else
		{
			countMax=0;
			countMin=0;
			for(i=0;i<len;i++)
			{
				if(a[i]==max)
				{
					countMax++;
				}
				if(a[i]==min)
				{
					countMin++;
				}
			}
			if(countMax==countMin)
			{
				System.out.println("This is a Maxim Equal Array");
			}
			else
			{
				System.out.println("This is not a Maxim Equal Array");
			}
		}
	}
}
}

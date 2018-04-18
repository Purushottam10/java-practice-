package arraytest;

public class BaseRounding {
	void doIntegerBasedRounding(int[] a, int n) {
		int round = 0, remainder, distance;
		if (n > 0) 
		{
			for (int x : a) 
			{
				if (x < 0) 
				{
					round = x;
				} else 
				{
					int quotient = x / n;
					if (quotient == 0) 
					{

						distance = n - x;
						if (distance > (n / 2)) 
						{

							round = 0;
						} else 
						{
							round = n;
						}
					} 
					else if (quotient == 1 && x <= n) 
					{
						round = n;
					} 
					else 
					{

						int temp = x;

						do 
						{
							remainder = temp % n;
							temp++;
						} while (remainder != 0);
						if (!(((temp - 1) - x) > (x - n))) 
						{
							round = temp - 1;
						}

					}

				}
				System.out.println(round);
			}
		} 
		else 
		{
			for (int x : a) 
			{
				round = x;
				System.out.println(round);
			}
		}
	}
}

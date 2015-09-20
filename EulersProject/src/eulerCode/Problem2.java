package eulerCode;

public class Problem2 
{
	public static void main(String[] args)
	{
		int fibNumSum = 0;
		int fibNum = 1;
		int fibNumPrev = 1;
		while (fibNum < 4000000)
		{
			fibNum = fibNum + fibNumPrev;
			fibNumPrev = fibNum - fibNumPrev;
			if (fibNum%2==0)
			{
				fibNumSum += fibNum;	
			}
			System.out.println(fibNumSum);
		}
	}
}

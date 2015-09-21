package eulerCode;

public class Problem010 
{
	public static void main(String[] args)
	{
		int maxPrime = 2000000;
		long primeSum = 0L;
		for(int i=2; i<maxPrime; i++)
		{
			if(isPrime(i))
			{
				primeSum += i;		
			}
		}
		System.out.println(primeSum);
	}
	public static boolean isPrime(int x)
	{
		boolean prime = true;
		int xval = (int)Math.sqrt(x);
		for (int i = 2; i <= xval; i++) 
		{
			if (x % i == 0) 
			{
				prime = false;
				break;
			}
		}
		return prime;
	}
}

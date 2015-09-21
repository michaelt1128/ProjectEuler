package eulerCode;

public class Problem007 {
	public static void main(String[] args)
	{
		int primeCount = 0;
		long primeNum = 0;
		int maxCount = 10002;
		while(primeCount<=maxCount)
		{
			primeNum++;
			if(isPrime(primeNum) == true)
			{
				primeCount++;
			}
		}
		System.out.println("Prime " + maxCount + ": " + primeNum);
	}
	public static boolean isPrime(long x)
	{
		boolean prime = true;
		for (int i = 2; i < x/2; i++) 
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

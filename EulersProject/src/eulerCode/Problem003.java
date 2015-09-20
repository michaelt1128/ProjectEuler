package eulerCode;

public class Problem003 {
	public static void main(String[] args)
	{
		long num = 600851475143L;
		long i=2L;
		boolean hasFound = false;
		while (hasFound == false)
		{
			if((num%i==0) && isPrime(num/i))
			{
				long value = num/i;
				System.out.println("maybe" + value);
				hasFound = true;
			}
			i++;			
		}
	}
	public static boolean isPrime(long x)
	{
		boolean prime = true;
		long y =2L;		
		while (y < (x/2))
		{
			if(x%y==0)
			{
				prime = false;
				y = x;
			}
			y++;
		}
		return prime;
	}
}

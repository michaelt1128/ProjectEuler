package eulerCode;

import java.math.BigInteger;

public class Problem015 {
	public static void main(String[] args)
	{
		for(int len = 0; len <=100; len++)
		{
			int n = len;
			int k = len;
			System.out.println("binom: " + binomialCoefficient(n+k, n));
		}
	}
	public static String factorial(int n) 
	{
	       BigInteger fact = new BigInteger("1");
	       for (int i = 1; i <= n; i++) 
	       {
	           fact = fact.multiply(new BigInteger(i + ""));
	       }
	       return fact.toString();
	   }
	public static long binomialCoefficient(int nplusk, int k)
	{
		BigInteger a = new BigInteger(factorial(nplusk));
		BigInteger b = new BigInteger(factorial(nplusk-k));
		BigInteger c = new BigInteger(factorial(k));
		BigInteger binom = a.divide(c.multiply(b));
		return binom.longValue();
	}
}

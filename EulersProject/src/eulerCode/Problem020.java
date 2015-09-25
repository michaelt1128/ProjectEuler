package eulerCode;

import java.math.BigInteger;

public class Problem020 {

	public static void main(String[] args) {
		BigInteger factorial = new BigInteger("1");
		for(int i = 100; i>1; i--)
		{
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		System.out.println(factorial);
		String x = String.valueOf(factorial);
		int sum = 0;
		for(int j = 0; j<x.length();j++)
		{
			sum += Integer.valueOf(x.substring(j, j+1));
		}
		System.out.println(sum);
	}
}

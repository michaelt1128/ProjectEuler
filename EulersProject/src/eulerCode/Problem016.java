package eulerCode;

import java.math.BigInteger;

public class Problem016 {
	public static void main(String[] args)
	{
		int sum = 0;
		BigInteger two = new BigInteger("2");
		String str = two.pow(1000).toString();
		for(int i = 0; i<str.length(); i++)
		{
			sum+=Integer.valueOf(str.substring(i, i+1));
		}
		System.out.println(sum);
	}
}

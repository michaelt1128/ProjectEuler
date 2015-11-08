package eulerCode02;

import java.math.BigInteger;

public class Problem048 {
	public static void main(String[] args) {
		BigInteger sum = new BigInteger("0");
		for(int i = 1; i<=1000; i++) {
			BigInteger j = new BigInteger(String.valueOf(i));
			sum = sum.add(j.pow(i));
			System.out.println(i);
		}
		System.out.println(sum.toString().substring(sum.toString().length()-10, sum.toString().length()));
	}
}

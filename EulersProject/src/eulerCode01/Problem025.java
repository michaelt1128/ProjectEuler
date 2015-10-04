package eulerCode01;

import java.math.BigInteger;

public class Problem025 {

	public static void main(String[] args) {
		BigInteger fibNum = new BigInteger("1");
		BigInteger fibNumPrev = new BigInteger("1");
		int term = 2;
		while(fibNum.toString().length()<1000) {
			term++;
			fibNum = fibNum.add(fibNumPrev);
			fibNumPrev = fibNum.subtract(fibNumPrev);
			System.out.println(term + ": " + fibNum.toString().length());
		}
	}

}

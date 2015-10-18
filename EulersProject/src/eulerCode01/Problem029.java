package eulerCode01;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Problem029 {

	public static void main(String[] args) {
		ArrayList<BigInteger> numList = new ArrayList<BigInteger>();
		for(int a = 2; a<=100; a++) {
			for(int b = 2; b<=100; b++) {
				BigInteger c = new BigInteger(String.valueOf(a));
				c = c.pow(b);
				if(!numList.contains(c)) {
					numList.add(c);
				}
			}
		}
		Collections.sort(numList);
		System.out.println(numList.size());
		//System.out.println(numList);
	}
}

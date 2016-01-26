package eulerCode02;
import helpfulMethods.Maths;
import java.math.BigInteger;
public class Problem053 {
	public static void main(String[] args) {
		Maths maths = new Maths();
		int count = 0;
		
		for(int n = 1; n<=100; n++) {
			for(int r = 0; r<=n; r++) {
				if(maths.combinatorics(n, r).compareTo(new BigInteger(""+1000000))>0) {
					count++;
				}
			}
			System.out.println(n);
		}
		System.out.println(count);
	}
}

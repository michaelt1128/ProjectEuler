package eulerCode01;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Problem026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<1000; i++) {
			BigDecimal num = new BigDecimal(i);
			num = num.pow(-1, new MathContext(30, RoundingMode.HALF_UP));
			String[] str = num.toString().split("\\.");
			System.out.println(i + " " + str[1]);
		}
	}
}

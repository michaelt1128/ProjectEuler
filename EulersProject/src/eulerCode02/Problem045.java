package eulerCode02;

import helpfulMethods.Maths;

public class Problem045 {
	public static void main(String[] args) {
		Maths m = new Maths();
		boolean found = false;
		long j = 0;
		for(int i = 144; found == false; i++) {
			j = i * (2 * i - 1);
			if(m.isPentagonalNumber(j)) {
				System.out.println(j);
				found = true;
			}
		}
	}
}

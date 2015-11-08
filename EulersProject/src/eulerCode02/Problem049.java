package eulerCode02;

import helpfulMethods.Maths;

public class Problem049 {
	public static void main(String[] args) {
		Maths m = new Maths();
		for (int i = 1231; i < 9995; i += 2) {
			if (m.isPrime(i)) {
				for (int j = i + 2; j < 9997; j += 2) {
					if (m.isPrime(j)) {
						int k = j + j - i;
						if (m.isPrime(k)) {
							if (m.isPermutation(i, j) && m.isPermutation(i, k)) {
								System.out.println(i + " " + j + " " + k);
							}
						}
					}
				}
			}
		}
	}
}
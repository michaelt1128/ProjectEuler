package eulerCode02;

import helpfulMethods.Maths;

public class Problem046 {
	static Maths m = new Maths();

	public static void main(String[] args) {
		int count = 9;
		boolean notFound = true;
		while (notFound) {
			if (!m.isPrime(count)) {
				if (!isGoldbach(count)) {
					System.out.println(count);
					notFound = false;
				}
			}
			count += 2;
		}
	}

	public static boolean isGoldbach(int num) {

		int primes[] = m.generatePrimes(num - 2);
		for (int p : primes) {
			double d = Math.sqrt((num - p)/2);
			if (d == (int) d) {
				return true;
			}
		}

		return false;
	}
}

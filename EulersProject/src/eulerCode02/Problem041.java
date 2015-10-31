package eulerCode02;

import allMethods.Maths;

public class Problem041 {
	public static void main(String[] args) {
		Maths m = new Maths();
		int max = 0;
		int[] primeList = m.generatePrimes(987654321);
		for(int prime : primeList) {
			if (m.isPandigitalCustom(prime)) {
				System.out.println(prime);
			}	
		}
		System.out.println(max);
	}
}

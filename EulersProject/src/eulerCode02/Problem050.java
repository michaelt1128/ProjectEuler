package eulerCode02;

import helpfulMethods.Maths;

public class Problem050 {
	public static void main(String[] args) {
		Maths m = new Maths();
		int[] primes = m.generatePrimes(500000);
		int maxPrimes = 0;
		for(int start = 0; start<primes.length/2; start++) {
			int sum = 0;
			int count = 0;
			for(int i = start; i<primes.length-start && sum<1000000; i++) {
				sum+=primes[i];
				count++;
				if(m.isPrime(sum)) {
					if(count>maxPrimes) {
						maxPrimes = count;

						System.out.println(sum + " " + count);
					}
				}
			}
		}
	}
}

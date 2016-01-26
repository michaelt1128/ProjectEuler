package eulerCode02;

import helpfulMethods.Maths;

public class Problem047 {
	Maths m = new Maths();
	int[] primeList = m.generatePrimes(100000);
	public static void main(String[] args) {
		boolean notFound = true;
		int count = 600;
		int c = 0;
		Problem047 p = new Problem047();
		while (notFound) {
			if (p.fourFactors(count)) {
				c++;
				if (c == 4) {
					System.out.println(count - 3);
					notFound = true;
				}
			} else {
				c = 0;
			}
			if(count%1000==0) {
				System.out.println(count);	
			}
			count++;
		}
	}
	
	public boolean fourFactors(int n) {
		int nod = 0;
		boolean pf;
		int remain = n;
		for(int i = 0; i<primeList.length; i++) {
			if (primeList[i] * primeList[i] > n) {
				if(++nod == 4) {
					return true;
				}
			}
			pf = false;
			while (remain % primeList[i] == 0) {
				pf = true;
				remain /= primeList[i];
			}
			if (pf) {
				nod++;
			}
			if (remain == 1) {
				if(nod == 4) {
					return true;
				}
			}
		}
		if (nod == 4) {
			return true;
		} else {
			return false;
		}
	}
}

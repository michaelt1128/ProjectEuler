package eulerCode01;

public class Problem027 {
	public static void main(String[] args) {
		int[] maxCount = new int[3];
		for(int a = -999; a <1000; a=a+2) {
			for(int b = -999; b<1000; b=b+2) {
				int n = 0;
				while (isPrime(Math.abs(n*n + a*n + b))) {
					n++;
				}
				if (n>maxCount[0]) {
					maxCount[0] = n;
					maxCount[1] = a;
					maxCount[2] = b;
				}
			}
		}
		System.out.println(maxCount[0] + " " + maxCount[1] + " " + maxCount[2] + " " + maxCount[1]*maxCount[2]);
	}
	public static boolean isPrime(int num) {
		boolean prime = true;
		for(int i=2; i<Math.sqrt((double)num)+1; i++) {
			if (num%i==0) {
				prime = false;
			}
		}
		return prime;
	}
}

package eulerCode01;

public class Problem039 {
	public static void main(String[] args) {
		int max = 0;
		int maxp = 0;
		for(int p = 12; p<1000; p++) {
			int count = 0;
			for(int a = 1; a<p-2; a++) {
				for(int b = 1; b<p-2; b++) {
					int c = (int)Math.sqrt(a*a + b*b); 
					if (c*c == a*a + b*b) {
						if (a+b+c==p) {
							count++;
						}
					}
				}
			}
			if (count>max) {
				max = count;
				maxp = p;
				System.out.println(maxp);
			}
		}
	}
	public static boolean isPerfectSquare(int n)
	{
	  if (n < 0)
	    return false;

	  long tst = (long)(Math.sqrt(n) + 0.5);
	  return tst*tst == n;
	}
}

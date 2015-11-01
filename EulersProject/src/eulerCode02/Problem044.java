package eulerCode02;

import helpfulMethods.Maths;

public class Problem044 {
	public static void main(String[] args) {
		Maths m = new Maths();
		boolean notFound = true;
		int i = 1;
		while (notFound) {
		    i++;
		    int n = i * (3 * i - 1) / 2;
		 
		    for (int j = i-1; j > 0; j--) {
		        int em = j * (3 * j - 1) / 2;
		        if (m.isPentagonalNumber(n - em) && m.isPentagonalNumber(n + em)) {
		            notFound = false;
				    System.out.println(m.generateSpecificPentagonal(i)-m.generateSpecificPentagonal(j));
		            break;
		        }
		    }
		}
	}
}

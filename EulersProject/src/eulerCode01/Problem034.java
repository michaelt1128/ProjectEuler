package eulerCode01;

import java.util.ArrayList;

import allMethods.Maths;

public class Problem034 {
	public static void main(String[] args) {
		Maths m = new Maths();
		ArrayList<Integer> correct = new ArrayList<Integer>();
		for(int i = 3; i<10000000; i++) {
			ArrayList<Integer> digits = m.intToArrayList(i);
			int sumFactors = 0;
			for(int n:digits) {
				if(n == 0) {
					sumFactors++;
				} else {
					long fact = m.factorial(n);
					sumFactors += fact;
				}
			}
			if(sumFactors == i) {
				correct.add(i);
			}
		}
		System.out.println(correct.size());
		System.out.println(correct);
		int sum = 0;
		for(int c:correct) {
			sum+=c;
		}
		System.out.println(sum);
	}
}

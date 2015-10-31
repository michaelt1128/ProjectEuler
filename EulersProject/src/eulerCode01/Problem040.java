package eulerCode01;

import java.util.ArrayList;
import allMethods.Maths;
public class Problem040 {
	public static void main(String[] args) {
		Maths m = new Maths();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int current = 1;
		while(numbers.size()<=1000000) {
			numbers.addAll(m.intToArrayList(current));
			current++;
		}
		int product = 1;
		for(int i = 1; i<=1000000; i*=10) {
			product *= numbers.get(i-1);
			System.out.println(i + " " + numbers.get(i-1));
		}
		System.out.println(product);
	}
}
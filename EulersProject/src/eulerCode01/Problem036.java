package eulerCode01;

import allMethods.Maths;

public class Problem036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m = new Maths();
		int sum = 0;
		for(int i = 1; i<1000000; i++) {
			if(m.isPalindrome(String.valueOf(i)) && m.isPalindrome(Integer.toBinaryString(i))) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}

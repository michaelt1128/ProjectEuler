package eulerCode01;

import java.util.ArrayList;

import allMethods.Maths;

public class Problem038 {
	public static void main(String[] args) {
		Maths m = new Maths();
		int max = 0;
		for(int i = 1; i<99999; i++) {
			ArrayList<Integer> current = new ArrayList<Integer>();
			int n = 1;
			while(current.size()<9) {
				int temp = i*n;
				current.addAll(m.intToArrayList(temp));
				n++;
			}
			if(current.size()==9) {
				int num = m.arrayListToInt(current);
				if(m.isPandigital(num) && num>=max) {
					max = num;
				}
			}
		}
		System.out.println(max);
	}
}

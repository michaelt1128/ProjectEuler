package eulerCode01;

import java.util.ArrayList;

public class Problem023 {

	public static void main(String[] args) {
		ArrayList<Integer> abundantNums = new ArrayList<Integer>();
		ArrayList<Integer> allNums = new ArrayList<Integer>();
		ArrayList<Integer> allSums = new ArrayList<Integer>();
		for(int i = 1; i<28123;i++) {
			ArrayList<Integer> list = properDivisors(i);
			if(list.size()>1) {
				if(isAbundant(list, i)) {
					abundantNums.add(i);
				}
			}
			allNums.add(i);
		}
		for(int i = 0;i<abundantNums.size(); i++) {
			for(int j = 0; j<abundantNums.size(); j++) {
				int number = abundantNums.get(i)+abundantNums.get(j);
				allSums.add(number);
				if(allNums.contains(number)) {
					allNums.remove(allNums.indexOf(number));
				}
			}
		}
		int sum = 0;
		for(int i = 0; i<allNums.size(); i++) {
			sum+= allNums.get(i);
			System.out.println(sum);
		}
	}
	public static boolean isAbundant(ArrayList<Integer> list, int num) {
		int sum = 0;
		for(int i = 0; i<list.size(); i++) {
			sum+=list.get(i);
		}
		if(sum>num) {
			return true;
		} else {
			return false;
		}
	}
	public static ArrayList<Integer> properDivisors(int x){
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		divisors.add(1);
		int n = (int) Math.sqrt(x);
		for(int i = 2; i<= n; i++){
			if(x%i==0){
				divisors.add(i);
				if(x/i != i){
					divisors.add(x/i);
				}
			}
		}
		return divisors;
	}

}

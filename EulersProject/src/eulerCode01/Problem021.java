package eulerCode01;

import java.util.ArrayList;

public class Problem021 {
	public static void main(String[] args){
		int sumNums = 0;
		for(int i = 0; i < 10000; i++) {
			for(int j = 0; j < 10000; j++) {
				if(isAmicable(i, j) && i != j){
					System.out.println(i + " " + j);
					sumNums += i;
				}
			}
		}
		System.out.println(sumNums);
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
	public static boolean isAmicable(int x, int y){
		ArrayList<Integer> divisors = properDivisors(x);
		ArrayList<Integer> divisors2 = properDivisors(y);
		int sum1 = 0;
		for(int i = 0; i < divisors.size(); i++) {
			sum1+=divisors.get(i);
		}
		int sum2 = 0;
		for(int i = 0; i < divisors2.size(); i++) {
			sum2+=divisors2.get(i);
		}
		if(sum1 == y && sum2 == x) {
			return true;
		}
		else {
			return false;
		}
	}
}

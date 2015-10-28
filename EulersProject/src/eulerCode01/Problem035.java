package eulerCode01;

import java.util.ArrayList;

import allMethods.Maths;

public class Problem035 {
	static Maths m = new Maths();
	public static void main(String[] args) {
		ArrayList<Integer> ayy = new ArrayList<Integer>();
		int count = 0;
		for(int i = 2; i < 1000000; i++) {
			if(isCirclePrime(i)) {
				ayy.add(i);
				count++;
				System.out.println(count);
			}
		}
		System.out.println(ayy);
	}
	
	public static boolean isCirclePrime(int n) {
		int[] temp = m.intToArray(n);
		int count = 0;
		int num = n;
		boolean result = true;
		while(count<temp.length) {
			int first = temp[0];
			for(int i = 0; i<temp.length-1; i++) {
				temp[i] = temp[i+1];
			}
			temp[temp.length - 1] = first; 
			num = m.arrayToInt(temp);
			count++;
			if(!m.isPrime(num)) {
				result = false;
				break;				
			}
		}
		return result;
	}
	
	
	
	
}

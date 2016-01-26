package helpfulMethods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Maths {
	public static void main(String[] args) {
	}
	
	public ArrayList<Integer> factors(int num) {
		Set<Integer> factors = new HashSet<Integer>();
		for(int i = 2; i<=Math.sqrt(num); i++) {
			if (num % i == 0) {
				factors.add(i);
				factors.add(num/i);
			}
		}
		return new ArrayList<Integer>(factors);
	}
	
	public ArrayList<Integer> intToArrayList(int num) {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		char[] chArray = String.valueOf(num).toCharArray();
		int i = 0;
		for(char c:chArray) {
			String temp = String.valueOf(c);
			digits.add(i, Integer.valueOf(temp));
			i++;
		}
		return digits;
	}
	
	public int[] intToArray(int num) {
		int[] ar = new int[String.valueOf(num).length()];
		char[] chArray = String.valueOf(num).toCharArray();
		int i = 0;
		for(char c:chArray) {
			String temp = String.valueOf(c);
			ar[i] = Integer.valueOf(temp);
			i++;
		}
		return ar;
	}
	
	public int arrayListToInt(ArrayList<Integer> temp) {
		String str = "";
		for(int n:temp) {
			str = str.concat(String.valueOf(n));
		}
		return Integer.valueOf(str);
	}
	
	public int arrayToInt(int[] temp) {
		String str = "";
		for(int n:temp) {
			str = str.concat(String.valueOf(n));
		}
		return Integer.valueOf(str);
	}
	
	public boolean isPrime(long num) {
		for(int i = 2; i<=Math.sqrt(num); i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean hasDuplicate(ArrayList<Integer> list) {
		Set<Integer> set = new HashSet<Integer>();
		for (int num : list)
			if (!set.add(num))
				return true;
		return false;
	}
	
	public long gcm(long a, long b) {
		return b == 0 ? a : gcm(b, a%b);
	}
	
	public String asFraction(long a, long b) {
	    long gcm = gcm(a, b);
	    return (a / gcm) + "/" + (b / gcm);
	}
	
	public long factorial(long a) {
		long result;
		if(a == 1) {
			return 1;
		}
		result = factorial(a-1)*a;
		return result;
	}
	
	public boolean isPalindrome(String num) {
		return num.equals(new StringBuilder(num).reverse().toString());
	}
	
	public boolean isPandigital(int num) {
		Maths m = new Maths();
		ArrayList<Integer> digits = m.intToArrayList(num);
		ArrayList<Integer> correct = new ArrayList<Integer>();
		int[] zeronine = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int a : zeronine) correct.add(a);
		if(digits.containsAll(correct) && correct.containsAll(digits)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isPandigitalCustom(int num) {
		Maths m = new Maths();
		ArrayList<Integer> digits = m.intToArrayList(num);
		ArrayList<Integer> correct = new ArrayList<Integer>();
		for(int i = 1; i<=digits.size(); i++) {
			correct.add(i);
		}
		if(digits.containsAll(correct) && correct.containsAll(digits)) {
			return true;
		} else {
			return false;
		}
	}
	
	public int[] generatePrimes(int max) {
	    boolean[] isComposite = new boolean[max + 1];
	    for (int i = 2; i * i <= max; i++) {
	        if (!isComposite [i]) {
	            for (int j = i; i * j <= max; j++) {
	                isComposite [i*j] = true;
	            }
	        }
	    }
	    int numPrimes = 0;
	    for (int i = 2; i <= max; i++) {
	        if (!isComposite [i]) numPrimes++;
	    }
	    int [] primes = new int [numPrimes];
	    int index = 0;
	    for (int i = 2; i <= max; i++) {
	        if (!isComposite [i]) primes [index++] = i;
	    }
	    return primes;
	}
	
	public boolean isTriangleNumber(int num) {
		double triTest = (Math.sqrt(8*num+1) - 1) / 2;
		return triTest == (int)triTest;
	}
	
	public ArrayList<Integer> generatePentagonals(int maxIndex) {
		ArrayList<Integer> pents = new ArrayList<Integer>();
		for(int i = 1; i<maxIndex; i++) {
			pents.add((int)(.5 * i * (3*i - 1)));
		}
		return pents;
	}
	
	public boolean isPentagonalNumber(long num) {
		double penTest = (Math.sqrt(1 + 24 * num) + 1.0) / 6.0;
		return penTest == (int)penTest;
	}
	
	public int generateSpecificPentagonal(int index) {
		return (int)(.5 * index * (3 * index - 1));
	}
	
	public boolean isHexagonalNumber(long num) {
		double hexTest = (Math.sqrt(8 * num + 1) + 1)/4;
		return hexTest == (int) hexTest;
	}
	
	public ArrayList<Integer> arrayToArrayList(int array[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i : array) {
			list.add(i);
		}
		return list;
	}
	
	public boolean isPermutation(int num, int num2) {
		Maths m = new Maths();
		ArrayList<Integer> n1 = m.intToArrayList(num);
		ArrayList<Integer> n2 = m.intToArrayList(num2);
		if(n1.containsAll(n2) && n2.containsAll(n1)) {
			return true;
		}
		return false;
	}
}
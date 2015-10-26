package eulerCode01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class Problem032 {
	public static void main(String[] args) {
		ArrayList<Integer> correct = new ArrayList<Integer>(); //the correct sequence
		ArrayList<Integer> correctNumbers = new ArrayList<Integer>(); //all of the numbers that are pandigital
		int[] zeronine = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int num : zeronine) correct.add(num);
		Collections.sort(correct);
		int sumOfProducts = 0;
		for (int i = 200; i < 100000; i++) { //Main loop through all numbers
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for (int j : intToArray(i)) temp.add(j);
			if (!hasDuplicate(temp)) { //Check if the number has duplicates before proceeding
				ArrayList<Integer> factors = factor(i); //get factors of the current number
				for (int factor : factors) { //go through all of the factors of the number
					ArrayList<Integer> currentTotal = new ArrayList<Integer>();
					for (int x : intToArray(i)) currentTotal.add(x); //add the current number to a temporary arraylist
					for (int y : intToArray(factor)) currentTotal.add(y); // add the factors to the temporary arraylist
					for (int z : intToArray(i/factor)) currentTotal.add(z); // add the other half of the factor to the temporary arraylist
					Collections.sort(currentTotal); // sort the arraylist for comparison purposes
					if (currentTotal.size() == 9) { // check if the temp arraylist is equal in size to the correct one
						if (!hasDuplicate(currentTotal)) { // check if there are duplicates in the arraylist
							if (currentTotal.equals(correct)) { // compare the arraylist to the correct one
								if (!correctNumbers.contains(i)) correctNumbers.add(i); // if it is not already added to the correct list, add it
							}
						}
						System.out.println(i + " " + currentTotal);
					}
				}
			}
		}
		for (int num : correctNumbers)
			sumOfProducts += num;
		System.out.println(sumOfProducts); // add up all of the correct numbers
	}

	public static ArrayList<Integer> factor(int a) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i < Math.sqrt(a); i++) {
			if (a % i == 0)
				factors.add(i);
		}
		return factors;
	}

	public static int[] intToArray(int num) {
		int[] array = new int[String.valueOf(num).length()];
		char[] chArray = String.valueOf(num).toCharArray();
		int i = 0;
		for (char c : chArray) {
			String temp = String.valueOf(c);
			array[i] = Integer.valueOf(temp);
			i++;
		}
		return array;
	}

	public static boolean hasDuplicate(ArrayList<Integer> list) {
		Set<Integer> set = new HashSet<Integer>();
		for (int num : list)
			if (!set.add(num))
				return true;
		return false;
	}
}

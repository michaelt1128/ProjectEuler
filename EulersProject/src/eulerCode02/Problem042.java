package eulerCode02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import allMethods.Maths;

import eulerCode01.Problem022;

public class Problem042 {
	public static void main(String[] args) {
		Maths m = new Maths();
		String[] words = wordOutput();
		int count = 0;
		for(String word : words) {
			int wordSum = 0;
			System.out.println(word);
			char[] chars = word.toCharArray();
			for(char c : chars) {
				wordSum += Character.getNumericValue(c)-9;
			}
			System.out.println(wordSum);
			if (m.isTriangleNumber(wordSum)) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static String[] wordOutput() {
		File names = new File(Problem022.class.getResource("/p042_words.txt").getFile());
		String line = "";
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(names));
			line = bufferedReader.readLine();	
			bufferedReader.close();
		} catch (Exception e) {
		}

		String[] nameList = line.split("[\",]+");
		Arrays.sort(nameList);
		return nameList;
	}
	
}

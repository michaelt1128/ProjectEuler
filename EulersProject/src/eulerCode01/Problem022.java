package eulerCode01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Problem022 {

	public static void main(String[] args) {
		String[] nameList = nameOutput();
		int totalSum = 0;
		for(int i = 1; i<nameList.length; i++) {
			totalSum += i*nameNum(nameList[i]);
		}
		System.out.println(totalSum);
	}
	public static String[] nameOutput() {
		File names = new File(Problem022.class.getResource("/p022_names.txt").getFile());
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
	public static int nameNum(String str) {
		int sum = 0;
		char[] name= str.toCharArray();
		for(int i = 0; i<name.length; i++) {
			sum += (int)name[i] - 64;
		}
		return sum;
	}
}

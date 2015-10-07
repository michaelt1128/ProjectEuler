package eulerCode01;

import java.util.Arrays;


public class Problem024 {

	public static void main(String[] args) {
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		int num = 1;
		while (num<1000000){
			nextPermutation(array);
			num++;
		}
		System.out.println(num);
		System.out.println(Arrays.toString(array));
	}
	public static boolean nextPermutation(int[] array) {
		int i = array.length - 1;
		while(i > 0 && array[i-1] >= array[i]) {
			i--;
		}
		if (i<=0) {
			return false;
		}
		int j = array.length - 1;
		while (array[j] <= array[i-1]) {
			j--;
		}
		int temp = array[i-1];
		array[i-1] = array[j];
		array[j] = temp;
		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return true;
	}
}

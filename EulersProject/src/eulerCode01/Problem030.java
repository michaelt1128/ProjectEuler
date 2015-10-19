package eulerCode01;

public class Problem030 {

	public static void main(String[] args) {
		int sum = 0;
		//skip i = 1
		for (int i = 2; i<=355000; i++) {
			int number = i;
			int sumOfPowers = 0;
			while (number > 0) {
				int d = number%10;
				number /= 10;
				sumOfPowers += (int) Math.pow(d, 5);
			}	
			if (sumOfPowers == i) sum += i;
		}
		System.out.println(sum);
	}
}

package eulerCode01;

public class Problem028 {

	public static void main(String[] args) {
		Problem028 p = new Problem028();
		int sum = 1;
		for(int i = 3; i <=1001; i=i+2) {
			sum+=p.prob28(i);
			System.out.println(sum);
		}
		
	}
	public int prob28(int n) {
		int answer = 0;
		int s = n*n; 
		answer = 4 * s - 6 * (n-1);
		return answer;
	}
}

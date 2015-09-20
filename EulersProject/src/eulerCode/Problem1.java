package eulerCode;

public class Problem1 {
	public static void main(String[] args)
	{
		System.out.println(problem1());
	}
	
	public static int problem1()
	{
		int number = 0;
		int numberSum = 0;
		while (number < 1000)
		{
			if ((number%3==0) || (number%5==0))
			{
				numberSum+=number;
			}
			number++;
		}
		return numberSum;
	}
}

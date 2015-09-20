package eulerCode;

public class Problem006 {
	public static void main(String[] args)
	{
		int div = squaresum(100) - squares(100);
		System.out.println(div);
	}
	public static int squares(int max)
	{
		int sum = 0;
		for(int i = 1; i<=max; i++)
		{
			sum += i*i;
		}
		return sum;
	}
	public static int squaresum(int max)
	{
		int sum = 0;
		for(int i = 1; i<=max; i++)
		{
			sum += i;
		}
		return sum*sum;
	}
}

package eulerCode;

public class Problem005 {
	public static void main(String[] args)
	{
		boolean foundNum = false;
		int count = 20;
		while(foundNum == false)
		{
			if(isDivisible(count)==true)
			{
				System.out.println(count);
			}
			foundNum = isDivisible(count);
			count++;
		}
		System.out.println(count);
	}
	public static boolean isDivisible(int num)
	{
		boolean value = true;
		int i = 1;
		while(i<=20 && value != false)
		{
			if(num%i==0)
			{
				value = true;
			}
			else
			{
				value = false;
				return value;
			}
			i++;
		}
		return value;
	}
}

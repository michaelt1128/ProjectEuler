package eulerCode;

public class Problem004 {
	public static void main(String[] args)
	{
		int maxValue = 0;
		String MaxValue = "";
		for (int i = 999; i>0; i--)
		{
			for (int j = 999; j>0; j--)
			{
				int k = i*j;
				if(isPalindrome(k))
				{
					if(k>maxValue)
					{
						maxValue = k;
						MaxValue = i + " " + j + " " + k;
					}
					System.out.println(i + " " + j + " " + k);
				}
			}
		}
		System.out.println(MaxValue);
	}
	public static boolean isPalindrome(int num)
	{
		boolean isPal = false;
		String numString = Integer.toString(num);
		int numLength = numString.length();
		String firstHalf;
		String secondHalf;
		
		if(numLength%2==0)
		{
			firstHalf = numString.substring(0, numLength/2);
			secondHalf = numString.substring(numLength/2, numLength);
			
		}
		else
		{
			firstHalf = numString.substring(0, numLength/2);
			secondHalf = numString.substring(numLength/2+1, numLength);
		}
		String reversedSecond = new StringBuilder(secondHalf).reverse().toString();
		if(firstHalf.equals(reversedSecond))
		{
			isPal = true;
		}
		else
		{
			isPal = false;
		}
		return isPal;
	}
}

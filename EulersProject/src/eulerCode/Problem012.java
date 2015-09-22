package eulerCode;

import java.util.ArrayList;

public class Problem012 {
	public static void main(String[] args)
	{
		ArrayList<Integer> factors = new ArrayList<Integer>();
		int num = 1;
		int triangle = 0;
		while(factors.size()<=500)
		{
			triangle += num;
			factors = getFactors(triangle);
			num++;
		}
		System.out.println(factors);
		System.out.println(triangle);
	}
	public static ArrayList<Integer> getFactors(int triangle)
	{
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int i = 2; i<Math.sqrt(triangle); i++)
		{
			if(triangle % i == 0)
			{
				factors.add(i);
				factors.add(triangle/i);				
			}
		}
		return factors;
	}
}
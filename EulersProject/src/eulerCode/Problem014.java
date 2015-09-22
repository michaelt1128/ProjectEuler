package eulerCode;

import java.util.ArrayList;

public class Problem014 
{
	public static void main(String[] args)
	{
		int size = 0;
		int maxSize = 0;
		int maxNum = 0;
		for(int numStart = 10; numStart<1000000; numStart++)
		{			
			ArrayList<Long> list = new ArrayList<Long>();
			long num = numStart;
			while(num != 1)
			{
				
				if(num%2==0)
				{
					num=num/2;
					list.add(num);
				}
				else
				{
					num = 3*num + 1;
					list.add(num);
				}
			}
			size = list.size();
			if(size>maxSize)
			{
				maxSize = size;
				maxNum = numStart;
				System.out.println(maxSize);
			}
		}
		System.out.println(maxNum);
	}
}

package eulerCode;

public class Problem009 {
	public static void main(String[] args)
	{
		for(int i = 3; i<300; i++)
		{
			for(int j = 4; j<600; j++)
			{
				for(int k = 5; k<900; k++)
				{
					if(i+j+k==1000)
					{
						if(i*i+j*j==k*k)
						{
							System.out.println(i+ " " + j + " " + k);
							System.out.println(i*j*k);
						}
					}
				}
			}
		}
		
	}
}

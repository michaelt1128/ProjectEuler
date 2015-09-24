package eulerCode;

public class Problem017 {

	public static void main(String[] args) 
	{
		String numStr = "";
		String numberAsString = "";
		String[] numOneStringer = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String[] numOneString = {"","one","two","three","four","five","six","seven","eight","nine"};
		String[] teensArray = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String[] numTenArray = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		int charAmt = 0;
		
		for(int i = 1; i<1000; i++)
		{
			numberAsString = String.valueOf(i);
			if(i>99)
			{

				numStr = "";
				int hundredsInt = Integer.parseInt(String.valueOf(i).substring(0, 1));
				int tensInt = Integer.parseInt(String.valueOf(i).substring(1, 2));
				int onesInt = Integer.parseInt(String.valueOf(i).substring(2, 3));
				for(int j = 0; j<10;j++)
				{
					if(hundredsInt == j)
					{
						numStr = numStr.concat(numOneString[j] + "hundred");
						if(tensInt != 0 || onesInt != 0)
						{
							numStr = numStr.concat("and");
						}
						break;
					}
				}
				for(int k = 0; k<10; k++)
				{
					if(tensInt == k)
					{
						if(tensInt == 1)
						{	
							for(int m = 0; m<10; m++)
							{
								if(onesInt == m)
								{
									numStr = numStr.concat(teensArray[m]);
									break;
								}
							}
							break;
						}
						else
						{
							numStr = numStr.concat(numTenArray[k]);
							for(int m = 0; m<10; m++)
							{
								if(onesInt == m)
								{
									numStr = numStr.concat(numOneString[m]);
									break;
								}
							}
							break;
						}
					}
				}
			}
			else if(i>9 && i<100)
			{
				numStr = "";
				int tensInt = Integer.parseInt(String.valueOf(i).substring(0, 1));
				int onesInt = Integer.parseInt(String.valueOf(i).substring(1, 2));
				for(int k = 0; k<10; k++)
				{
					if(tensInt == k)
					{
						if(tensInt == 1)
						{	
							for(int m = 0; m<10; m++)
							{
								if(onesInt == m)
								{
									numStr = numStr.concat(teensArray[m]);
									break;
								}
							}
							break;
						}
						else
						{
							numStr = numStr.concat(numTenArray[k]);
							for(int m = 0; m<10; m++)
							{
								if(onesInt == m)
								{
									numStr = numStr.concat(numOneString[m]);
									break;
								}
							}
							break;
						}
					}
				}
				
			}
			else if(i<10)
			{
				numStr = "";
				int onesInt = Integer.parseInt(String.valueOf(i).substring(0, 1));
				for(int m = 0; m<10; m++)
				{
					if(onesInt == m)
					{
						numStr = numStr.concat(numOneStringer[i]);
						break;
					}
				}
			}
			System.out.println(numStr);
			charAmt += numStr.length();
		}
		System.out.println(charAmt);
		charAmt += "onethousand".length();
		System.out.println(charAmt);
	}
}

package eulerCode;

public class Problem019 
{
	public static void main(String[] args) 
	{
		int sundayCount = 0;
		int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		int year =1901;
		int month = 1;
		int day = 1;
		int totalDays = 1;
		while(year<2001)
		{
			month = 1;
			if(year%4==0 || (year%100==0 && year%400==0))
			{
				daysInMonth[1] = 29;
			}
			else
			{
				daysInMonth[1] = 28;
			}
			while(month<=12)
			{
				day=1;
				while(day<=daysInMonth[month-1])
				{
					if(day == 1 && totalDays%7==0)
					{
						System.out.println(year + " " + month + " " + day + " " + sundayCount);
						sundayCount++;
					}
					day++;
					totalDays++;
				}
				month++;
			}
			year++;
		}
		System.out.println(sundayCount);
	}
}

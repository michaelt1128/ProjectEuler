package eulerCode;

import java.util.ArrayList;

public class Problem018 {
	public static String[] jumble = {"75",
			"95 64",
			"17 47 82",
			"18 35 87 10",
			"20 04 82 47 65",
			"19 01 23 75 03 34",
			"88 02 77 73 07 63 67",
			"99 65 04 28 06 16 70 92",
			"41 41 26 56 83 40 80 70 33",
			"41 48 72 33 47 32 37 16 94 29",
			"53 71 44 65 25 43 91 52 97 51 14",
			"70 11 33 28 77 73 17 78 39 68 17 57",
			"91 71 52 38 17 14 91 43 58 50 27 29 48",
			"63 66 04 68 89 53 67 30 73 16 69 87 40 31",
			"04 62 98 27 23 09 70 98 73 93 38 53 60 04 23"};
	public static void main(String[] args) 
	{
		ArrayList<ArrayList<Integer>> jumbled = jumbler(jumble);
		System.out.println(summer(jumbled));
	}
	public static ArrayList<ArrayList<Integer>> jumbler(String[] a)
	{
		ArrayList<ArrayList<Integer>> intstring = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i<a.length; i++)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			String[] nums = a[i].split("\\s");
			for(int k = 0; k<nums.length; k++)
			{
				temp.add(Integer.parseInt(nums[k]));
			}
			intstring.add(i, temp);
		}
		return intstring;
	}
	public static int summer(ArrayList<ArrayList<Integer>> jum)
	{
		for(int i = jum.size()-2; i>=0; i--)
		{
			ArrayList<Integer> y = adder(jum.get(i),jum.get(i+1));
			jum.set(i, y);
		}
		return jum.get(0).get(0);
	}
	public static ArrayList<Integer> adder(ArrayList<Integer> jim, ArrayList<Integer> jam)
	{
		ArrayList<Integer> x = new ArrayList<Integer>();
		for(int i = 0; i<jim.size(); i++)
		{
			if(jam.get(i)>jam.get(i+1))
			{
				x.add(jam.get(i)+jim.get(i));
			}
			else
			{
				x.add(jam.get(i+1)+jim.get(i));
			}
		}
		return x;
	}
}


package eulerCode03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Problem067 {
	public static void main(String[] args) 
	{
		System.out.println(summer(textReader()));
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
	public static ArrayList<ArrayList<Integer>> textReader()
	{
		File triangle = new File(Problem067.class.getResource("/p067_triangle.txt").getFile());
		ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
		String line = "";
		try{
			FileReader fileReader = new FileReader(triangle);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			for(int i = 0; i<100; i++)
			{
				ArrayList<Integer> temp = new ArrayList<Integer>();
				line = bufferedReader.readLine();
				String[] nums = line.split("\\s");
				for(int k = 0; k<nums.length; k++)
				{
					temp.add(Integer.parseInt(nums[k]));
				}
				array.add(temp);
			}
			bufferedReader.close();
		}
		catch(IOException ex)
		{
			System.out.println("ayy");
		}
			
		return array;
	}
}


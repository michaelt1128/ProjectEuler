package eulerCode02;

import helpfulMethods.Maths;

public class Problem051 {
	static Maths m = new Maths();

	public static void main(String[] args) {

	}

	public static int[] giveChoices(int index, int num) {
		int[] a = { 1, 0, 0, 0, 1 };
		int[] b = { 0, 1, 0, 0, 1 };
		int[] c = { 0, 0, 1, 0, 1 };
		int[] d = { 0, 0, 0, 1, 1 };
		
		int[] e = {1,1,0,0,0,1};
		int[] f = {1,0,1,0,0,1};
		int[] g = {1,0,0,1,0,1};
		int[] h = {1,0,0,0,1,1};
		int[] i = {0,1,1,0,0,1};
		int[] j = {0,1,0,1,0,1};
		int[] k = {0,1,0,0,1,1};
		int[] l = {0,0,1,1,0,1};
		int[] m1 = {0,0,1,0,1,1};
		int[] n = {0,0,0,1,1,1};
		
		if (m.intToArray(num).length == 5) {
			switch (index) {
				case 0:
					return a;
				case 1:
					return b;
				case 2:
					return c;
				case 3:
					return d;
				default:
					return null;
			}
		} else if(m.intToArray(num).length == 6) {
			switch (index) {
				case 0:
					return e;
				case 1:
					return f;
				case 2:
					return g;
				case 3:
					return h;
				case 4:
					return i;
				case 5:
					return j;
				case 6:
					return k;
				case 7:
					return l;
				case 8:
					return m1;
				case 9:
					return n;
				default:
					return null;
			} 
		} else {
			System.out.println("oops");
			return null;
		}
	}
	public static int familySize(int num, int[] pattern) {
		int familySize = 0;
		for(int i = 0; i<10; i++) {
			
		}
		return familySize;
	}
}

package eulerCode01;

import java.util.ArrayList;

import allMethods.Maths;

public class Problem033 {
	public static void main(String[] args) {
		Maths m = new Maths();
		ArrayList<Integer> iCorrect = new ArrayList<Integer>();
		ArrayList<Integer> jCorrect = new ArrayList<Integer>();
		for (int i = 10; i < 100; i++) {
			for (int j = i + 1; j < 100; j++) {
				if (j % 10 != 0) {
					double quotient = (double) j / (double) i;
					ArrayList<Integer> iList = m.intToArrayList(i);
					ArrayList<Integer> jList = m.intToArrayList(j);
					int i0 = iList.get(0);
					int i1 = iList.get(1);
					int j0 = jList.get(0);
					int j1 = jList.get(1);
					if (i0 == j0 && i1 != 0 && j1 != 0) {
						double smaller = (double) j1 / (double) i1;
						if (quotient == smaller) {
							iCorrect.add(i1);
							jCorrect.add(j1);
							System.out.print(1 + " ");
							System.out.print(i + " " + j);
							System.out.print(" " + quotient + " ");
							System.out.println(smaller);
						}
					} else if (i0 == j1 && i1 != 0 && j0 != 0) {
						double smaller = (double) j0 / (double) i1;
						if (quotient == smaller) {
							iCorrect.add(i0);
							jCorrect.add(j1);
							System.out.print(i + " " + j);
							System.out.print(" " + quotient + " ");
							System.out.println(smaller);
						}
					} else if (i1 == j0 && i0 != 0 && j1 != 0) {
						double smaller = (double) j1 / (double) i0;
						if (quotient == smaller) {
							iCorrect.add(i0);
							jCorrect.add(j1);
							System.out.print(i + " " + j);
							System.out.print(" " + quotient + " ");
							System.out.println(smaller);
						}
					} else if (i1 == j1 && i0 != 0 && j0 != 0) {
						double smaller = (double) j0 / (double) i0;
						if (quotient == smaller) {
							iCorrect.add(i0);
							jCorrect.add(j0);
							System.out.print(i + " " + j);
							System.out.print(" " + quotient + " ");
							System.out.println(smaller);
						}
					}
				}
			}
		}
		System.out.println(iCorrect);
		System.out.println(jCorrect);
		int ip = 1;
		int jp = 1;
		for(int n : iCorrect) {
			ip *= n;
		}
		for(int n : jCorrect) {
			jp *= n;
		}
		System.out.println(asFraction(ip, jp));
	}
	public static long gcm(long a, long b) {
		return b == 0 ? a : gcm(b, a%b);
	}
	
	public static String asFraction(long a, long b) {
	    long gcm = gcm(a, b);
	    return (a / gcm) + "/" + (b / gcm);
	}
}

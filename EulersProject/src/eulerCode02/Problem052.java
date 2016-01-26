package eulerCode02;
import helpfulMethods.Maths;
public class Problem052 {
	public static void main(String[] args) {
		Maths maths = new Maths();
		boolean notFound = true;
		int a = 1;
		while (notFound) {
			if (maths.intToArray(a)[0]==1) {
				for (int i = 2; i<7; i++) {
					if (!(maths.intToArrayList(a*i).containsAll(maths.intToArrayList(a)) && maths.intToArrayList(a).containsAll(maths.intToArrayList(a*i)))) {
						break;
					} else if (i==6) {
						System.out.println(a);
						notFound = false;
					}
				}
				a++;
			} else {
				a++;
			}
			
			System.out.println(a);
		}
	}
}

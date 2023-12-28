/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int num = (int)(Math.random() * 10);
		System.out.print(num + " ");
		int newNum = (int)(Math.random() * 10);

		while (num <= newNum) {
			System.out.print(newNum + " ");
			num = newNum;
			newNum = (int)(Math.random() * 10);		 

		}

	}
}

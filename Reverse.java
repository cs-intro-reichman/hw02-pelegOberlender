/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String index = args[0];

		for (int i = index.length() - 1; i >= 0 ; i--) {
			System.out.print(index.charAt(i));

		}
		System.out.println();


		int length = index.length();
		int middle = 0;
		
		// #feedback - Use of "if" is unnecessary here. ((length-1) / 2) will give the middle character in both scenarios.
		if (length % 2 == 0) {
			middle = (length / 2) - 1;
		}

		else {
			middle = (length / 2);
		
		}

		System.out.println("The middle character is " + index.charAt(middle));

	}
}

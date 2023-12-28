/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int indexNum = Integer.parseInt(args[0]);
		
		for(int i = 1; i <= indexNum; i++) {
			if(indexNum % i == 0)
			System.out.println(i);
		}
	
	}

}

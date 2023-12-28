/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int indexNum = Integer.parseInt(args[0]);
		String isPerfect = indexNum + " is a perfect number since " + indexNum + " = 1";
		int sum = 1;

		for (int i = 2; i < indexNum; i++) {
			if(indexNum % i == 0) { 
				sum = sum + i;
				isPerfect = isPerfect + " + " + i;		
			}
		}

		if(sum == indexNum) {
			System.out.println(isPerfect);
		}

		else {

			System.out.println(indexNum + " is not a perfect number");

		}

	}
}

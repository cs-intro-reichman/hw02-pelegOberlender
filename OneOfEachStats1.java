/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int index = Integer.parseInt(args[0]);
		double chance = Math.random();
		int children2 = 0;
		int children3 = 0;
		int children4 = 0;
		int countGeneral = 0; 

		for(int i = 0; i < index; i++) {
			boolean isGirl = false, isBoy = false ;
			int count = 0;  

			while((isGirl == false) || (isBoy == false)) {
				if(chance < 0.5) {
				isGirl = true;
				count++;
				} else {
					isBoy = true;
					count++;		
				}
			chance = Math.random();		
			}
			countGeneral = countGeneral + count;

				if (count == 2) {
					children2++;
				} else if(count == 3) {
					children3++;
				} else {
					children4++;
				} 
		}
		
		double averageNum = (double)countGeneral/index;
		System.out.println("Average: " + averageNum + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + children2);
		System.out.println("Number of families with 3 children: " + children3);
		System.out.println("Number of families with 4 or more children: " + children4);

		int mostCommon = Math.max(children4, Math.max(children2,children3));
		if(mostCommon == children4) {
			System.out.println("The most common number of children is 4 or more.");
		} else if(mostCommon == children3) {
			System.out.println("The most common number of children is 3.");
		} else {
			System.out.println("The most common number of children is 2.");
		}
	}
}
import java.util.Random;

public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int index = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		double chance = generator.nextDouble();
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
			chance = generator.nextDouble();;		
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
		
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
	
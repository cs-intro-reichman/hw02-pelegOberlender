
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean isGirl = false;
		boolean isBoy = false;	
		int count = 0;
		double chance = Math.random();
			
		
		while((isGirl == false) || (isBoy == false)) {
			if(chance < 0.5) {
				isGirl = true;
				System.out.print("g ");
				count++;
			}
			else {
				isBoy = true;
				System.out.print("b ");
				count++;		
			}
			chance = Math.random();
		}
		System.out.println();
		System.out.println("You made it... and you now have " + count + " children.");
		
		}
	}


package diceroller;
import java.util.Random;
/**
 * Handles random number generation
 */
public class DiceRoller {

	public DiceRoller(){
		//Does nothing yet
	}
	
	/**
	 * Rolls X Y sided dice
	 * @input int numDice
	 * @input int numSides
	 * @output int Results
	 */
	public void roll(int numDice, int numSides){
		Random rng = new Random();
		for (int idx = 1; idx <= numDice; ++idx){
			int rollValue = rng.nextInt(numSides); //number between 0 and numSides-1
			System.out.println("Congratulations! you rolled a:");
			System.out.println(rollValue+1); //temp workaround to include numSides and 1
			System.out.println(" ");
		}

	}
}

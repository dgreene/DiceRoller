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
			int rollValue = rng.nextInt(numSides);
				System.out.println("Congratulations! you rolled a:");
				System.out.println(rollValue);
				System.out.println(" ");
		}

	}
}

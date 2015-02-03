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
		int totalValue=0;
		for (int idx = 1; idx <= numDice; ++idx){
			int rollValue = rng.nextInt(numSides)+1; //number between 0 and numSides-1
			totalValue=totalValue+rollValue;
			System.out.println("Roll #"+idx+" was a "+rollValue);
		}
		System.out.println("Congratulations! your total is:"+(totalValue));
	}
}

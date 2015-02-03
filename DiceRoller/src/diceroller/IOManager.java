package diceroller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Handles reading from the console and parsing input
 */
public class IOManager{
	private BufferedReader reader;

	/**
	 * Initialization
	 */
	public IOManager(){
		reader = new BufferedReader(new InputStreamReader(System.in));
    }
	
	/**
	 * Gets the next line of user input
	 * @return string from console
	 * @throws IOException
	 */
	public String getLine() throws IOException{
		String result= "";
		try{
			result = reader.readLine();
		}catch(IOException IOexcept){
			throw IOexcept;
		}
		return result;	
	}
	/**
	 * Parses command for valid die rolling expression
	 * @param input string
	 */
	
	public int[] parseRollCommand(String input) throws NumberFormatException{
		int[] output = {0,0};
		if(input.length()>2){
			String[] splitInput=input.split("d",2);
			try{
				int numDice=Integer.parseInt(splitInput[0]);
				int numSides=Integer.parseInt(splitInput[1]);
				output[0]=numDice;
				output[1]=numSides;
			}
			catch(NumberFormatException forExecpt){
				throw forExecpt;
			}

		}	
		return output;
	}
}

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
		System.out.println("Please Enter a Command:");
		String result= "";
		try{
			result = reader.readLine();
		}catch(IOException IOexcept){
			System.err.println("IOException when reading line");
			throw IOexcept;
		}
		return result;	
	}
	/**
	 * Parses command for valid die rolling expression
	 * @param input string
	 */
	
	public int[] parseLine(String input){
		int[] output = new int[2];
		
		
		return output;
	}
}

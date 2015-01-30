package diceroller;
import java.io.IOException;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the RPG Dice Roller!");
		System.out.println("Type help for a list of commands");
		DiceRoller roller = new DiceRoller();
		IOManager io = new IOManager();		
		
		//Check for input until set to exit
		Boolean cont=true;
        while(cont)
        {
        	
        	try{
        		String UserInput=io.getLine();
        		//Quit the program
        		if(UserInput.equalsIgnoreCase("q")){
        			cont=false;  			
        		}
        		//Print Commands
        		else if(UserInput.equalsIgnoreCase("help")){
        			System.out.println("Available commands:");
        			System.out.println("**********");
        			System.out.println("q = Quit Application");
        			System.out.println("roll XdY = roll dice!");
        			System.out.println("help = See this again!");
        			System.out.println("**********");
        		}
        		else if(UserInput.startsWith("roll")){
        			System.out.println("rolling...");
        			
        			int[] rollValues=io.parseLine(UserInput); //incomplete
        			//roller.roll(rollValues[0], rollValues[1]);		//incomplete
        			roller.roll(1,20);
        			
        			//System.out.println("Congratulations! you rolled a:");
        			//System.out.println(result);
        		}
        		     		
        		//catch-all case for unrecognized command
        		else{
        			System.out.println("Command not Recognized");
        			System.out.println("Type 'help' for list of available commands");	
        		}
        	}
        	catch(IOException IOexcept){
        		cont=false;
        	}
        }
        System.out.println("Quitting Dice Roller");
        try{
        	Thread.sleep(1000);
        }catch(Exception e){
        	
        }
        
	}
}


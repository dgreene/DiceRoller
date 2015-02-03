package diceroller;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
				
		System.out.println("Welcome to the RPG Dice Roller!");
		System.out.println("Type help for a list of commands");
		PrintWriter writer = new PrintWriter("RollLog.txt","UTF-8");
		DiceRoller roller = new DiceRoller();
		IOManager io = new IOManager();		
		
		//Check for input until set to exit
		Boolean cont=true;
        while(cont)
        {
        	
        	try{
        		System.out.println("Please Enter a Command:");
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
        		else if(UserInput.startsWith("roll ")){
        			System.out.println("rolling...");
        			int[] rollValues={0,0};
        			boolean success=true;
        			try{
        				rollValues=  io.parseRollCommand(UserInput.substring(5)); 
        			}
        			catch(NumberFormatException numExcept){
            			System.out.println("Inavlid roll parameters, try XdY");
            			success=false;
        			}
        			if(success){
            			int rollTotal=roller.roll(rollValues[0],rollValues[1]);
            			System.out.println("Congratulations! your total is:"+(rollTotal));
            			writer.println("Result of "+rollValues[0]+"d"+rollValues[1]+" = "+ rollTotal);
            			
        			}
        		}
        		     		
        		//catch-all case for unrecognized command
        		else{
        			System.out.println("Command not Recognized");
        			System.out.println("Type 'help' for list of available commands");	
        		}
        	}
        	catch(IOException IOexcept){
    			System.err.println("IOException when reading line");
        		cont=false;
        	}
        }
        writer.close();
        System.out.println("Quitting Dice Roller");
        try{
        	Thread.sleep(1000);
        }catch(Exception e){
        	
        }
        
	}
}


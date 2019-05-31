//import java.io.InputStream;
import java.util.*;

public class Elevator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Initial conditions
		char state = 'C';
		char floor = 'B';
		
// First, we have only one elevator in a three-story building (three floors): the Basement (B), the first floor (1) and the second floor (2)
			
	    
	    //Print of initial state
	    System.out.println("The elevator (E) is in 'B'");
	    
	    //FIRST: Call the elevator from a floor
		System.out.println("Call the elevator");
		System.out.println("Enter the floor you call it from (B,1,2):"); 
		char call = sc.next().charAt(0);
		
		if(call == 'B')
		{
		    System.out.println("The Elevator (E) is now ‘open ‘O’ and ‘C'");
		    System.out.println("Elevator is at the Basement");
		}
		else if(call == '1')
		{
		    System.out.println("The Elevator (E) is going up 'U'");
		    System.out.println("The Elevator (E) is now at '1'");
		    System.out.println("The Elevator (E) is now ‘open ‘O’ and ‘C'");
		}
        else if (call == '2')
	    {
	        System.out.println("The Elevator (E) is going up '2U'");
	        System.out.println("The Elevator (E) is now at '2'");
	        System.out.println("The Elevator (E) is now ‘open ‘O’ and ‘C'");
	    }

        //If elevator is at 1 floor 
		System.out.println("Call the elevator");
		System.out.println("Enter the floor you call it from (B,1,2):"); 
		char call1 = sc.next().charAt(0);
		
		if(call1 == '1')
		{	
			System.out.println("The Elevator (E) is now ‘open ‘O’ and ‘C'");
			System.out.println("Elevator is at the First floor");
		}
		else if(call1 == '2')
		{
			System.out.println("The Elevator (E) is going up '2U'");
	        System.out.println("The Elevator (E) is now at '2'");
	        System.out.println("The Elevator (E) is now ‘open ‘O’ and ‘C'");
		}
		else if(call1 == 'B')
		{
			System.out.println("The Elevator (E) is going down 'D'");
	        System.out.println("The Elevator (E) is now at 'B'");
	        System.out.println("The Elevator (E) is now ‘open ‘O’ and ‘C'");
		}
        	 
		// If elevator is at 2 floor 
		System.out.println("Call the elevator");
		System.out.println("Enter the floor you call it from (B,1,2):"); 
		char call2 = sc.next().charAt(0);
		
		if(call2 == '2')
		{
			System.out.println("The Elevator (E) is now ‘open ‘O’ and ‘C'");
			System.out.println("Elevator is at the Second floor");
		}
		else if(call2 == '1')
		{
			System.out.println("The Elevator (E) is going down 'D'");
	        System.out.println("The Elevator (E) is now at '1'");
	        System.out.println("The Elevator (E) is now ‘open ‘O’ and ‘C'");
		}
		else if(call2 == 'B')
		{
			System.out.println("The Elevator (E) is going down '2D'");
	        System.out.println("The Elevator (E) is now at 'B'");
	        System.out.println("The Elevator (E) is now ‘open ‘O’ and ‘C'");
		}
	}

}

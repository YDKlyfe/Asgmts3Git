import java.util.*;

public class Elevator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        // First, we have only one elevator in a three-story building (three floors): 
        // the Basement (B), the first floor (1) and the second floor (2)
	    
	    //Print of initial state
	    System.out.println("The elevator (E) is in 'Basement'");
	    
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
        else
	    {
	        System.out.println("The Elevator (E) is going up '2U'");
	        System.out.println("The Elevator (E) is now at '2'");
	        System.out.println("The Elevator (E) is now ‘open ‘O’ and ‘C'");
	    }
	    
	    //Now, we press the button of the floor we're going to
	    System.out.println("Press the destination floor");
		System.out.println("Enter the floor you want to go to (B,1,2):"); 
		char dest = sc.next().charAt(0);
		
		if(dest == 'B')
		{
		    if(call == 'B')
		    {
		        System.out.println("The Elevator (E) is already at 'B'");
		    }
		    else if (call == '1')
		    {
		        System.out.println("The Elevator (E) is going down 'D'");
		        System.out.println("The Elevator (E) is now at 'B'");
		    }
		    else
		    {
		        System.out.println("The Elevator (E) is going down '2D'");
	            System.out.println("The Elevator (E) is now at 'B'");
		    }
		    System.out.println("The Elevator (E) is now ‘open ‘O’ and ‘C'");
		}
		else if (dest == '1')
		{
		    if(call == '1')
		    {
		        System.out.println("The Elevator (E) is already at '1'");
		    }
		   
    		else if (call == 'B')   
    		{
    		    System.out.println("The Elevator (E) is going up 'U'");
		        System.out.println("The Elevator (E) is now at '1'");
    		}
    		else
    		{
    		    System.out.println("The Elevator (E) is going down 'D'");
	            System.out.println("The Elevator (E) is now at '1'");
    		}
    		System.out.println("The Elevator (E) is now ‘open ‘O’ and ‘C'");
		}
		else if (dest == '2')
		{
		    if (call == '2')
		    {
		        System.out.println("The Elevator (E) is already at '2'");
		    }
		    else if (call == '1')
		    {
		        System.out.println("The Elevator (E) is going down 'D'");
	            System.out.println("The Elevator (E) is now at '1'");
		    }
		    else 
		    {
		        System.out.println("The Elevator (E) is going down '2D'");
	            System.out.println("The Elevator (E) is now at 'B'");
		    }
		    System.out.println("The Elevator (E) is now ‘open ‘O’ and ‘C'");
		}
	}
}
	

	
	



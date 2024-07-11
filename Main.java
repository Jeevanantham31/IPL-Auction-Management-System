package auction;
import java.util.*;
import java.util.Map.Entry;
public class Main {
	public static void main(String[] args) 
	{
		TeamDetails td = new TeamDetails();
		TeamDatabase tdb = new TeamDatabase();
		PlayersDatabase pdb = new PlayersDatabase();
		Scanner s = new Scanner(System.in);
        String username = "123";
        String Password = "123";
        System.out.println("\n----------------------------------------------------------------------");
        System.out.println("---------------- WELCOME TO IPL AUCTION MANAGEMENT --------------------");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println();
        while(true)
        {
        	System.out.println("Enter type of Users : Admin = 0 / User = 1 ");
            int n = s.nextInt();
            boolean c= false;
            while(c == false) 
            {
                if(n==0) 
                {
                    System.out.println("...Welcome to Admin....\n");
                    System.out.println("Enter the UserName : ");
                    String un = s.next();
                    System.out.println("Enter the Password : ");
                    String pwd = s.next();
                    if(un.equals(username) && pwd.equals(Password))
                    {
                    	new Admin();
                    	c = true;
                    }
                    else {
                    	System.out.println("Login failed...! Please enter Valid user name and Password");
                        System.out.println();
                    	System.out.println("-----------------------------");
                    	c = false;  	
                    }
                }
                else if(n==1) {
                	new User();
                	n=2;
                }
                else if(n==2) {
                	System.out.println("Do you want to continue->");
                	
                	String st = s.next();
                	if(st.equalsIgnoreCase("y"))
                	{
                	  new User();	
                	}
                	else {
                		System.out.println("Thank you...");
                		c = true;
                	}
                }
                System.out.println("Do you want to close -> ");
            	
            	String st = s.next();
            	if(st.equalsIgnoreCase("y"))
            	{
            	  	break;
            	}
            }

        	
        }
	}
}
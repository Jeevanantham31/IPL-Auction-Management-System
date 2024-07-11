package auction;
import java.util.Scanner;
public class User {
   
	User()
	{
		TeamDetails td = new TeamDetails();
        PlayerDetails pd = new PlayerDetails();
		Scanner s = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("-----Welcome to user-----");
        System.out.println("Enter 0 for Team details or 1 for Players details  ");
        int n = s.nextInt();
        boolean b = true;
        if(n==0)
        {
         	while(b) {
        	    System.out.println("-----------------------------------\n");
             	System.out.println("---Teams---");
             	System.out.println("\nEnter 1 to display the teams list"
             			          +"\nEnter 2 to display particular team details"
             			          +"\nEnter 3 to Exit");
             	int m = s.nextInt();
             	switch(m)
             	{
             	case 1:
             		   td.display();
             		   b=true;
             		   break;
             	case 2:
             		   td.search();
             	       b=true;
             		   break;
             	case 3:
             		   System.out.println("Exit..");
             		   b = false;
             		   break;
             	default:
             		System.out.println("Enter Correct choice...");
             	
             	}
             }
        }

        else if(n==1) 
        {
        	while(b) {
        	    System.out.println("------------------------------------------\n");
             	System.out.println("--------------Players---------------------\n");
             	System.out.println("\nEnter 1 to display the players list"
             			          +"\nEnter 2 to display particular player details"
             			          +"\nEnter 3 to Exit");
             	int m = s.nextInt();
             	switch(m)
             	{
             	case 1:
          		   s.nextLine();
         		   pd.Display();
         		   b=true;
         		   break;
             	case 2:
             		   pd.search();
             	       b=true;
             		   break;
             	case 3:
             		   System.out.println("Exit..");
             		   b = false;
             		   break;
             	default:
             		System.out.println("Enter Correct choice...");
             	
             	}
             }
         
        }
        
        
	}
}
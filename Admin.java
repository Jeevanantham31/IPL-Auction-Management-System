package auction;
import java.util.*;
public class Admin 
{
	Admin() 
	{
		TeamDetails td = new TeamDetails();
        PlayerDetails pd = new PlayerDetails();
		Scanner s = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("---Welcome to Admin---");
        System.out.println("Enter 0 for Team Manipulation or 1 for Players Manipulation  ");
        int n = s.nextInt();
        boolean b = true;
        
        //team manipulation
        if(n==0)
        {
         	while(b) {
        	    System.out.println("-------------------------\n");
             	System.out.println("----------Teams----------");
             	System.out.println("Enter 1 to Create  the new team details"
             			        +"\nEnter 2 to update the team details"
             			        +"\nEnter 3 to delete the team details"
             			        +"\nEnter 4 to display the teams list"
             			        +"\nEnter 5 to display particular team details"
             			        +"\nEnter 6 to Exit");
             	int m = s.nextInt();
             	switch(m)
             	{
             	case 1:
             		System.out.println("Enter the sl no :");
             		int sl = s.nextInt();
             		s.nextLine();
             		System.out.println("Enter the team name :");
             		String name = s.nextLine();
             		System.out.println("Enter Captain name");
             		String captain = s.nextLine();
             		System.out.println("Enter the coach name");
             		String coach = s.nextLine();
                    System.out.println("Enter no.of.players ");
             		int players = s.nextInt();
             		
             		td.create(sl, name, captain, coach, players);
             		b=true;
             		break;
             	case 2:

             		td.update();
             		b=true;
             		break;
             	case 3:
             		  System.out.println("Enter the team to delete ");
             		  s.nextLine();
             		  String tname1 = s.nextLine();
             		  tname1 = tname1.toUpperCase();
             		  td.delete(tname1);
             		  b=true;
             		  break;
             	case 4:
             		   td.display();
             		   b=true;
             		   break;
             	case 5:
             		   td.search();
             	       b=true;
             		   break;
             	case 6:
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
    	    System.out.println("----------------------------------------------------------\n");
         	System.out.println("---------------------Teams--------------------------------\n");
         	System.out.println("Enter 1 to Create  the new Player details"
         			        +"\nEnter 2 to update the Player details"
         			        +"\nEnter 3 to delete the Player details"
         			        +"\nEnter 4 to display particular Players details"
         			        +"\nEnter 5 to Exit");
         	int m = s.nextInt();
         	switch(m)
         	{
         	case 1:
         		System.out.println("Enter the sl no :");
         		int sl = s.nextInt();
         		s.nextLine();
         		System.out.println("Enter the team name :");
         		String name = s.nextLine();
         		System.out.println("Enter Captain name");
         		String captain = s.nextLine();
         		System.out.println("Enter the coach name");
         		String coach = s.nextLine();
                System.out.println("Enter no.of.players ");
         		int players = s.nextInt();
         		
         		td.create(sl, name, captain, coach, players);
         		b=true;
         		break;
         	case 2:

         		td.update();
         		b=true;
         		break;
         	case 3:
         		  System.out.println("Enter the Player name ");
         		  s.nextLine();
         		  String pname1 = s.nextLine();
         		  pname1 = pname1.toUpperCase();
         		  pd.delete(pname1);
         		  b=true;
         		  break;
         	case 4:
         		   pd.search();
         	       b=true;
         		   break;
         	case 5:
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
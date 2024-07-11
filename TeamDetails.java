package auction;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import auction.TeamDatabase;

public class TeamDetails
{
	static HashMap<String ,team > d = TeamDatabase.d;	
	
	
	//details fetching to hashmap
	void create(int id , String name, String captain , String coach ,int players)
	{
		team tm = new team(id,name,captain,coach,players);
		d.put(name,tm);	
	}
	
	//update team details
	void update()
	{
		Scanner s = new Scanner(System.in);
 		System.out.println("Enter the team name to update ");
 		String tname = s.nextLine();
 		tname = tname.toUpperCase();
// 		boolean b = true;
//     	while(b) {
    	    System.out.println("-------------------------\n");
         	System.out.println("-----Teams-----");
         	System.out.println("Enter 1 to change captain name "
         			        +"\nEnter 2 to change coach name "
         			        +"\nEnter 3 to no.of.players "
         			        +"\nEnter 4 to Exit");
         	int m = s.nextInt();
            team temp = d.get(tname);
         	switch(m)
         	{
         	case 1:
         		s.nextLine();
         		System.out.println("Enter new captain name : ");
         		String newCaptain = s.nextLine();
         		temp.captain = newCaptain;
         	    break;  
         	case 2:
         		s.nextLine();
         		System.out.println("Enter new coach name : ");
         		String newCoach = s.nextLine();
         		temp.coach = newCoach ;
         	    break; 
         	case 3:
         		s.nextLine();
         		System.out.println("Enter new no.of.players : ");
         		int newPlayers = s.nextInt();
         		temp.players = newPlayers;
         	    break; 
         	case 4:
         		System.out.println("Exit..........");
 	      	}
	    }
	
	//delete team
	void delete(String tname1) 
	{
		
		d.remove(tname1);
		
	}
	
	//display team lists
	void display() 
	{
		System.out.println("Team Lists");
		for(Entry<String ,team> e :d.entrySet()) {
			
			System.out.print(e.getKey()+" ");
		}
		System.out.println();
	}	
	//display particular team
	 void search() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("------------------------------------------\n");
        System.out.println("Enter the Team name");
        String a = s.nextLine();
        a = a.toUpperCase();
        team temp = d.get(a);
		System.out.println("------------------------------------------\n");
		System.out.println("Sl no                    "+temp.getId()
						+"\nTeam Name                "+temp.getName()
						+"\nCaptain                  "+temp.getCaptian()
						+"\nHead Coach               "+temp.getCoach()
						+"\nNo.of.players            "+temp.getPlayers()
						+"\n-------------------------------------------\n");
	}
}
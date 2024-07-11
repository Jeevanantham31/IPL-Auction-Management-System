package auction;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class PlayerDetails 
{
	static HashMap<String , player> p = PlayersDatabase.p;
	
	//players data fetching to hashmap
	void create(int id , String name, String country , int bp , int sp , String team)
	{
		player pl = new player(id,name,country,bp,sp,team);
		p.put(name,pl);
	}
	
	//particular player update
	void update() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter player name to update ");
		String name = s.nextLine();
		name = name.toUpperCase();
		player temp = p.get(name);
		System.out.println("Enter 1 to Change Base Price "
				        +"\nEnter 2 to Change Sold Price"
				        +"\nEnter 3 to Change Team"
				        +"\nEnter 4 to Exit");
		int n = s.nextInt();
		switch(n) 
		{
		case 1:
			System.out.println("Enter New Base Price ");
			int newBase = s.nextInt();
			temp.bp = newBase;
			break;
		case 2:
			System.out.println("Enter New Sold Price");
			int newSold = s.nextInt();
			temp.sp = newSold;
			break;
		case 3:
			System.out.println("Enter New Team");
			String newTeam = s.nextLine();
			temp.team = newTeam;
			break;
		case 4:
			System.out.println("Exit..........");
	    default:
			System.out.println("Enter Correct choice...");
		}
	}

    void delete(String n)
    {
         p.remove(n);	
    }
    
    void Display() 
    {
    	for(Entry <String ,player> e : p.entrySet())
    	{
			System.out.println(e.getKey()+" ");		
    	}
    }
    
    void display(String tname) {
    	  player temp = p.get(tname);
    	  for(Entry <String ,player> e: p.entrySet())
    	  {
    	  	if((e.getValue()).equals(temp))
    	  	{
    	  		System.out.println(temp.name);
    	  	}
    	  	
    	  }
    }
    
	//particular player Search 
	 void search() 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("---------------------------");
        System.out.println("Enter the Player name");
        String a = s.nextLine();
        a = a.toUpperCase();
        player temp = p.get(a);
		System.out.println("------------------------------------------");
		System.out.println("sl no : "+temp.getId()
						+"\nName : "+temp.getName()
						+"\nCountry : "+temp.getCountry()
						+"\nBase Price : "+temp.getBasep()
						+"\nSold price : "+temp.getSold()
						+"\nTeam : "+temp.getTeam()
						+"\n-----------------------------------------");
	}
}

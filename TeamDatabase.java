package auction;

import java.util.HashMap;

class team
{
	int id ;
	String name;
	int players;
	String captain;
	String coach;
	
	 team(int id , String name, String captain , String coach ,int players)
	 {
		this.id = id;
		this.name = name;
		this.captain = captain;
		this.coach = coach;
		this.players = players;
	}
	public int getId() {
			return id;
	}
	public String getName() {
		return name;
	}
	public String getCaptian() {
		return captain;
	}
	public String getCoach() {
		return coach;
	}
	public int getPlayers() {
		return players;
    }
}
public class TeamDatabase 
{
	static HashMap<String ,team > d = new HashMap<>();	
	
	
	//details fetching to hashmap
	
	 TeamDatabase() 
	{
          d.put("CSK", new team(1, "CSK", "Rutu", "Flemings", 23));
          d.put("MI", new team (2, "MI", "Hardik", "Pollard", 24));
          d.put("RCB", new team (3, "RCB", "Faf", "Kedhar Jadav", 25));
          d.put("RR", new team (4, "RR", "Sanju", "Sangakara", 24));
          d.put("GT", new team (5, "GT", "Gill", "Nehra", 23));
          d.put("LSG", new team (6, "LSG", "KL", "Karun nayar", 23));
          d.put("DC", new team (7, "DC", "Pant", "Ponting", 23));
          d.put("PBKS", new team (8, "PBKS", "Sam", "Kumble", 23));
          d.put("KKR", new team (9, "KKR", "Iyer", "Gambir", 25));
          d.put("SRH", new team (10, "SRH", "Pat", "Murali", 25));
          
	}
}

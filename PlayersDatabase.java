package auction;
import java.util.HashMap;

class player{
	int id;
	String name;
	String country ;
	int bp ;
	int sp ;
	String team;
	player(int id , String name, String country , int bp , int sp , String team)
	{
	  	this.id = id;
	  	this.name = name;
	  	this.country = country;
	  	this.bp = bp;
	  	this.sp = sp;
	  	this.team = team;
	}
	
	  	public int getId() {return id;}
	  	public String getName() {return name;}
	  	public String getCountry() {return country;}
	  	public int getBasep() {return bp;}
	  	public int getSold() {return sp;}
	  	public String getTeam() {return team;}
}
public class PlayersDatabase {
	
	static HashMap<String , player> p = new HashMap<>();
	
	//players database
	PlayersDatabase()
	{
		p.put("DHONI", new  player(1,"DHONI","India",2,30,"CSK"));
		p.put("KHOLI", new  player(2,"KHOLI","India",2,30,"RCB"));
		p.put("ROHIT", new  player(3,"ROHIT","India",2,30,"MI"));
		

	}
}

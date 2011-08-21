package buildings;

import engine.Game;

public class Base {
	//Image and other info
	int img = 0;
	String name = "Bacon";
	String desc = "Giggles";
	
	//Health (How long until it is captured / destroyed, and how far along it is)
	int maxhealth = 20;
	int health = maxhealth;
	
	//owner's ID and team #
	public int owner;
	public int team = 0;
	
	//Location
	public int x;
	public int y;
	
	public Base(int owner,int team,int xx, int yy) {
		//15 = Neutral, 12~14 are unused. (12 max players)
		this.owner=owner;
		this.team=team;
		x=xx;
		y=yy;
		img=SetImage();
	}
	
	protected int SetImage() {return 0;}
	protected String setName() {return "Name";}
	protected String setDesc() {return "Descriptive Words.";}

	public void OpenMenu() {}
	
	public void Capture(int hp, int winner) {
		//TODO: Animation trigger for capturing.
		health-=hp;
		if (health<=0) {
			System.out.println("Building Captured!");
			owner=winner;
			team=Game.player.get(winner).team;
			health=maxhealth;
		}
		else {
			System.out.println("Building hp : " + health);
		}
		
	}
	
	public int[] DrawMe() {
		int[] loc = {img,team};
		return loc;
	}
}
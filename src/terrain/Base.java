package terrain;

public class Base {
	//These are the true/false settings for each unit type for walking in this area.
	public boolean walk() {return false;}
	public boolean drive() {return false;}
	public boolean swim() {return false;}
	public boolean fly() {return true;}
	
	public boolean building() {return false;}
	public double speed() {return 1;}//Path Cost based on 10 (-10 = almost none, +10 = a ton)
	public double defense() {return 1;};//Protection offered for those being shot at.
	public int x() {return 0;};
	public int y() {return 0;}
}

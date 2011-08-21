package terrain;

public class Grass extends Base implements Inter {
	public boolean walk() {return true;}
	public boolean drive() {return true;}
	public boolean swim() {return false;}
	public boolean fly() {return true;}
	public double speed() {return 0.5;}
	public int defense() {return 0;};
	public int x() {return 1;};
	public int y() {return 0;}
}
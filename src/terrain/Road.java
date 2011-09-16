package terrain;

public class Road extends Base {
	public boolean walk() {return true;}
	public boolean drive() {return true;}
	public boolean swim() {return false;}
	public boolean fly() {return true;}
	public double speed() {return 1.1;}
	public double defense() {return 1;};
	public int x() {return 1;};
	public int y() {return 1;}
}

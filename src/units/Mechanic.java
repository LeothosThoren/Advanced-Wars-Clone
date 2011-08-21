package units;

public class Mechanic extends Base {

	public Mechanic(int owner, int xx, int yy, boolean active) {
		super(owner, xx, yy, active);
		name = "Mechanic";
		nick = "Mech";
		desc = "Slow infantry with some anti vehicle stuff.";
		img = 0;
		speed = 4;
	}

}
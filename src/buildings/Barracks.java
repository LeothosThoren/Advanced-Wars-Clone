package buildings;

import engine.Game;

public class Barracks extends Base {

	public Barracks(int owner, int team, int xx, int yy) {
		super(owner, team, xx, yy);
		name="Capital";
		desc="Creates ground units.";
		img = 2;
	}

	public void OpenMenu() {
		Game.gui.gms.OpenMenu("Barrack", x, y);
	}
}

package engine;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * This grabs a list of maps and puts them minus the .txt into the map list in the main menu.
 * TODO: Might use this class to also find texture packs and mods (when/if I add them) 
 * @author SergeDavid
 * @version 0.1
 */
public class MapFinder {
	final String path = "maps/";

	public ArrayList<String> GrabMaps() {
		String name;
		File folder = new File(path);
		File[] filelist = folder.listFiles();
		List<String> maps = new ArrayList<String>();
		for (int i = 0; i < filelist.length; i++) {
			if (filelist[i].isFile()) {
				name = filelist[i].getName();
				if (name.endsWith(".txt") || name.endsWith(".TXT")) {
					Game.gui.maps_model.addElement(name.substring(0, name.length()-4));
					maps.add(name);
				}
			}
		}
		return (ArrayList<String>) maps;
	}
}

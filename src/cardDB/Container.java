package cardDB;

import java.util.List;

import javax.xml.stream.Location;

class Container {
	private List<Location> locations;
	private int capacity;
	public boolean isFull() {
		if(locations.size()==capacity)
			return true;
		else
			return false;
	}
	public Location getNewLocation(void){
		Location loc=new Location(locations.size(),this);
		return loc;
	}

}

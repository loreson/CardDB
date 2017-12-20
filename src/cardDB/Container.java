package cardDB;

import java.util.List;



class Container {
	private List<Location> locations;
	private int capacity;
	public boolean isFull() {
		if(locations.size()==capacity)
			return true;
		else
			return false;
	}
	public Location getNewLocation(){
		Location loc=new Location(locations.size(),this);
		locations.add(loc);
		return loc;
	}

}

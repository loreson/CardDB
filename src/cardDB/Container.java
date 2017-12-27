package cardDB;

import java.io.Serializable;
import java.util.List;



class Container implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 17L;
	private List<Location> locations;
	private int capacity;
	private String name;
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
	public String name() {
		return this.name;
	}

}

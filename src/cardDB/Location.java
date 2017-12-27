package cardDB;

import java.io.Serializable;

public class Location implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 17L;
	public Location(int position, Container container){
		this.container=container;
		this.position=position;
		
	}
	
	private int position;
	private Container container;
	public String toString() {
		return this.container.name()+" pos: "+Integer.toString(position);
	} 
}

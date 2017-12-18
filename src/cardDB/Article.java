package cardDB;

import java.util.List;

public class Article {
	private String name;
	private boolean foil;
	private Condition condition;
	private int artNr;
	private  int prodNr;
	private Language language;
	private List<Location> locations;
	private int Count;
	public  Article(Location location, Language language,Condition condition, int artNr, int prodNr, Container container ){
		this.artNr=artNr;
		this.prodNr=prodNr;
		this.language=language;
		this.condition=condition;
		if(container.isFull())
			throw new IllegalArgumentException("Container is fulll"); //TODO: own exception Type

		this.locations=new ArrayList<Location>();
		this.locations.add(container.getNewLocation());
		
	}
	public boolean isStackable(ScannedCard card ){
		if(this.language.equals(card.language)&&this.condition.equals(card.condition)&&this.prodNr==card.prodNr&&this.foil==card.foil)
		{
			return true;
		}
			return false;
		
	}
	
		
		
}

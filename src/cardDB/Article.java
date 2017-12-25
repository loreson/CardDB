package cardDB;

import java.util.ArrayList;
import java.util.List;

public class Article {
	private String name;
	private boolean foil;
	private Condition condition;
	private int artNr;
	private  int prodNr;
	private Language language;
	private List<Location> locations;
	private int count;
	public  Article(ScannedCard card, Container container ){
		this.prodNr=card.prodNr();
		this.language=card.language();
		this.condition=card.condition();
		if(container.isFull())
			throw new IllegalArgumentException("Container is fulll"); //TODO: own exception Type

		this.locations=new ArrayList<Location>();
		this.locations.add(container.getNewLocation());
	//TODO: Implement	artNr=mkm.CreateArticle(this);
		
	}
	public boolean isStackable(ScannedCard card ){
		if(this.language.equals(card.language())&&this.condition.equals(card.condition())&&this.prodNr==card.prodNr()&&this.foil==card.foil())
		{
			return true;
		}
			return false;
		
	}
	public void stack(ScannedCard card, Container container)
	{
		this.locations.add(container.getNewLocation());	
		count++;
		
	}
	public void removeFirstLocal() {
		count--;
		locations.remove(0);
		
	}
	public void printFirstLocation() {
		System.out.println(locations.get(0).toString());		
	}
	
	
		
		
}

package cardDB;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Article implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 17L;
	private String name;
	private boolean foil;
	private Condition condition;
	private int artNr;
	private  int prodNr;
	private Language language;
	private List<Location> locations;
	private int count;
	public  Article(ScannedCard card){
		this.prodNr=card.prodNr();
		this.language=card.language();
		this.condition=card.condition();
		

		this.locations=new ArrayList<Location>();
		this.locations.add(card.location());
	//TODO: Implement	artNr=mkm.CreateArticle(this);
		
	}
	public boolean isStackable(ScannedCard card ){
		if(this.language.equals(card.language())&&this.condition.equals(card.condition())&&this.prodNr==card.prodNr()&&this.foil==card.foil())
		{
			return true;
		}
			return false;
		
	}
	public void stack(ScannedCard card)
	{
		this.locations.add(card.location());	
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

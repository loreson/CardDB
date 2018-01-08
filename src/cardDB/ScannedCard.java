package cardDB;

public class ScannedCard{
	private String name;
	private String edition;
	private Condition condition;
	public Condition condition(){
		return condition;
	}
	private Language language;
	public Language language()
	{
	return language;	
	}
	private boolean foil;
	public boolean foil() 
	{
		return foil;
	}	

	private int prodNr;
	public int prodNr()
	{
		return prodNr;
	}
	private Location location;
	 
	public ScannedCard(String name, String editon, Condition condition, Language language, boolean foil, Container container)
	{
		location=container.getNewLocation();
		this.name=name; this.edition=edition; this.condition=condition; this.language=language;this.foil=foil;
		//TODO: get prodNr from mkm
	}

	public  Location location() 
	{
		
		return location;
	}

	
}
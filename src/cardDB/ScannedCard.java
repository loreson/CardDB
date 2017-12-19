package cardDB;

public class ScannedCard{
	private String name;
	private String edition;
	private Condition condition;
	private Language language
	private boolean foil;
	private int prodNr;
	public ScannedCard(String name, String editon, Condition condition, Language language, boolean foil)
	{
		this.name=name; this.edition=edition; this.condition=condition; this.language=language;this.foil=foil;
		//TODO: get prodNr from mkm
	}	
}

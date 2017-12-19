package cardDB;

import java.util.List;

public class CardDB {
	
private  List<Article> articleList;
private List<Container> containerList;
public void SellScannedCard(ScannedCard Card)
{
	int ProdNr=17;//TODO:get from mkm;
	for(Article art: articleList)
	{
	 if (art.isStackable(card))
	 {
		 art.stack(card,container)
		 //TODO: addOnMkm
		 return;
	 }
	}
	Article art=new Article(card,container);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}


}

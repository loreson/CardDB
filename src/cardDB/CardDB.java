package cardDB;

import java.util.List;

public class CardDB {
	
private  List<Article> articleList;
private List<Container> containerList;
public void SellScannedCard(ScannedCard card)
{
	int ProdNr=17;//TODO:get from mkm;
	Container container = null;
	for(Article art: articleList)
	{
	 if (art.isStackable(card))
	 {
		 art.stack(card,container);
		 //TODO: addOnMkm
		 return;
	 }
	}
	Article art=new Article(card,container);
	
}
public void SoldArticle(Article sold, int count)
{
	for(int i=0; i<count; i++)
	{
		Article.printLocation();
		Article.removeFirstLocal();
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}


}

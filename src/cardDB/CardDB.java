package cardDB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class CardDB {
private String DBPath;
private CardDB(String DBPath) throws ClassNotFoundException, IOException
{
	this.DBPath=DBPath;
	if(hasState()){
		 deSerializeState();
		
	}
	else
	{
		newState();
	}
	
}
	
private void newState() {
	articleList=new ArrayList<Article>();
	containerList=new ArrayList<Container>();
	
}

@SuppressWarnings("unchecked")
private void deSerializeState() throws ClassNotFoundException, IOException {
	FileInputStream fileIn = new FileInputStream(DBPath);
	ObjectInputStream in = null;

    in = new ObjectInputStream(fileIn);
	
    articleList=(List<Article>) in.readObject();
    containerList=(List<Container>) in.readObject();
    in.close();
    fileIn.close();
}

private boolean hasState() {
	if(new File(DBPath).isFile())
	{
		return true;
	}
	return false;
}

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
		sold.printFirstLocation();
		sold.removeFirstLocal();
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 CardDB cardDB=new CardDB(args[1]);
		
	}
	


}

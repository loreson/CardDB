package cardDB;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;



public class CardDB extends JFrame {
private String DBPath;
private CardDB(String DBPath)
{
	this.DBPath=DBPath;
	if(hasState()){
		 try {
			deSerializeState();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	else
	{
		newState();
	}

    initUI();
	
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
private void initUI() {
    
    setTitle("CardDB v3");
    setSize(300, 200);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    JButton scannerButton = new JButton("Scan new Cards");
    scannerButton.addActionListener((ActionEvent event) -> {
    	EventQueue.invokeLater(() -> {
			CardScanner cardScanner=new CardScanner(this);
		   cardScanner.setVisible(true);
		});
	
    });
    createLayout(scannerButton);
}

private void createLayout(JComponent... arg) {

    java.awt.Container pane = getContentPane();
    GroupLayout gl = new GroupLayout(pane);
    pane.setLayout(gl);

    gl.setAutoCreateContainerGaps(true);

    gl.setHorizontalGroup(gl.createSequentialGroup()
            .addComponent(arg[0])
    );

    gl.setVerticalGroup(gl.createSequentialGroup()
            .addComponent(arg[0])
    );
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
		 art.stack(card);
		 //TODO: addOnMkm
		 return;
	 }
	}
	Article art=new Article(card);
	
}
public void SoldArticle(Article sold, int count)
{
	for(int i=0; i<count; i++)
	{
		sold.printFirstLocation();
		sold.removeFirstLocal();
	}
	
}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(() -> {
			 CardDB cardDB=new CardDB(args[0]);
		   cardDB.setVisible(true);
		});
	

		
	}



	public void addContainer(String containerName, int containerCapacity) {
		Container container=new Container(containerName, containerCapacity);
		containerList.add(container);
	}
	


}

package cardDB;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class CardScanner extends JFrame {
	private void initUI() {
	    
	    setTitle("Scanner");
	    setSize(300, 200);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    JButton ContainerCreationButton = new JButton("Create Container");
	    ContainerCreationButton.addActionListener((ActionEvent event) -> {
	    	ContainerCreator containerCreator= new ContainerCreator(cardDB);
	    	containerCreator.setVisible(true);
	    });
	    String[] containerStrings=cardDB.containerStrings();
	    JList<String> containerList=new JList<String>(containerStrings);
	    createLayout(ContainerCreationButton, containerList);
	}

	private void createLayout(JComponent... args) {

	    java.awt.Container pane = getContentPane();
	    JPanel panel = new JPanel();
	    GridLayout gl = new GridLayout(0,2);
	    panel.setLayout(gl);
	    for(JComponent arg:args)
	    {
	    	panel.add(arg);
	    }
	    pane.add(panel,BorderLayout.NORTH);
	    

	}

	
	
	public CardScanner(CardDB cardDB)
	{
		this.cardDB=cardDB;
	    initUI();

	
	}
	
	private CardDB cardDB;
	
	
	
}

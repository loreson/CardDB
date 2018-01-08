package cardDB;

import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class CardScanner extends JFrame {
	private void initUI() {
	    
	    setTitle("Scanner");
	    setSize(300, 200);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    JButton scannerButton = new JButton("Create Container");
	    scannerButton.addActionListener((ActionEvent event) -> {
	        //TODO: implement
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

	
	
	public CardScanner(CardDB cardDB)
	{
		this.cardDB=cardDB;
	    initUI();

	
	}
	
	private CardDB cardDB;
	
	
	
}

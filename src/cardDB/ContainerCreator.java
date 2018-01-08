package cardDB;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContainerCreator extends JFrame implements ActionListener {
	public ContainerCreator()
	{
		initUI();
	}
private void initUI() {
	    
	    setTitle("Create Container");
	    setSize(300, 200);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    nameField=new JTextField("Container Name",25);
	    nameField.addActionListener(this);
	    capacityField =  null;// TODO: implement;
	    createLayout(nameField);
	    
	}

	private void createLayout(JComponent... arg) {

	  JPanel panel=new JPanel();
	   GridLayout gl = new GridLayout();
	    panel.setLayout(gl);
	    panel.add(arg[0]);
	    java.awt.Container pane = getContentPane();
	    pane.add(panel,BorderLayout.NORTH);

	 
	}

	JTextField nameField;
	JFormattedTextField capacityField;
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		// TODO Auto-generated method stub
		
	}
}

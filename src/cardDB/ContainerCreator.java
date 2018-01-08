package cardDB;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
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
	    NumberFormat amountFormat = NumberFormat.getNumberInstance();
	    capacityField =  new JFormattedTextField(amountFormat);
	    capacityField.addActionListener(this);
	    createLayout(nameField,capacityField);
	    
	}

	private void createLayout(JComponent... args) {

	  JPanel panel=new JPanel();
	   GridLayout gl = new GridLayout();
	    panel.setLayout(gl);
	    for( JComponent arg: args ){
	    panel.add(arg);
	    }
	    java.awt.Container pane = getContentPane();
	    pane.add(panel,BorderLayout.NORTH);
	    
	 
	}

	JTextField nameField;
	JFormattedTextField capacityField;
	private String containerName;
	private int  containerCapacity;
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==nameField)
		{
			containerName=e.getActionCommand();
			System.out.println(containerName);
		}
		if(e.getSource()==capacityField)
		{
			containerCapacity=Integer.parseInt(e.getActionCommand());
			System.out.println(containerCapacity);
		}
		
	}
}

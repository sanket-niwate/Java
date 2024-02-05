package sanket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Search extends JFrame{
	
	JLabel label1;
	JTextField field1;
	JButton button1;
	
	public Search() {
		// TODO Auto-generated constructor stub
		setLayout(null);
	    label1=new JLabel("Search Id");
	    field1=new JTextField(10);
		 button1=new JButton("Search");
	     button1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
//			if (field1.setText(" ")&&field2.setText(" ")&&field3.setText(" ")&&field4.setText(" ")) {
//				System.out.println("success");
//			} else {
//				System.out.println("invalid");
//			}
			System.out.println("Search");
			
			
		}
		
	});
	     
	     label1.setBounds(50,50,60,30);
	 	field1.setBounds(120,50,90,30);
		button1.setBounds(60,100,100,30);
		
		add(label1);
		add(field1);
		add(button1);
		setSize(400, 400);
		setVisible(true);
	}

}

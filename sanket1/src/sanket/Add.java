package sanket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Add extends JFrame{
	JLabel label1,label2,label3,label4;
	JTextField field1,field2,field3,field4;
	JButton button1,button2;

		
		public Add() {
			// TODO Auto-generated constructor stub
			setLayout(null);
			 label1=new JLabel("name");
			 label2=new JLabel("id");
			 label3=new JLabel("salary");
			 label4=new JLabel("address");
			 field1=new JTextField(10);
			 field2=new JTextField(10);
			 field3=new JTextField(10);
			 field4=new JTextField(10);
			 button1=new JButton("Save");
		     button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				if (field1.setText(" ")&&field2.setText(" ")&&field3.setText(" ")&&field4.setText(" ")) {
//					System.out.println("success");
//				} else {
//					System.out.println("invalid");
//				}
				System.out.println("success");
				 
				
			}
			
		});
		 button2=new JButton("reset"); 
		 
		 button2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					field1.setText("");
					field2.setText("");
					field3.setText("");
					field4.setText("");
					System.out.println("Reset");

				
				}
			});
		 
		label1.setBounds(50,50,60,30);
		field1.setBounds(120,50,90,30);
		label2.setBounds(50,100,60,30);
		field2.setBounds(120,100,90,30);
		label3.setBounds(50,150,60,30);
		field3.setBounds(120,150,90,30);
		label4.setBounds(50,200,60,30);
		field4.setBounds(120,200,90,30);
		button1.setBounds(60,250,100,30);
		button2.setBounds(180,250,100,30);

			add(label1);
			add(field1);
			add(label2);
			add(field2);
			add(label3);
			add(field3);
			add(label4);
			add(field4);
			add(button1);
			add(button2);
			setSize(400, 400);
			setVisible(true);
		}

}

package sanket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Emphome extends JFrame {
	JButton button1,button2;
	
	public Emphome() {
	
		setLayout(null);
		 button1=new JButton("Save emp");
	     button1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
	new Emp();
	dispose();
			
			
		}
		
	});
	 button2=new JButton("delete emp"); 
	 
	 button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Empdelete();
				dispose();	

			
			}
		});
	 button1.setBounds(60,250,100,30);
		button2.setBounds(180,250,100,30);
	
		add(button1);
		add(button2);
		setSize(400, 400);
		setVisible(true);
	 
	}
	public static void main(String[] args) {
		new Emphome();
	}

}

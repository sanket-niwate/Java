package sanket;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menubar extends JFrame{
	
JMenuBar bar;
JMenu menu1,menu2,menu3,menu4;
JMenuItem item1,item2,item3,item4,item5,item6,item7,item8,item9;
	public Menubar() {

		setLayout(new FlowLayout());
		bar =new JMenuBar();
		menu1=new JMenu("Employee");
		menu2=new JMenu("Employee Details");
		menu3=new JMenu("Accouts");
		menu4=new JMenu("Utilities");
		item1=new JMenuItem("Add");
		item1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Add();
				dispose();
			}
		});
		item2=new JMenuItem("Update");
		item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Update();
				dispose();
				
			}
		});
		item3=new JMenuItem("Delete");
		item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Delete();
				dispose();
			}
		});
		item4=new JMenuItem("Show Employee");
		item4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Showemployee();
				dispose();
			}
		});
		item5=new JMenuItem("Search Employee");
		item5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Search();
				dispose();
			}
		});
		item6=new JMenuItem("Show Employee Salary");
		item6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Salary();
			}
		});
		item7=new JMenuItem("Help");
		item7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			new Help();	
			}
		});
		item8=new JMenuItem("Thoght of the day");
		item9=new JMenuItem("Exit");
		item9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		

		
		
		add(bar);
		bar.add(menu1);
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		bar.add(menu2);
		menu2.add(item4);
		menu2.add(item5);
		bar.add(menu3);
		menu3.add(item6);
		bar.add(menu4);
		menu4.add(item7);
		menu4.add(item8);
		menu4.add(item9);
		setSize(400,400);
		setVisible(true);
		

		
		

	}
public static void main(String[] args) {
	new Menubar();
}
}

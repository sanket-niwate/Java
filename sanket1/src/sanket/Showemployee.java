package sanket;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Showemployee extends JFrame {

	JTable table;
	public Showemployee() {
		// TODO Auto-generated constructor stub
setLayout(new FlowLayout());

    Object [][] data= {{1,"sanket",12,"mumbai"},{2,"sanket",12,"mumbai"},{3,"sanket",12,"mumbai"},{4,"sanket",12,"mumbai"}};
//String [][] data= {{"1","sanket","12","mumbai"},{"2","sanket","12","mumbai"}};
String	[]coloumnnaame= {"id","name","age","city"};

		
 	DefaultTableModel model=new DefaultTableModel(data,coloumnnaame);
		
 	table =new JTable(model);
 			add(new JScrollPane(table));
 			setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(500,300);
	setVisible(true);
	
	
	}
	
}

package sanket;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Help extends JFrame {
JLabel label;

public Help() {
	// TODO Auto-generated constructor stub
	setLayout(new FlowLayout());
label =new JLabel("help center");
add(label);
setSize(400,400);
setVisible(true);
}

}

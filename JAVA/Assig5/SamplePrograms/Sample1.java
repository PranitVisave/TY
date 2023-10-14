import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Sample1 extends JFrame implements ActionListner{
	JTextField jtf;
	JButton jb;
	public Sample1(){
		setLayout(new FlowLayout());
		jtf = new JTextField(15);
		add(jtf);
		jb = new Jbutton("Click Me");
		jb.addActionListner(this);
		add(jb);
		setSize(200,200);
		setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae){
		jtf.setTxt(ae.getActionCommand());
	}
	public static void main(String args[]){
		new Sample1();
	}
}


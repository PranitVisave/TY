import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class JCdemo extends JFrame implements ItemListener{
	JTextField jtf;
	JCheckBox jcb1,jcb2;
	public JCdemo(){
		setLayout(new FlowLayout());
		jcb1 = new JCheckBox("Swing Demos");
		jcb1.addItemListener(this);
		add(jcb1);
		jcb2 = new JCheckBox("Java Demos");
		jcb2.addItemListener(this);
		add(jcb2);
		jtf = new JTextField(35);
		
		add(jtf);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie){
		String txt = " ";
		if (jcb1.isSelected())
			txt = txt + jcb1.getText() + " ";
		if (jcb2.isSelected())
			txt = txt + jcb2.getText();
		jtf.setText(txt);
	}
	public static void main(String args[]){
		new JCdemo();
	}
}

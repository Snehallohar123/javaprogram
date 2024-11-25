
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class calculator extends JFrame
{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;
	calculator()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		l1=new JLabel("simple calculator");
		l1.setBounds(60,40,500,50);
		l2=new JLabel();
		add(l1);
		t1=new JTextField();
		t2=new JTextField();
		b1=new JButton("add");
		b2=new JButton("sub");

		 t1.setBounds(100,80,200,50);
		t2.setBounds(100,120,200,50);
		b1.setBounds(100,160,100,50);
		b2.setBounds(100,200,100,50);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		 
		l2.setBounds(500,100,150,50);
		add(l2);
		b1.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent ae)
			{
				int no1=Integer.parseInt(t1.getText());
				int no2=Integer.parseInt(t2.getText());
				l2.setText("the addition is:="+(no1+no2));
			}
			});
	}
}
class SimpleCalculator
{
	public static void main(String []args)
	{
		calculator c=new calculator();
		c.setBounds(400,200,400,250);
		c.setVisible(true);
	}
}
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MouseKeyListener extends JFrame
{
	MouseKeyListener()
		{
		super("Mouse Event handling");
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
				setVisible(false);
				System.exit(0);
				}
			});
		}		
}
class Gui
{
		public static void main(String []args)
		{
			MouseKeyListener mf=new MouseKeyListener();
			mf.setBounds(300,200,400,400);
			mf.setVisible(true);
			mf.addMouseListener(new MouseAdapter()
			{
				public void mouseClicked(MouseEvent me)
				{
					Graphics g=mf.getGraphics();
					g.drawString("snehal",me.getX(),me.getY());
				}
			});

			mf.addKeyListener(new KeyAdapter() {
            			public void keyPressed(KeyEvent ke) {
               			 char keyChar = ke.getKeyChar(); // Get the character of the pressed key
               			 int keyCode = ke.getKeyCode();  // Get the keycode
               			 Graphics g = mf.getGraphics();
                		g.drawString("Key Pressed: " + keyChar + " (Code: " + keyCode + ")", 50, 50);
            			}			
       			 });
		}
}
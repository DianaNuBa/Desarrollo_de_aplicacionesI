package Unidad_I;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Border2 
{
	private JFrame f;
	private JButton bn, bs, bw, be, bc;
	
	public Border2() 
	{
		f = new JFrame("Border Layout");
		bn = new JButton("Button 1");
		bc = new JButton("Button 2");
		bw = new JButton("Button 3");
		bs = new JButton("Button 4");
		be = new JButton("Button 5");
		
		
		
	}
	public void launchFrame() 
	{
		f.add(bn, BorderLayout.NORTH);
		f.add(bs, BorderLayout.SOUTH);
		f.add(bw, BorderLayout.WEST);
		f.add(be, BorderLayout.EAST);
		f.add(bc, BorderLayout.CENTER);
		f.setSize(400,200);
		f.setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Border2 guiWindow2 = new Border2();
		guiWindow2.launchFrame();

	}

}

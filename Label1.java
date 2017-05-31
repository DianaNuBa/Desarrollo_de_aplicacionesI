package Unidad_I;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label1 extends JFrame 
{
	private Container contents;
	private JLabel labelText;
	private JLabel labelImage;
	// Constructor
	public Label1() {
	super( "What's for dinner?" );
	contents = getContentPane( );
	// call JFrame constructor
	// get content pane
	setLayout( new FlowLayout( ) ); // set layout manager
	// use the JLabel constructor with a String argument
	labelText = new JLabel( "Sushi tonight?" );
	// set label properties
	labelText.setForeground( java.awt.Color.WHITE );
	labelText.setBackground( java.awt.Color.BLUE );
	labelText.setOpaque( true );
	// use the JLabel constructor with an Imagelcon argument
	labelImage = new JLabel( new ImageIcon( "shushi.jpg" ) );
	// set tool tip text
	labelImage.setToolTipText( "photo of sushi" );
	// add the two labels to the content pane
	contents.add( labelText );
	contents.add( labelImage );
	setSize( 600, 400 );
	setVisible(true);
}
	public static void main( String [ ] args )
	{
	Label1 dinner = new Label1( );
	dinner.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
	}
	

}

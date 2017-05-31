package Unidad_I;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Jeditorpane_html extends JFrame implements ActionListener
{	
	
	private JLabel top_text=new JLabel("Ingresa el Texto normal o  HTML:"), 
				   next_text=new JLabel("Traducion de texto:");
	private JButton btn_seguir=new JButton("Continuar");
	private JTextArea get_texto=new JTextArea();
	private JEditorPane resultado=new JEditorPane();
	
	
	public Jeditorpane_html() 
	{
		super("JEditorPane");
		setVisible(true);
		setSize(560,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		top_text.setBounds(20,10,200,25);
		get_texto.setBounds(20,30,500,200);
		next_text.setBounds(20,240,190,25);
		resultado.setBounds(20,275,500, 200);
		btn_seguir.setBounds(175,500, 150, 25);
		btn_seguir.addActionListener(this);
			
		resultado.setContentType("text/html");
		resultado.setEditable(false);
		
		add(top_text);
		add(get_texto);
		add(next_text);
		add(resultado);
		add(btn_seguir);
	}
	
	public static void main(String[] args) 
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() 
		{
			
			@Override
			public void run() 
			{
				Jeditorpane_html ven=new Jeditorpane_html();	
			}
		}	);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==btn_seguir)
		{
			resultado.setText(get_texto.getText());
			
		}
	}

}

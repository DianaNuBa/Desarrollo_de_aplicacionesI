package Unidad_I;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class raiz extends JFrame implements ActionListener
{
	private JLabel lbl_numero, lbl_resultado;
	private JTextField tf_numero;
	private JButton btn_cuadro, btn_cubo;
	
	public raiz ()
	{
		super( "Raiz cubica y cuadrada");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		lbl_numero=new JLabel("Ingrese el número: ");
		lbl_numero.setBounds(20, 10, 150, 25);
		
		tf_numero=new JTextField();
		tf_numero.setBounds(130, 10, 50,25);
		
		btn_cuadro=new JButton("Cuadrado");
		btn_cuadro.setBounds(20, 50, 100, 30);
		btn_cuadro.addActionListener(this);
		
		btn_cubo=new JButton("Cubo");
		btn_cubo.setBounds(130, 50, 100, 30);
		btn_cubo.addActionListener(this);
		
		lbl_resultado=new JLabel();
		lbl_resultado.setBounds(100, 90, 120, 25);
		
		add(lbl_resultado);
		add(lbl_numero);
		add(tf_numero);
		add(btn_cuadro);
		add(btn_cubo);
	
		
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) 
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				raiz ventana= new raiz();
			}
		});
	}
		

	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		double numero=Double.valueOf(tf_numero.getText());
		if(e.getSource()==btn_cuadro){
			double resultado=Math.pow(numero, 2.0);
			lbl_resultado.setText(String.valueOf(resultado));
		}
		if(e.getSource()==btn_cubo){
			double resultado=Math.pow(numero, 3.0);
			lbl_resultado.setText(String.valueOf(resultado));
	}

	}
}

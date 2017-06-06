package Unidad_I;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Examen2 extends JFrame implements ActionListener{
	private JLabel lbl_sueldo, lbl_antiguedad, lbl_dias, lbl_mensaje, lbl_image;
	private JTextField tf_sueldo, tf_antiguedad, tf_dias;
	private JButton btn_calcular;

public Examen2(){
	super ("Calcular Prima vacacional");
	setSize (300,200);
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setExtendedState(Frame.MAXIMIZED_BOTH);
	
	lbl_sueldo=new JLabel("Ingresa tu sueldo diario:");
	lbl_dias= new JLabel("Ingresa tus dias de vacaciones:");
	lbl_mensaje= new JLabel();
	lbl_image = new JLabel( new ImageIcon( "prima.gif" ) );
	tf_sueldo=new JTextField(5);
	tf_dias=new JTextField(5);
	btn_calcular=new JButton("Calcular");
	btn_calcular.addActionListener(this);
	
	
	add(lbl_sueldo);
	add(tf_sueldo);
	add(lbl_dias);
	add(tf_dias);
	add(btn_calcular);
	add(lbl_mensaje);
	add( lbl_image );
	
	setVisible(true);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				Examen2 ventana=new Examen2();
			}
	});
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn_calcular){
			double sueldo = 0,ppv=0.25;
			int dias = 0;
			sueldo=Double.parseDouble(tf_sueldo.getText());
			dias=Integer.parseInt(tf_dias.getText());
			double resultado = sueldo*dias;
			double resultadof= resultado*ppv;
			lbl_mensaje.setText(String.valueOf((resultadof)));
	}

}
}

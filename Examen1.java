package Unidad_I;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Examen1 extends JFrame implements ActionListener{
	private JLabel lbl_peso,lbl_estatura,lbl_mensaje;
	private JTextField tf_peso,tf_estatura;
	private JButton btn_calcular;
	
public Examen1(){
	super("Calcualr IMC");
	setSize(300,200);
	setLayout(new FlowLayout());
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setExtendedState(Frame.MAXIMIZED_BOTH);
	
	lbl_peso=new JLabel("Ingresa tu peso");
	lbl_estatura=new JLabel("Ingresa tu estatura");
	lbl_mensaje=new JLabel();
	tf_peso=new JTextField(5);
	tf_estatura=new JTextField(5);
	btn_calcular=new JButton("calcular");
	btn_calcular.addActionListener(this);
	
	add(lbl_peso);
	add(tf_peso);
	add(lbl_estatura);
	add(tf_estatura);
	add(btn_calcular);
	add(lbl_mensaje);
	
	
	setVisible(true);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				Examen1 ventana=new Examen1();
			}
			
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==btn_calcular){
			double peso=0.0, estatura=0.0;
			peso=Double.parseDouble(tf_peso.getText());
			estatura=Double.valueOf(tf_estatura.getText());
			double resultado = peso/(Math.pow(estatura, 2));
			if(resultado>=18&& resultado<=25){
				lbl_mensaje.setText("Saludable");
			}
			if(resultado<18){
				lbl_mensaje.setText("Malnutrido");
			}
			if(resultado>25){
				lbl_mensaje.setText("sobrepeso");
			}
			if(resultado>=30 && resultado<=39){
				lbl_mensaje.setText("sobrepeso leve");
			}
			
		}
	}

}

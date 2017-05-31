package Unidad_I;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;




public class VentanaInicio extends JFrame implements ActionListener

{
	private JLabel lbl_usuario, lbl_contra, lbl_mensaje;
	private JTextField tf_usuario;
	private JPasswordField pf_contra;
	private JButton btn_aceptar;
	private Icon imagen=new ImageIcon("images/pregunta.png");
	private Icon im=new ImageIcon("images/correcto.png");
	private Icon ima=new ImageIcon("images/mal.png");

	
	public VentanaInicio(int ancho, int alto)
	{
		super ("Ingresa tus datos");
		setLayout(new FlowLayout());
		setSize(ancho, alto);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lbl_usuario=new JLabel("nombre de usuario");
		lbl_contra=new JLabel("contraseña: ");
		tf_usuario=new JTextField(20);
		pf_contra=new JPasswordField(20);
		lbl_mensaje=new JLabel(imagen);
		btn_aceptar=new JButton("aceptar");
		btn_aceptar.addActionListener(this);
		
		add(lbl_usuario);
		add(tf_usuario);
		add(lbl_contra);
		add(pf_contra);
		add(btn_aceptar);
		add(lbl_mensaje);
		setVisible(true);
		
	}

	public static void main(String[] args) 
	{
		
		VentanaInicio ventana=new VentanaInicio(300,200);  

	}
	

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btn_aceptar)
		{
			String u=tf_usuario.getText();
			String p=String.valueOf(pf_contra.getPassword());
			if(u.equals("abrete") && p.equals("sesamo"))
			{
				lbl_mensaje.setIcon(im);
				
			}
			else 
			{
				lbl_mensaje.setIcon(ima);
			}
			
		}
	}

}
	
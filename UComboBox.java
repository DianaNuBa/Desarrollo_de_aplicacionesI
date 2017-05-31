package Unidad_I;

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UComboBox extends JFrame implements ItemListener{
	private JLabel lbl_selecciona, lbl_imagen;
	private JComboBox jcb_selecciona;

	
public UComboBox(){
	super("Usando JComboBox");
	setSize(400, 300);
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	lbl_selecciona=new JLabel("Selecciona:");
	lbl_imagen=new JLabel();
	
	String[] animalitos={"Bird", "Cat", "Dog", "Pig", "Rabbit"};
	jcb_selecciona=new JComboBox(animalitos);
	jcb_selecciona.addItemListener(this);
	
	add(lbl_selecciona);
	add(jcb_selecciona);
	add(lbl_imagen);
	
	setVisible(true);
	
}
	
	
	public static void main(String[] args){
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				UComboBox ventana=new UComboBox();
		}
		});
	}
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==jcb_selecciona){
		Image image=Toolkit.getDefaultToolkit().getImage(jcb_selecciona.getSelectedItem().toString()+".jpg");
		Icon icono=new ImageIcon(image);
		lbl_imagen.setText(jcb_selecciona.getSelectedItem().toString());
		}
	}
}



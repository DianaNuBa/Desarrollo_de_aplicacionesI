package Unidad_I;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class URadioButton extends JFrame implements ItemListener {
	private JLabel color_color;
	private JRadioButton jrb_rojo, jrb_azul, jrb_verde;
	
	public URadioButton(){
		super("Usando radio button");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		color_color=new JLabel ("Watch my background");
		color_color.setOpaque(true);
	
		jrb_rojo=new JRadioButton("RED", true);
		jrb_azul=new JRadioButton("Blue");
		jrb_verde=new JRadioButton("Green");
		
		jrb_rojo.addItemListener(this);
		jrb_azul.addItemListener(this);
		jrb_verde.addItemListener(this);
		
		ButtonGroup bg=new ButtonGroup();
		add(color_color);
		add(jrb_rojo);
		add(jrb_azul);
		add(jrb_verde);
		
		bg.add(jrb_rojo);
		bg.add(jrb_azul);
		bg.add(jrb_verde);
		setVisible(true);
	}

	public static void main(String[] e) {
		URadioButton ventana=new URadioButton ();
	}
	public void itemStateChanged(ItemEvent e){
		if(e.getSource()==jrb_verde){
			color_color.setBackground(Color.GREEN);
		}
		if(e.getSource()==jrb_rojo){
			color_color.setBackground(Color.RED);
		}
		if(e.getSource()==jrb_azul){
			color_color.setBackground(Color.BLUE);
		}
		}
	}



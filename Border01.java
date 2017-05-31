package Unidad_I;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Border01 extends JFrame  
{
	private JButton boton1, boton2, boton3, boton4,boton5;
	public Border01(){
		super("Ventana que utiliza Border Layaout");
		setLayout(new BorderLayout());
		//Para darle tamaño
		setSize(600, 400);
		//Para cerrar la aplicacion en el boton de cerrar
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		boton1=new JButton("Button1");
		boton2=new JButton("Button2");
		boton3=new JButton("Button3");
		boton4=new JButton("Button4");
		boton5=new JButton("Button5");
		//agregar los botones a la ventana
		add(boton1,BorderLayout.NORTH);
		add(boton2,BorderLayout.CENTER);
		add(boton3,BorderLayout.SOUTH);
		add(boton4,BorderLayout.WEST);
		add(boton5,BorderLayout.EAST);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		Border01 ventana=new Border01();

	}

}

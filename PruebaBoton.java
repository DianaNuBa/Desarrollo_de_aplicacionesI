package Unidad_I;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PruebaBoton extends JFrame  {
	private JButton botonSimple, botonElegante;
	 public PruebaBoton()
	 {
	 super( "Prueba de botones" );
	 Container c = getContentPane();
	 c.setLayout( new FlowLayout() );
	 // crea los botones
	 botonSimple = new JButton( "Boton simple" ); 
	//agregamos el boton al panel de contenido
	c.add( botonSimple );

	//creamos dos objetos ImageIcon que representan al
	//objeto Icon predeterminado y al objeto Icon de
	//sustitucion para el botonElegante.
	//los gif se presupone que estan en el mismo
	//directorio que la aplicación que las utiliza
	Icon icono1 = new ImageIcon( "icono1.gif" );
	Icon icono2 = new ImageIcon( "icono2.gif" );
	//crea el boton con el gif y el texto (texto a la
	//derecha del icono como predeterminado)
	botonElegante = new JButton("Boton elegante",icono1);
	//se utiliza el metodo setRollOverIcon heredado de
	//AbstractButton para especificar la imagen que
	//aparece cuando el raton se posiciona sobre el boton
	 botonElegante.setRolloverIcon( icono2 );
	//agregamos el boton al panel de contenido
	c.add( botonElegante );
	// crea una instancia de la clase interna
	//anejadorBoton para usarla en el manejo de eventos
	//de botón
	ManejadorBoton manejador = new ManejadorBoton();
	botonElegante.addActionListener( manejador );
	botonSimple.addActionListener( manejador );
	setSize( 300, 100 );
	show();
	 } // fin del constructor de PruebaBoton

	 public static void main( String args[] )
	 {
	 PruebaBoton ap = new PruebaBoton();
	ap.addWindowListener(
	 new WindowAdapter() {
	 public void windowClosing( WindowEvent e )
	 {
	 System.exit( 0 );
	 } // fin del método windowClosing
	 } // fin de la clase interna anónima
	 ); // fin de addWindowListener
	 } // fin de main
	// clase interna para el manejo de eventos de botón

	 private class ManejadorBoton implements ActionListener {
	 public void actionPerformed( ActionEvent e )
	 {
	//mostramos un cuadro de dialogo de mensaje que contiene la
	//etiqueta del boton que se pulso
	 JOptionPane.showMessageDialog( null,
	 "Usted oprimio:" + e.getActionCommand() );
	}
	}
	}


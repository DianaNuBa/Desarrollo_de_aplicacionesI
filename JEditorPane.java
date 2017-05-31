package Unidad_I;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.*;


public class JEditorPane extends JApplet {

 JEditorPane editor;

 public JEditorPane(URL url) {
	// TODO Auto-generated constructor stub
}

public void init(){

  try {
   editor=new JEditorPane(new URL("http://roger1345.byethost17.com/javazone/JEditorPane/JavaZone.txt"));
  } catch (MalformedURLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  add(editor);
 }

}
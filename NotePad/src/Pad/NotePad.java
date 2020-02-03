package Pad;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class NotePad extends JFrame implements ActionListener {
	Container c;
	JMenu menu;
	JMenuItem items; 
	JTextArea area;
	
	public NotePad (){
		iniGUI();
	}
	
	public void iniGUI(){
		c = getContentPane();
		area = new JTextArea("", 7,7);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}

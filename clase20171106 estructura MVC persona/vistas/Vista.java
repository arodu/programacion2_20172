package vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controladores.PersonaControlador;

public abstract class Vista extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	PersonaControlador controlador;
	
	public Vista(PersonaControlador controlador) {
		this.controlador = controlador;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

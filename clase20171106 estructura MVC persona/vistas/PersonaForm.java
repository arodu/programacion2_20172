package vistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controladores.PersonaControlador;
import modelos.Persona;

public class PersonaForm extends Vista{
	private static final long serialVersionUID = 1L;
	
	JPanel panel, panelGrid;
	JButton btnAceptar, btnCancelar;
	JLabel lblNombre, lblApellido, lblCedula;
	JTextField txtNombre, txtApellido, txtCedula;
	
	public PersonaForm(PersonaControlador controlador) {
		super(controlador);
	}

	public void display() {
		this.setDefaultCloseOperation(HIDE_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		// -- Botones
		panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		panel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		panel.add(btnCancelar);
		
		this.add(panel, BorderLayout.SOUTH);
		
		// -- Labels
		panelGrid = new JPanel(new GridLayout(3,1));
		
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		lblNombre = new JLabel("Nombre:  ");
		panel.add(lblNombre);
		txtNombre = new JTextField(20);
		panel.add(txtNombre);
		panelGrid.add(panel);
		
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		lblApellido = new JLabel("Apellido: ");
		panel.add(lblApellido);
		txtApellido = new JTextField(20);
		panel.add(txtApellido);
		panelGrid.add(panel);
		
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		lblCedula = new JLabel("Cedula:   ");
		panel.add(lblCedula);
		txtCedula = new JTextField(20);
		panel.add(txtCedula);
		panelGrid.add(panel);
		
		this.add(panelGrid, BorderLayout.CENTER);
		
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(false);
	}

	public void actualizar(Persona persona) {
		txtNombre.setText(persona.getNombre());
		txtApellido.setText(persona.getApellido());
		txtCedula.setText(persona.getCedula());
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(btnCancelar)) {
			this.setVisible(false);
		}
		
		if(arg0.getSource().equals(btnAceptar)) {
			controlador.update(txtNombre.getText(), 
					txtApellido.getText(), 
					txtCedula.getText());
		}
		
	}
	
}


















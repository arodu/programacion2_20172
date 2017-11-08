package vistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controladores.PersonaControlador;
import modelos.Persona;

public class PersonaVista extends Vista{
	private static final long serialVersionUID = 1L;
	
	JPanel panel, panelGrid;
	JButton btnEditar, btnBorrar, btnCancelar;
	JLabel lblNombre, lblApellido, lblCedula;
	JLabel txtNombre, txtApellido, txtCedula;
	
	/**
	 * @param controlador
	 */
	public PersonaVista(PersonaControlador controlador) {
		super(controlador);
	}

	public void display() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		
		// -- Botones
		panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		
		btnEditar = new JButton("Editar");
		btnEditar.addActionListener(this);
		panel.add(btnEditar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		panel.add(btnBorrar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		panel.add(btnCancelar);
		
		this.add(panel, BorderLayout.SOUTH);
		
		// -- Labels
		panelGrid = new JPanel(new GridLayout(3,1));
		
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		lblNombre = new JLabel("Nombre: ");
		panel.add(lblNombre);
		txtNombre = new JLabel("");
		panel.add(txtNombre);
		panelGrid.add(panel);
		
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		lblApellido = new JLabel("Apellido: ");
		panel.add(lblApellido);
		txtApellido = new JLabel("");
		panel.add(txtApellido);
		panelGrid.add(panel);
		
		panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		lblCedula = new JLabel("Cedula: ");
		panel.add(lblCedula);
		txtCedula = new JLabel("");
		panel.add(txtCedula);
		panelGrid.add(panel);
		
		this.add(panelGrid, BorderLayout.CENTER);
		
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public void actualizar(Persona persona) {
		txtNombre.setText(persona.getNombre());
		txtApellido.setText(persona.getApellido());
		txtCedula.setText(persona.getCedula());
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(btnCancelar)) {
			System.exit(0);
		}
		
		if(arg0.getSource().equals(btnEditar)) {
			controlador.edit();
		}
		
		if(arg0.getSource().equals(btnBorrar)) {
			if(JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar los datos?", "Borrar", JOptionPane.YES_NO_OPTION) == 0) {
				controlador.delete();
			}
		}
		
	}
	
}


















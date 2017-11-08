package controladores;

import modelos.Persona;
import vistas.PersonaForm;
import vistas.PersonaVista;

public class PersonaControlador extends Controlador {
	PersonaVista vista;
	PersonaForm form;
	Persona modelo;
	
	public PersonaControlador() {
		vista = new PersonaVista(this);
		form = new PersonaForm(this);
		form.display();
		modelo = new Persona();
	}
	
	public void view() {
		vista.display();
		vista.actualizar(modelo);
	}
	
	public void edit() {
		form.setVisible(true);
		form.actualizar(modelo);
	}
	
	public void update(String nombre, String apellido, String cedula) {
		modelo.setNombre(nombre);
		modelo.setApellido(apellido);
		modelo.setCedula(cedula);
		
		form.setVisible(false);
		vista.actualizar(modelo);		
	}
	
	public void delete() {
		modelo.setNombre("");
		modelo.setApellido("");
		modelo.setCedula("");
		
		vista.actualizar(modelo);
	}
	
	
}






















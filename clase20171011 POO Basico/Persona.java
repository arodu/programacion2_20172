package clase20171011;

import javax.swing.JOptionPane;

public class Persona {
	private String cedula;
	private String nombre;
	private String apellido;
	
	public String getCedula() {
		return cedula;
	}
	
	public void setCedula(int cedula) {
		this.cedula = Integer.toString(cedula);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void ingresarDatos(){
		try {
			setCedula(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cedula")));			
		} catch (NumberFormatException e) {
			System.out.println("Error: ingrese un numero");
		}
		setNombre(JOptionPane.showInputDialog("Ingrese Nombre"));
		setApellido(JOptionPane.showInputDialog("Ingrese Apellido"));
	}
	
	public String mostrar(){
		String out = "";
		out += "Cedula: "+getCedula()+"\n";
		out += "Nombre: "+getNombre()+"\n";
		out += "Apellido: "+getApellido()+"\n";
		return out;
	}
	
}

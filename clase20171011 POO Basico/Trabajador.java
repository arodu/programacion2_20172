package clase20171011;

import javax.swing.JOptionPane;

public class Trabajador extends Persona{
	private int ht;
	private int valorHora;
	
	public int getHt() {
		return ht;
	}
	public void setHt(int ht) {
		this.ht = ht;
	}
	public int getValorHora() {
		return valorHora;
	}
	public void setValorHora(int valorHora) {
		this.valorHora = valorHora;
	}
	public int getSalario(){
		return getHt()*getValorHora();
	}
	
	public String mostrar(){
		String out = "";
		out += super.mostrar();
		out += "H. Trabajadas: "+getHt()+"\n";
		out += "Valor Hora: "+getValorHora()+"\n";
		out += "Salario: "+getSalario()+"\n";
		return out;
	}
	
	public void ingresarDatos(){
		super.ingresarDatos();
		setHt(Integer.parseInt(JOptionPane.showInputDialog("Horas Trabajadas")));
		setValorHora(Integer.parseInt(JOptionPane.showInputDialog("Valor Hora")));
	}
	
}

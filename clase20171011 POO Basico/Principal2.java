package clase20171011;

import javax.swing.JOptionPane;

public class Principal2 {

	public static void main(String[] args) {
		
		int c = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de Trabajadores"));
		
		Trabajador t[] = new Trabajador[c];
		
		for(int i=0; i<c; i++){
			t[i] = new Trabajador();
			t[i].ingresarDatos();
		}
		
		String aux = "";
		for(int i=0; i<c; i++){
			aux += t[i].mostrar();
			aux += "--------------\n";
		}
		
		JOptionPane.showMessageDialog(null, aux);

		
		
	}

}

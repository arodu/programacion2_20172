package clase20171011;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Trabajador uno = new Trabajador();
		uno.ingresarDatos();
		JOptionPane.showMessageDialog(null, uno.mostrar());
	}

}

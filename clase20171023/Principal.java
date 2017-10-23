package clase20171023;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		JFrame ventana = new JFrame();
		
		ventana.setSize(400, 400);
		
		
		ventana.setTitle("Titulo de la Ventana");
		ventana.setResizable(false);
		
		//ventana.setLocation(300, 300);
		ventana.setLocationRelativeTo(null);
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel panel = new JPanel(new BorderLayout());
		ventana.add(panel);
		
		JPanel panelSur = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel.add(panelSur, BorderLayout.SOUTH);
		
		JPanel panelCentral = new JPanel();
		panel.add(panelCentral, BorderLayout.CENTER);
		
		JButton btnUno = new JButton("Aceptar");
		panelSur.add(btnUno);
		
		JButton btnDos = new JButton("Cancelar");
		panelSur.add(btnDos);
		
		JLabel lblNombre = new JLabel("Nombre");
		panelCentral.add(lblNombre);
		
		JTextField txtNombre = new JTextField(20);
		panelCentral.add(txtNombre);
	
		if(JOptionPane.showConfirmDialog(null, "Abrir ventana?") == 0){
			ventana.setVisible(true);
		}		
		
		//JOptionPane.showMessageDialog(ventana, "Hola Mundo");
	}

}

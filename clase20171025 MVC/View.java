package clase20171025;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class View extends JFrame implements ActionListener {
	JPanel panel, panelSur;
	JButton[] boton;
	JLabel turno, j1,j2;
	Controller controlador;
	
	// Constructor
	// recibir el controlador padre
	public View(Controller controlador) {
		this.controlador = controlador;
	}
	
	// logica de la vista
	public void display() {
		this.setSize(300, 350);
		this.setTitle("La Vieja");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setLayout(new BorderLayout());
		
		panel = new JPanel(new GridLayout(3,3));
		
		boton = new JButton[9];
		for(int i=0; i<9; i++){
			//boton[i] = new JButton(Integer.toString(i));
			boton[i] = new JButton();
			boton[i].addActionListener(this);
			panel.add(boton[i]);
		}
		
		this.add(panel, BorderLayout.CENTER);
		
		panelSur = new JPanel(new GridLayout(3,1));
		
		turno = new JLabel("Turno ");
		this.add(turno, BorderLayout.NORTH);
		
		j1 = new JLabel("Jugador 1: 0");
		panelSur.add(j1);
		
		j2 = new JLabel("Jugador 2: 0");
		panelSur.add(j2);
		
		this.add(panelSur, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	
	// mensajes en la vista
	public void mensaje(String msg){
		JOptionPane.showMessageDialog(this, msg);
	}
	
	// confirmacion de salida del sistema
	public boolean reiniciar(String msg){
		if( JOptionPane.showConfirmDialog(this, msg + "\n¿Desea volver a jugar?", null, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
			return true;
		}
		return false;
	}
	
	// actualizar label de cambio de turno
	public void cambiarTurno(int turno){
		this.turno.setText("Turno Jugador "+turno);
	}
	
	// actualizar label a los puntajes de los jugadores
	public void mostrarPuntos(int j1, int j2) {
		this.j1.setText("Jugador 1: "+Integer.toString(j1));
		this.j2.setText("Jugador 2: "+Integer.toString(j2));
	}
	
	// muestro la jugada en la posicion
	public void jugada(int pos, int turno) {
		boton[pos].setText(simbolo(turno));
	}
	
	// cambio el numero de turno por el simbolo
	private String simbolo(int turno) {
		if(turno == 1){
			return "X";
		}else{
			return "O";
		}
	}
	
	// accion de los botones
	public void actionPerformed(ActionEvent arg0) {
		for(int i=0; i<9; i++){
			if(arg0.getSource().equals(boton[i])){
				//JOptionPane.showMessageDialog(this, "Presionaste boton "+i);
				controlador.jugada(i);
			}
		}
	}

}














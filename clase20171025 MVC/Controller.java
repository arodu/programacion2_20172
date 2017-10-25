package clase20171025;

public class Controller {
	Model modelo;
	View vista;
	
	// Constructor
	// inicializa en modelo
	// iniciliza la vista y la muestra
	public Controller() {
		modelo = new Model();
		vista = new View(this);
		vista.display();
		vista.cambiarTurno(modelo.getTurno());
	}
	
	// Logica del juego
	public void jugada(int pos) {
		boolean fin = false;
		if(modelo.jugada(pos)){
			vista.jugada(pos, modelo.getTurno());
			if(modelo.ganador()){
				if(vista.reiniciar("Ganador Jugador "+modelo.getTurno())){
					modelo.setPuntos(modelo.getTurno());
					fin = true;					
				}else{
					System.exit(0); // Salir del sistema
				}
			}else{
				if(modelo.lleno()){
					vista.mensaje("No hay ganador");
					fin = true;
				}				
			}
			if(fin){
				this.reiniciar();
			}else{
				modelo.cambiarTurno();
				vista.cambiarTurno(modelo.getTurno());
			}
		}else{
			vista.mensaje("Jugada Invalida!");
		}

	}
	
	// reiniciar tablero, y ventana
	private void reiniciar() {
		vista.setVisible(false);
		modelo.init();
		vista = new View(this);
		vista.display();
		vista.mostrarPuntos(modelo.getPuntos(1), modelo.getPuntos(2));
	}
	
	public static void main(String[] args) {
		new Controller();
	}
}

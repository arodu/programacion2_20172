package clase20171025;

public class Model {
	int[] tablero;
	int turno, j1=0, j2=0;
	
	// Constructor
	// iniciliza el tablero
	// inicializa el turno
	public Model() {
		tablero = new int[9];
		init();
		turno = 1;
	}
	
	// inicializacion del tablero
	public void init() {
		for(int i=0; i<9; i++){
			tablero[i] = 0;
		}
	}
	
	// verificia si es una jugada valida
	// y si es valida, la marca
	public boolean jugada(int pos) {
		if(tablero[pos] == 0){
			tablero[pos] = turno;
			return true;
		}
		return false;
	}
	
	// obtener el turno actual
	public int getTurno() {
		return turno;
	}
	
	// cambia el turno actual
	public void cambiarTurno(){
		if(turno == 1){
			turno = 2;
		}else{
			turno = 1;
		}
	}
	
	// verificacion si el tablero esta lleno
	public boolean lleno() {
		for(int i=0; i<9; i++){
			if(tablero[i] == 0){
				return false;
			}
		}
		return true;
	}
	
	// obtencion de puntos
	public int getPuntos(int jugador) {
		if(jugador == 1){
			return j1;
		}else{
			return j2;
		}
	}
	
	// guardado de puntos
	public void setPuntos(int jugador) {
		if(jugador == 1){
			j1 = j1 + 1;
		}else{
			j2 = j2 + 1;
		}
	}
	
	// verificacion si existe ganador
	public boolean ganador() {
		if(tablero[0] == tablero[1] && tablero[1] == tablero[2] && tablero[1]!=0){
			return true;
		}
		if(tablero[3] == tablero[4] && tablero[4] == tablero[5] && tablero[4]!=0){
			return true;
		}
		if(tablero[6] == tablero[7] && tablero[7] == tablero[8] && tablero[7]!=0){
			return true;
		}
		
		if(tablero[0] == tablero[3] && tablero[3] == tablero[6] && tablero[3]!=0){
			return true;
		}
		if(tablero[1] == tablero[4] && tablero[4] == tablero[7] && tablero[4]!=0){
			return true;
		}
		if(tablero[2] == tablero[5] && tablero[5] == tablero[8] && tablero[5]!=0){
			return true;
		}
		
		if(tablero[0] == tablero[4] && tablero[4] == tablero[8] && tablero[4]!=0){
			return true;
		}
		if(tablero[2] == tablero[4] && tablero[4] == tablero[6] && tablero[4]!=0){
			return true;
		}
		return false;
	}

}







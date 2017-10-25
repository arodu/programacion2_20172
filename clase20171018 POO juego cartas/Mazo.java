package clase20171018;

import java.util.Random;

public class Mazo {
	Carta[] mazo = new Carta[40];
	int tope = 0;
	
	public Mazo() {
		int t = 0;
		int x = 0;
		for(int i=1; i<=12; i++){
			if( !(i==8 || i==9) ){
				mazo[t] = new Carta(i,"B",x);
				t = t + 1;
				x++;
			}
		}
		x = 0;
		for(int i=1; i<=12; i++){
			if( !(i==8 || i==9) ){
				mazo[t] = new Carta(i,"E",x);
				t = t + 1;
				x++;
			}
		}
		x = 0;
		for(int i=1; i<=12; i++){
			if( !(i==8 || i==9) ){
				mazo[t] = new Carta(i,"C",x);
				t = t + 1;
				x++;
			}
		}
		x = 0;
		for(int i=1; i<=12; i++){
			if( !(i==8 || i==9) ){
				mazo[t] = new Carta(i,"O",x);
				t = t + 1;
				x++;
			}
		}
	}
	
	public void barajar() {
		Random r = new Random();
		Carta aux = new Carta();
		for(int i=0; i<mazo.length; i++){
			int a = r.nextInt(this.mazo.length);
			aux = mazo[i];
			mazo[i] = mazo[a];
			mazo[a] = aux;
		}
	}
	
	public Carta repartir() {
		Carta aux = mazo[tope];
		tope = tope + 1;
		return aux;
	}
	
	public void mostrar() {
		for(int i=0; i<mazo.length; i++){
			mazo[i].mostrar();
		}
	}
	
	
}

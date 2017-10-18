package clase20171018;

public class Mano {
	Carta[] mano = new Carta[3];
	int cant = 0;
	
	public void recibir(Carta carta) {
		mano[cant] = carta;
		cant = cant + 1;
	}
	
	public void mostrar() {
		for(int i=0; i<mano.length; i++){
			mano[i].mostrar();
		}
	}
	
	public boolean canto() {
		if(mano[0].num == mano[1].num && mano[1].num == mano[2].num){
			System.out.println("Marico!");
			return true;
		}
		this.ordenar();
		if(mano[0].num == 1 && mano[1].num == 11 && mano[2].num == 12){
			System.out.println("Registro");
			return true;
		}
		
		if(mano[0].num == mano[1].num && mano[1].x == mano[2].x-1){
			System.out.println("Vigia");
			return true;
		}
				
		if(mano[0].num == mano[1].num && mano[1].x == mano[2].x+1){
			System.out.println("Vigia");
			return true;
		}
		
		if(mano[2].num == mano[1].num && mano[1].x == mano[0].x-1){
			System.out.println("Vigia");
			return true;
		}
				
		if(mano[2].num == mano[1].num && mano[1].x == mano[0].x+1){
			System.out.println("Vigia");
			return true;
		}
		
		if(mano[0].num == mano[1].num || mano[1].num == mano[2].num){
			System.out.println("Ronda");
			return true;
		}
		
		if(mano[0].x == mano[1].x-1 && mano[1].x == mano[2].x-1){
			System.out.println("Patrulla");
			return true;
		}
		
		
		return false;
	}
	
	
	public void ordenar() {
		Carta aux = new Carta();
		for(int i=0; i<mano.length; i++){
			for(int j=0; j<mano.length-1; j++){
				if(mano[i].num < mano[j].num){
					aux = mano[i];
					mano[i] = mano[j];
					mano[j] = aux;
				}
			}
		}
	}
	

}

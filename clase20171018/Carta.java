package clase20171018;

public class Carta {
	int num;
	String pinta;
	int x;
	
	public Carta(int num, String pinta, int x) {
		this.num = num;
		this.pinta = pinta;
		this.x = x;
	}
	
	public Carta() {
	}
	
	
	public void mostrar() {
		System.out.println("+---+");
		if( num <= 9 ){
			System.out.println("| "+num+" |");			
		}else{
			System.out.println("| "+num+"|");
		}
		System.out.println("| "+pinta+" |");
		System.out.println("+---+");
	}
	
}

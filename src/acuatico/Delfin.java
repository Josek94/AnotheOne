package acuatico;

public class Delfin extends Pez {
	//propiedades
	
	private boolean simpantico;
	
	
	
	//contructores
	public Delfin(boolean tieneEscamas, int peso, String nombre, String tipo) {
		super(tieneEscamas, peso, nombre, tipo);
		this.simpantico = true;
	}

	//metodos

	@Override
	public String toString() {
		return String.format("%s%n"
				+ "",super.toString());
	}
	
	
	
	
	
	
}

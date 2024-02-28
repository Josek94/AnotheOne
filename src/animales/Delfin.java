package animales;

public class Delfin extends Animal implements Nadador{

	private int frecuenciaMaxSonido;
	
	public Delfin(int peso, int frecuenciaMaxSonido) {
		super(peso);
		this.frecuenciaMaxSonido = frecuenciaMaxSonido;
	}


	public String  toString() {
		return String.format("%sFrecuencia de sonido: %d%n"
				+ "Tipo: Delfin",super.toString(),frecuenciaMaxSonido);
	}


	@Override
	public void nadar() {
		System.out.println("soy un Delfin y estoy nadando");
		
	}



}

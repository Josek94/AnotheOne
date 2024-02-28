package animales;

public class Tiburon extends Animal implements Nadador{
	
	private int numeroDeBranquias;
	
	
	public Tiburon(int peso, int numeroDeBranquias) {
		super(peso);
		this.numeroDeBranquias = numeroDeBranquias;
	}


	public String  toString() {
		return String.format("%sNumero de Branquias: %d%n"
				+ "Tipo: Tiburon",super.toString(),numeroDeBranquias);
	}


	@Override
	public void nadar() {
		
		System.out.println("soy un Tiburon y estoy nadando");
	}
 
 
 
 
}

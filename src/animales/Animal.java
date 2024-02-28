package animales;
public abstract class  Animal {
	private int peso;
	

	public Animal(int peso) {
		this.peso = peso;
		
		
	}
	
	
	//metodos
	@Override
	public String toString() {
		
		
		return String.format("-------ANIMAL-------%n"
				+ "peso: %d%n",peso);
		
	}

	
	//getters
	/*public int getPeso() {
		return peso;
	}

	public String getTipo() {
		return tipo;
	}*/
	
	
	
	
	
	
	
}

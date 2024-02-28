package acuatico;

public abstract class Pez {

	//propiedades
	
	private boolean tieneEscamas;
	private int peso;
	private String nombre;
	private static int nextID = 1;
	private int id;
	private String tipo;
	private String[] listaDeTipos = {"Agnatos", "Condrictios", "Osteictios"};
	private String especie;
	
	//constructores
	
	public Pez(boolean tieneEscamas, int peso, String nombre, String tipo) {
		
		this.tieneEscamas = tieneEscamas;
		this.peso = peso;
		this.nombre = nombre;
		this.id = nextID;
		this.tipo = anadirTipo(tipo);
		this.especie = getClass().getSimpleName();
	}
	
	
	//metodos
	public String anadirTipo(String nombreDelTipo) {
		for(String recorrer : listaDeTipos) {
			if(recorrer == nombreDelTipo) {
				return nombreDelTipo;
			} else if(this instanceof Delfin) {
				return nombreDelTipo = "Mamifero";
			}
		}
		return null;
	}
	
	public String anadirEspecie(String nombreDeLaEspecie) {
		if(nombreDeLaEspecie.equals(getClass().getSimpleName())) {
		return nombreDeLaEspecie;
		} else {
		return null;
		}
	}
	
	@Override
	public String toString() {
		return String.format("-----ACUATICOS-----%n"
				+ "Tipo: %s%n"
				+ "Especie: %s%n"
				+ "Nombre: %s%n"
				+ "ID: %d%n"
				+ "Peso: %d%n"
				+ "¿Tiene Escamas? %s%n",tipo,especie,nombre,id,peso,
				tieneEscamas? "Si" : "No");
	}
}

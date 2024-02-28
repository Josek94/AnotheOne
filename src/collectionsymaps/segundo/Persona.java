package collectionsymaps.segundo;

import java.util.HashSet;
import java.util.Set;

public class Persona implements Comparable<Persona> {
	public static void main(String[] args) {

		Persona[] personas = {new Persona("Juan",1970),
				new Persona("Pedro",2002),
				new Persona("Antonio",1999),
				new Persona("Pedro",1970),
				new Persona("Maria",2002),
				new Persona("Luz", 2013),
				new Persona("Rocio",1993),
				new Persona("Maria", 1882),
				new Persona("Rosa",2005),
				new Persona("Juan",1982),};
		
		Set<Persona> listaPersonas = new HashSet<>();
		
		for(Persona introducir : personas) {
			listaPersonas.add(introducir);
		}
		System.out.println("HashSet");
		System.out.println("=======");
		for(Persona recorrer : listaPersonas ) {
			System.out.println(recorrer);
		}
		
}
	
	//campos
	private String nombre;
	private int nacimiento;
	
	
	//constructor
	
	public Persona(String nombre, int nacimiento) {
		this.nombre = nombre;
		this.nacimiento = nacimiento;
	}


	@Override
	public String toString() {
		return "Persona {nombre=" + nombre + ", año=" + nacimiento + "}";
	}


	@Override
	public int compareTo(Persona o) {
		
		return nacimiento - o.nacimiento;
	}
	
	

}

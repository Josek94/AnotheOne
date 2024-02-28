package interfacesfuncionales;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;



public class TestInterfaces {
	/*
	 * Método para realizar una transformación mediante una función lambda
	 * a una lista de cualquier tipo
	 */
	
	public static <T> void transformarLista(List<T> lista, Function<T, T> transformacion) {
		for(T elemento : lista) {
			System.out.println(elemento);
		}
		
		for(int i = 0; i < lista.size(); i++) {
			lista.set(i, transformacion.apply(lista.get(i)));
		}
		System.out.println("-------------------------");
		for(T elemento : lista) {
			System.out.println(elemento);
		}
	}
	
	/*
	 * Método para generar una nueva lista a partir de otra aplicando una 
	 * transformación expresada como lambda
	 */
	
	public static <T> List<T> generarLista(List<T> lista, Function<T, T> transformacion) {
		List<T> nuevaLista = new ArrayList<>();		
		
	
		for(int i = 0; i < lista.size(); i++) {
			nuevaLista.add(transformacion.apply(lista.get(i)));
		}
		
		return nuevaLista;
	}
	
	/*
	 * Método para devolver una lista filtrada 
	 * 
	 */	
	
	public static <T> void listafiltrada(List<T> lista, Predicate<T> filtro){
		for(T elemento : lista) {
			if(filtro.test(elemento)) 
			System.out.println(elemento);
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(1);
		listaNumeros.add(6);
		listaNumeros.add(4);
		listaNumeros.add(7);
		listaNumeros.add(9);
		listaNumeros.add(12);
		transformarLista(listaNumeros, s -> s * 2);
		List<String> listaString = new ArrayList<>();
		listaString.add("uno");
		listaString.add("dos");
		listaString.add("tres");
		listaString.add("cuatro");
		transformarLista(listaString, s -> s.toUpperCase());
		List<String>listaMinuscula = generarLista(listaString, s -> s.toLowerCase());
		System.out.println(listaMinuscula);
		System.out.println(listaString);
		listafiltrada(listaString, s->s.startsWith("D"));
		
	}
}

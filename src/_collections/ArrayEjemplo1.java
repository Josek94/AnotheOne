package _collections;

import java.util.ArrayList;

public class ArrayEjemplo1 {

	public static void main(String[] args) {
		
		ArrayList<String> listaColores = new ArrayList<>();
		
		listaColores.add("rojo");
		listaColores.add("amarillo");
		listaColores.add("verde");
		listaColores.add("rojo");
		listaColores.add("amarillo");
		listaColores.add("azul");
		listaColores.add("naranja");
		listaColores.add("marrón");
		listaColores.add("verde");
		System.out.printf("for%n"
				+ "---%n");
		for(int i = 0; i < listaColores.size();i++) {
			System.out.printf("%s ",listaColores.get(i));
		}
		System.out.println();
		System.out.println();
		System.out.printf("for-each%n"
				+ "--------%n");
		for(String color : listaColores) {
			System.out.printf("%s ", color);
		}
		System.out.println();
		
		
		String encontrarRojo = "rojo";
		int contadorDeExcepciones = 0;
		for(int i = 0; i < listaColores.size(); i++) {
			if(listaColores.get(i) == null ? encontrarRojo == null : listaColores.get(i).equals(encontrarRojo)) {
				if(contadorDeExcepciones == 1) {
					listaColores.remove(i);
				}
				contadorDeExcepciones++;
				
			}
		}
		System.out.println();
		System.out.printf("ArrayList despues de borrar segundo rojo%n"
				+ "----------------------------------------%n");
		
		
		for(String color : listaColores) {
			System.out.printf("%s ", color);
		}
		System.out.println();
		
		String encontrarAmarillo = "amarillo";
		
		for(int i = 0; i < listaColores.size(); i++) {
			if(listaColores.get(i) == null ? encontrarAmarillo == null : listaColores.get(i).equals(encontrarAmarillo)) {
				listaColores.remove(i);
				
			}
		}
		
		System.out.println();
		System.out.printf("ArrayList despues de borrar todos los amarillos%n"
				+ "----------------------------------------------%n");
		for(String color : listaColores) {
			System.out.printf("%s ", color);
		}
	}
	
	
}

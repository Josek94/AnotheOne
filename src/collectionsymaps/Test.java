package collectionsymaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		
		String cuento = CuentaCuentos.cuentoZorro();
		String cuento2 = CuentaCuentos.cuentoLechera();
		String[] arrayPalabras = devuelvePalabras(cuento);
		
		for(String recorrer : arrayPalabras) {
				System.out.println(recorrer);
		}
		
		arrayPalabras(cuento);
		arrayListPalabras(cuento);
		hashSetPalabras(cuento);
		hashSetPalabras(cuento2);
		treeSetPalabras(cuento2);
		mapConteoPalabras(cuento2);
		mapConteoOrdenado(cuento2);
	}
	
	//metodos
	
	public static String[] devuelvePalabras(String texto) {
		texto = texto.toLowerCase().replace(".", "").replace(",", "").replace("\n", "");
		return texto.split(" ");
	}
	
	
	public static void arrayPalabras(String texto) {
		String[] palabras = devuelvePalabras(texto);
		System.out.println("Array de palabras");
		System.out.println("=================");
		for(String palabra : palabras) {
			System.out.print("["+ palabra + "]");
	}
		System.out.println();
		System.out.printf("Lista original tiene %d palabras.%n",palabras.length);
		
			
	}
	
	public static void arrayListPalabras(String texto) {
		String[] palabras = devuelvePalabras(texto);
		ArrayList<String> arrayListPalabras = new ArrayList<>();
		for(String recorrer : palabras) {
			arrayListPalabras.add(recorrer);
		}
		System.out.println("ArrayList de palabras");
		System.out.println("=====================");
		for(String palabra : arrayListPalabras) {
			System.out.print("[" + palabra + "]");
		}
		System.out.println();
		System.out.printf("Lista en ArrayList tiene %d palabras.%n",arrayListPalabras.size());
	}
	
	public static void hashSetPalabras(String texto) {
		String[] palabras = devuelvePalabras(texto);
		Set<String> hashSetPalabras = new HashSet<>();
		for(String recorrer : palabras) {
			hashSetPalabras.add(recorrer);
		}
		System.out.println("HashSet de palabras");
		System.out.println("=====================");
		for(String palabra : hashSetPalabras) {
			System.out.print("[" + palabra + "]");
		}
		System.out.println();
		System.out.printf("Lista en ArrayList tiene %d palabras.%n",hashSetPalabras.size());
	}
	
	public static void treeSetPalabras (String texto) {
		String[] palabras = devuelvePalabras(texto);
		Set<String> treeSetPalabras = new TreeSet<>();
		for(String recorrer : palabras) {
			treeSetPalabras.add(recorrer);
		}
		System.out.println("HashSet de palabras");
		System.out.println("=====================");
		for(String palabra : treeSetPalabras) {
			System.out.print("[" + palabra + "]");
		}
		System.out.println();
		System.out.printf("Lista en ArrayList tiene %d palabras.%n",treeSetPalabras.size());
	}
	
	public static void mapConteoPalabras(String texto) {
		String[] palabras = devuelvePalabras(texto);
		Map<String,Integer> conteoPalabras = new HashMap<>();
		System.out.println("Conteo de repeticiones de palabras");
		System.out.println("==================================");
		
		for(String recorrer : palabras) {
			if(conteoPalabras.get(recorrer) == null) {
				conteoPalabras.put(recorrer, 1);
			} else {
				conteoPalabras.put(recorrer, conteoPalabras.get(recorrer)+1);
			}
		}
		
		
		for(String palabra : conteoPalabras.keySet()) {
			System.out.printf("[%s(%d)]%n",palabra,conteoPalabras.get(palabra));
		}
	}
	
	
	public static void mapConteoOrdenado(String texto) {
		String[] palabras = devuelvePalabras(texto);
		Map<String,Integer> conteoOrdenado = new TreeMap<>();
		System.out.println("Conteo ordenado de repeticiones de palabras");
		System.out.println("===========================================");
		
		for(String recorrer : palabras) {
			if(conteoOrdenado.get(recorrer) == null) {
				conteoOrdenado.put(recorrer, 1);
			} else {
				conteoOrdenado.put(recorrer, conteoOrdenado.get(recorrer)+1);
			}
		}
		
		for(String palabra : conteoOrdenado.keySet()) {
			System.out.printf("[%s(%d)]%n",palabra,conteoOrdenado.get(palabra));
		}
	}
	
	
}

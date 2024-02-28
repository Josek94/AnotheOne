package genericos;

import java.util.ArrayList;
import java.util.Random;

public class TeoriaArrayList {
	
	public static void GenerarNumerosRandom(int cantidad, int desde, int hasta) {
		Random random = new Random();
		ArrayList<Integer> numeros = new ArrayList<>();
		for(int i = 0; i < cantidad;i++) {
			numeros.add(random.nextInt(desde,hasta)+1);
		}
		
	}
	
	
	public static void main(String[] args) {
		/*
		ArrayList<String> al1 = new ArrayList<>();
		
		al1.add("uno");
		al1.add("dos");
		al1.add(2, "tres");
		System.out.println(al1);
		System.out.println(al1.get(2));
		System.out.println(al1.indexOf("tres"));
		al1.remove(2);
		System.out.println(al1);
		System.out.println(al1.isEmpty());
		al1.clear();
		System.out.println(al1.isEmpty());
		*/
		/*
		ArrayList<String> libros1 = new ArrayList<>();
		libros1.add("Cien años de soledad");
		libros1.add("1984");
		libros1.add("El Alquimista");
		libros1.add("El Principito");
		libros1.add("El retrato de Dorian Grey");
		
		for(String recorrer : libros1) {
			System.out.println(recorrer);
		}
		*/
		
		
		/*
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		
		
		for(int recorrer = 0;recorrer < 20; recorrer++) {
			numeros.add(random.nextInt(100)+1);
		}
		
		System.out.println("Lista original:"+ numeros);
		
		System.out.println("Tamaño de la lista: " + numeros.size());
		int suma = 0;
		int maximo = 0;
		int minimo = 100;
		
		for(int numero : numeros) {
			if(numero > maximo) maximo = numero;
			if(numero < minimo) minimo = numero;
			suma += numero;
		}
		
		System.out.println("Numero maximo: " + maximo);
		System.out.println("Numero minimo: " + minimo);
		*/
		/*1- crear arraylist vacio
		 *2- llenarlo de 1_000_000 de aletorio del 1 al 10
		 *3- sumar los valores del arraylist y mostrar
		 *4- calcular la media y mostrar
		 *5- limpiar el arraylist
		 *6- crea un metodo que haga todas los calculos directamente, cantidad, desde y hasta*/
		ArrayList<Integer> numeros = new ArrayList<>();
		
		
		Random random = new Random();
		int sumar = 0;
		
		
		for(int i = 0; i < 1_000_000;i++) {
			numeros.add(random.nextInt(10)+1);
		}
		
		System.out.println("la cantidad de numeros dentro del array es " + numeros.size());
		
		for(int numero : numeros) {
			sumar += numero;
		}
		
		System.out.println("La suma de los numeros de la lista es " + sumar + " y su media es " + (double)sumar/numeros.size());
		
		numeros.clear();
		System.out.println("la cantidad de numeros dentro del array es " + numeros.size());
		
		
		
		
	}

	
}

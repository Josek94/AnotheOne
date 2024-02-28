package interfacesfuncionales.jugandoconarray;


import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JugandoConArrays {

	private static Integer[] transformar(Integer[] arrayInteger, Function<Integer, Integer> funcion) {
		Integer[] nuevoArray = new Integer[arrayInteger.length];
		for(int i = 0; i < arrayInteger.length;i++) {
			nuevoArray[i] = funcion.apply(arrayInteger[i]);
			
		}
		
		
		return nuevoArray;
	}
	
	private static void procesar(Integer[] arrayInteger, Consumer<Integer> consume) {
			for(Integer recorrer : arrayInteger) {
				consume.accept(recorrer);
			}
	}
	
	private static Integer[] filtrar(Integer[] arrayInteger, Predicate<Integer> filtro) {
		Integer[] nuevoArray = new Integer[arrayInteger.length];
		for(int i = 0; i < arrayInteger.length; i++) {
			if(filtro.test(arrayInteger[i])) {
				nuevoArray[i] = arrayInteger[i];
			} else {
				nuevoArray[i] = 0;
			}
		}
		
		
		return nuevoArray;
	}


	private static Integer[] generar(Supplier<Integer> provee, int n) {
		Integer[] arrayGenerado = new Integer[n];
		for(int i = 0; i < arrayGenerado.length; i++) {
			arrayGenerado[i] = provee.get();
		}
		return arrayGenerado;
	}


	private static Integer[] combinar(Integer[] arrayInteger1,Integer[] arrayInteger2, BiFunction<Integer, Integer, Integer> funcionCombinar) {
		Integer[] nuevoArray = new Integer[arrayInteger1.length];
		for(int i = 0; i < nuevoArray.length;i++) {
			nuevoArray[i] = funcionCombinar.apply(arrayInteger1[i], arrayInteger2[i]);
		}
		
		return nuevoArray;
	}

	private static void procesarElementos(Integer[] arrayInteger1,Integer[] arrayInteger2, BiConsumer<Integer, Integer> consumeDoble) {
		
		for(int i = 0; i < arrayInteger1.length; i++) {
			if(!(i > arrayInteger1.length || i > arrayInteger2.length))
			consumeDoble.accept(arrayInteger1[i], arrayInteger2[i]);
		}
		
	}
	
	private static Integer[] tranformarParesImpares(Integer[] arrayInteger, Function<Integer, Integer> funcionPar, Function<Integer, Integer> funcionImpar) {
		Integer[] nuevoArray = new Integer[arrayInteger.length];
		
		for(int i = 0; i < arrayInteger.length; i++) {
			if(arrayInteger[i] % 2 == 0) {
				nuevoArray[i] = funcionPar.apply(arrayInteger[i]);
			} else {
				nuevoArray[i] = funcionImpar.apply(arrayInteger[i]);
			}
		}
		
		
		return nuevoArray;
	}



	public static void main(String[] args) {
		
		Random random = new Random();
		Integer[] listaDeNumeros = {1, 2, 3, 4, 5};
		Integer[] listaMultiplicadaPor2 = transformar(listaDeNumeros, s->s * 2);
		Integer[] listaDeNumerosFiltrada = filtrar(listaDeNumeros, s -> s % 2 == 0);
		Integer[] listaGeneradaSegunFiltro = generar(() -> random.nextInt(10), 6);
		Integer[] listaCombinada = combinar(listaMultiplicadaPor2, listaDeNumeros, (s1, s2) -> s1+s2);
		Integer[] listaParImpar = tranformarParesImpares(listaDeNumeros, s -> s * 2, s -> s * 3);
		procesar(listaDeNumeros, s -> System.out.println(s));
		System.out.println("---------------");
		procesar(listaDeNumerosFiltrada, s -> System.out.println(s));
		System.out.println("---------------");
		procesar(listaGeneradaSegunFiltro, s -> System.out.println(s));
		System.out.println("---------------");
		procesar(listaCombinada, s -> System.out.println(s));
		System.out.println("----------------");
		//procesarElementos(listaGeneradaSegunFiltro, listaDeNumeros, (s1 , s2) -> System.out.println(s1 +" y "+ s2));
		procesar(listaParImpar, s -> System.out.println(s));
	}
}

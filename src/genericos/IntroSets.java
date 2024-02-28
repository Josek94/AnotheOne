package genericos;

import java.util.HashSet;
import java.util.Random;

public class IntroSets {

	public static void main(String[] args) {

		HashSet<Integer> setEnteros = new HashSet<>();
		Random random = new Random();
		
		for(int i = 0; i < 100_000; i++) {
			setEnteros.add(random.nextInt(10)+1);
		}
		
		System.out.println(setEnteros);
		
	}
}

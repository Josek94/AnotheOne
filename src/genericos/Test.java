package genericos;

public class Test {
	public static void main(String[] args) {
	
	Contenedor<String> csg1 = new Contenedor<String>("hola");
	ContenedorString cs1 = new ContenedorString("hola mundo");
	ContenedorInteger ci1 = new ContenedorInteger(12);
	Contenedor<Integer> cig1 = new Contenedor<Integer>(3);
	ContenedorDeCosa cc1 = new ContenedorDeCosa(new Cosa());
	Pareja<Integer, Integer> p1 = new Pareja<Integer, Integer>(2, 4);
	Pareja<String, Integer> p2 = new Pareja<String, Integer>("hola", 4);	
	Pareja<String, Integer> p3 = new Pareja<>("hola", 4);
	}
}

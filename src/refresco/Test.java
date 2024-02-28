package refresco;

public class Test {
	public static void main(String[] args) {

		CajeDe3TiposDeObjetos<String,Double, Integer> c1 = new CajeDe3TiposDeObjetos<>("hola",1.2,1);
		
		CajeDe3TiposDeObjetos<String, Double,CajeDe3TiposDeObjetos<String, String,String>> c2 = new CajeDe3TiposDeObjetos<>("hola",1.2,new CajeDe3TiposDeObjetos<String, String, String>("hola1", "hola2", "hola3"));
		
		
		
		System.out.println(c1);
		System.out.println(c1.getR());
		c1.setR("adios");
		c1.setS(2.);
		c1.setT(3);
		System.out.println(c1);
		
		System.out.println(c2.getT());
	}
}

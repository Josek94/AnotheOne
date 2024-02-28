package animales;

public class Test {
public static void main(String[] args) {
	
	
	
	
	Animal[] grupoDeAnimales = {
			new Tiburon(20,5), 
			new Delfin(15,200),
			new Tiburon(20,5), 
			new Delfin(15,200),
			new Tiburon(20,5), 
			new Delfin(15,200),};
	
	Nadador[] grupoDeNadadores = {
			new Tiburon(0, 0),
			new Delfin(0, 0),
			new Tiburon(0, 0),
			new Delfin(0, 0),
	};
	
	
	for(Animal Recorrer : grupoDeAnimales) {
		System.out.println(Recorrer);
		
	}
	
	for(Nadador recorrer : grupoDeNadadores) {
		System.out.println(recorrer);
		recorrer.nadar();
	}
	
	
	
	
}
}

package colecciones;

public class Parrafo {
/*crear clase parrafo, propiedad array de string palabras, constructor que rellene el String con palabras*/
	private String[] palabras;
	
	
public Parrafo(String texto) {
	this.palabras = texto.split(" ");
}
	




	@Override
public String toString() {
		String frase = "";
		for(int i = 0; i< palabras.length; i++) {
			if(i == 0) {
				frase += Parrafo.capitalizar(palabras[i]);
			} else {
				frase = frase + " " + palabras[i];
			}
			
		}
	return frase;
}
	
	public static String capitalizar(String texto) {
		if (texto == null || texto.isEmpty()) {
			return texto;
		}
		return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
	}



	public void setPalabras(String texto) {
		this.palabras = texto.split(" ");
	}

	

	public static void main(String[] args) {
		
		Parrafo p1 = new Parrafo("esto es una prueba");
		System.out.println(p1);
		
		
	}
	
}

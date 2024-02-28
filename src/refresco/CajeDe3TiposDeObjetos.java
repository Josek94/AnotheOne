package refresco;

public class CajeDe3TiposDeObjetos<R,S,T> {

	//propiedades
	
	private R r;
	private S s;
	private T t;
	
	
	
	public CajeDe3TiposDeObjetos(R r, S s, T t) {
		this.r = r;
		this.s = s;
		this.t = t;
	}
	
	public CajeDe3TiposDeObjetos() {
		
	}
	
	@Override
	public String toString() {
		return "CajeDe3TiposDeObjetos [r=" + r + ", s=" + s + ", t=" + t + "]";
	}
	
	
	

	public R getR() {
		return r;
	}
	public void setR(R r) {
		this.r = r;
	}
	public S getS() {
		return s;
	}
	public void setS(S s) {
		this.s = s;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	
	
	
	
	
	
	
	
}

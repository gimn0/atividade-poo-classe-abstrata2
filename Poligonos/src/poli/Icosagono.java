package poli;

public class Icosagono extends Poligonos {
	
	protected Icosagono() {
		this.setLados(20);
	}
	
	@Override
	public String imprimeLados() {
		return "Um Icos�gono tem " + getLados() + " Lados.";
	}
}

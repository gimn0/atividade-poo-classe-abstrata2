package poli;

public class Decagono extends Poligonos {
	
	protected Decagono() {
		this.setLados(10);
	}
	
	@Override
	public String imprimeLados() {
		return "Um Dec�gono tem " + this.getLados() + " Lados.";
	}
}

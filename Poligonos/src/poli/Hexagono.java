package poli;

public class Hexagono extends Poligonos {

	protected Hexagono() {
		this.setLados(6);
	}
	
	@Override
	public String imprimeLados() {
		return "Um Hex�gono tem " + this.getLados() + " Lados.";
	}
}

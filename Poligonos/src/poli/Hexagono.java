package poli;

public class Hexagono extends Poligonos {

	protected Hexagono() {
		this.setLados(6);
	}
	
	@Override
	public String imprimeLados() {
		return "Um Hexágono tem " + this.getLados() + " Lados.";
	}
}

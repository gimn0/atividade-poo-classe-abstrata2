package poli;

public class Octogono extends Poligonos {
	
	protected Octogono() {
		this.setLados(8);
	}
	
	@Override
	public String imprimeLados() {
		return "Um Oct�gono tem " + this.getLados() + " Lados.";
	}
}

package poli;

public class Quadrado extends Poligonos {
	
	protected Quadrado() {
		this.setLados(4);
	}
	
	@Override
	public String imprimeLados() {
		return "Um Quadrilátero tem " + this.getLados() + " Lados.";
	}
}

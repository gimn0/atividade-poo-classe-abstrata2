package poli;

public class Quadrado extends Poligonos {
	
	protected Quadrado() {
		this.setLados(4);
	}
	
	@Override
	public String imprimeLados() {
		return "Um Quadril�tero tem " + this.getLados() + " Lados.";
	}
}

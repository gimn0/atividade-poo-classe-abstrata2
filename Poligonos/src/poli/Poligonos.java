package poli;

public abstract class Poligonos {
	private int lados;
	
	protected int setLados(int lados) {
		return this.lados = lados;
	}
	
	protected int getLados() {
		return this.lados;
	}
	
	public abstract String imprimeLados();
	
}

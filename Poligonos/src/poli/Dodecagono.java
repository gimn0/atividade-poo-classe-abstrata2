package poli;

public class Dodecagono extends Poligonos {
	
	protected Dodecagono() {
		this.setLados(12);
	}
	
	@Override
	public String imprimeLados() {
		return "Um Dodec�gono tem " + getLados() + " Lados.";
	}
}

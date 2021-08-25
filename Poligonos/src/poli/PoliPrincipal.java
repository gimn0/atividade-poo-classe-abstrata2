package poli;

public class PoliPrincipal {

	public static void main(String[] args) {
		
		Quadrado q = new Quadrado();
		System.out.println(q.imprimeLados());
		
		Hexagono h = new Hexagono();
		System.out.println(h.imprimeLados());
		
		Octogono o = new Octogono();
		System.out.println(o.imprimeLados());
		
		Decagono dc = new Decagono();
		System.out.println(dc.imprimeLados());
		
		Dodecagono dd = new Dodecagono();
		System.out.println(dd.imprimeLados());
		
		Icosagono i = new Icosagono();
		System.out.println(i.imprimeLados());
		
}

}

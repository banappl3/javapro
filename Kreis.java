
// Datei Kreis . java
public class Kreis implements Geometrie {
	
	private double radius ;
	
	// 	Konstruktor
	public Kreis ( double radius ) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	// Methoden der Schnittstelle Geometrie
	@Override
	public double berechneUmfang () {
		return 2 * radius * Math.PI ;
	}
	@Override
	public double berechneFlaeche () {
		return radius * radius * Math . PI ;
	}
}
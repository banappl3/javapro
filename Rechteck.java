
public class Rechteck implements Geometrie{
	// Klassenvariabl en
	public double laenge , breite ;
	
	// Konstruktor mit zwei Parametern
	public Rechteck ( double laenge , double breite ) {
		if ( laenge <=0 || breite <=0) {
			throw new IllegalArgumentException (
		"Länge und Breite müssen größer 0 sein ! " ) ;
		}
		
		this . laenge = laenge ;
		this . breite = breite ;
		
	}
	// Default - Konstruktor ohne Parameter
	public Rechteck () {
		this (10 , 5) ;
	}
	
	public double getLaenge() {
		return laenge;
	}
	
	public double getBreite() {
		return breite;
	}
	
	// Methoden
	@Override
	public double berechneUmfang () {
		return ( laenge + breite ) *2;
	}
	@Override
	public double berechneFlaeche () {
		return laenge * breite;
	}
}

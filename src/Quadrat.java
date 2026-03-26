public class Quadrat extends Rechteck {
    public final String CLASS_NAME = "Quadrat";

    public Quadrat() {
        super(1, 1);
    }

    public Quadrat(int seitenlaenge){
        super(seitenlaenge, seitenlaenge);
    }

    public Quadrat(int seitenLaenge, Position position, Farbe farbe){
        super(seitenLaenge, seitenLaenge, position, farbe);
    }

    public String toString() {
        //String s = CLASS_NAME + " { Seitenlänge = " + this.getLaenge() + ", Breite = " + this.breite + ", " +

        String s = CLASS_NAME + " { Seitenlänge = " + this.laenge + ", " +
        "Umfang = " + this.berechneUmfang() + ", " +
        "Fläche = " + this.berechneFlaeche() + ", " +
        this.position + ", Farbe: " + this.farbe + " }";
        return s;
    }
}




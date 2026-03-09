public class Rechteck {
    private int laenge;
    public int breite;
    public Position position;
    private Farbe farbe = Farbe.rot;
    public static final String CLASS_NAME = "Rechteck";
    public static String Bezeichnung = "unbekannt";

    public Rechteck(int laenge, int breite, int x, int y, Farbe farbe) {
        this.setLaenge(laenge);
        this.breite = breite;
        //this.position = new Position();
        //position.setX(x);
        //position.setY(y);
        this.position = new Position(x, y);
        this.farbe = farbe;
    }

    public Rechteck(Rechteck rechteck) {
        this.setLaenge(rechteck.getLaenge());
        this.breite = rechteck.breite;
        //this.position = rechteck.position;
        this.position = new Position(rechteck.position);
    }

    public Rechteck(int laenge, int breite) {
        this.setLaenge(laenge);
        this.breite = breite;
        this.position = new Position();
    }

    public Rechteck(int seitenlaenge) {
        //this.setLaenge(seitenlaenge);
        //this.breite = seitenlaenge;
        this(seitenlaenge, seitenlaenge);
    }

    public Rechteck() {
        this.setLaenge(1);
        this.breite = 1;
        this.position = new Position();
        //this.farbe = Farbe.rot;
    }

    public int getLaenge() {
        return this.laenge;
    }

    public void setLaenge(int laenge) {
        if (laenge <= 0)
            this.laenge = 0;
        else
            this.laenge = laenge;
    }

    public Farbe getFarbe(){
        return this.farbe;
    }

    public void setFarbe(Farbe farbe){
        this.farbe = farbe;
    }

    public int berechneFlaeche() {
        return this.laenge * this.breite;
    }

    public int berechneUmfang() {
        return (this.laenge + this.breite) * 2;
    }

    public void scale(int scaleLaenge, int scaleBreite) {
        this.setLaenge(this.getLaenge() * scaleLaenge);
        this.breite = this.breite * scaleBreite;
    }

    public void scale(int scaleFaktor) {
        this.setLaenge(this.getLaenge() * scaleFaktor);
        this.breite = this.breite * scaleFaktor;
    }

    public static void printClassName(){
        System.out.println("Rechteck");
    }

    public String toString() {
        String s = "Rechteck { Länge = " + this.laenge + ", Breite = " + this.breite + ", " +
                "Umfang = " + this.berechneUmfang() + ", " +
                "Fläche = " + this.berechneFlaeche() + ", " +
                this.position + ", Farbe: " + this.farbe + "}";
        return s;
    }
}




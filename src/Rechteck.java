public class Rechteck {
    private int laenge;
    public int breite;
    public Position position;

    public Rechteck(int laenge, int breite, int x, int y){
        this.setLaenge(laenge);
        this.breite = breite;
        //this.position = new Position();
        //position.setX(x);
        //position.setY(y);
        this.position = new Position(x,y);
    }
    public Rechteck(Rechteck rechteck){
        this.setLaenge(rechteck.getLaenge());
        this.breite = rechteck.breite;
    }
    public Rechteck(int laenge, int breite){
        this.setLaenge(laenge);
        this.breite = breite;
    }
    public Rechteck(int seitenlaenge){
        //this.setLaenge(seitenlaenge);
        //this.breite = seitenlaenge;
        this(seitenlaenge, seitenlaenge);
    }
    public Rechteck(){
        this.setLaenge(1);
        this.breite = 1;
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

    public int berechneFlaeche() {
        return this.laenge * this.breite;
    }

    public int berechneUmfang() {
        return (this.laenge + this.breite) * 2;
    }

    public String toString() {
        String s = "Rechteck { Länge = " + this.laenge + ", Breite = " + this.breite + ", " +
        "Umfang = " + this.berechneUmfang() + ", " +
        "Fläche = " + this.berechneFlaeche() + ", " +
        this.position + " } ";
        return s;
    }
}




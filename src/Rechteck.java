public class Rechteck {
    private int laenge;
    public int breite;

    public int getLaenge() {
        return this.laenge;
    }

    public void setLaenge(int laenge) {
        if (laenge <= 0)
            this.laenge = 0;
        else
            this.laenge = laenge;
    }

    public int getFlaeche() {
        return this.laenge * this.breite;
    }

    public int getUmfang() {
        return (this.laenge + this.breite) * 2;
    }

    public String toString() {
        String s = "Rechteck { Länge = " + this.laenge + ", Breite = " + this.breite + ", ";
        s = s + "Umfang = " + this.getUmfang() + ", ";
        s = s + "Fläche = " + this.getFlaeche() + " }";
        return s;
    }
}




public class Kreis {
    private int radius = 1;

    public Kreis(Kreis kreis){
        this.setRadius(kreis.radius);
    }
    public Kreis(int radius){
        this.setRadius(radius);
    }
    public Kreis(){
        this.setRadius(3);
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        if (radius < 0)
            this.radius = 0;
        else
            this.radius = radius;
    }

    public double berechneFlaeche() {
        return Math.PI * (this.radius * this.radius);
    }

    public double berechneUmfang() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        String s = "Kreis { Radius = " + this.radius + ", ";
        s = s + "Umfang = " + this.berechneUmfang() + ", ";
        s = s + "Fläche = " + this.berechneFlaeche() + " }";
        return s;
    }
}




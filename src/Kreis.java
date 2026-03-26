public class Kreis extends Form{
    private int radius = 1;
    //private Position position;
    //private Farbe farbe = Farbe.rot;
    public static final String CLASS_NAME = "Kreis";

    public Kreis(int radius, Position position, Farbe farbe){
        this(radius, position.getX(), position.getY(), farbe);
    }

    public Kreis(Kreis kreis) {
        this.setRadius(kreis.radius);
        this.position = new Position(kreis.position);
    }

    public Kreis(int radius) {
        this.setRadius(radius);
        this.position = new Position();
    }

    public Kreis(int radius, int x, int y, Farbe farbe) {
        this.radius = radius;
        this.position = new Position(x, y);
        this.farbe = farbe;
    }

    public Kreis() {
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
    /*
    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Farbe getFarbe() {
        return this.farbe;
    }

    public void setFarbe(Farbe farbe) {
        this.farbe = farbe;
    }
    */
    public double berechneFlaeche() {
        return Math.PI * (this.radius * this.radius);
    }

    public double berechneUmfang() {
        return 2 * Math.PI * this.radius;
    }

    public void display(){
        System.out.println(this);
    }

    public void scale(int scaleFaktor){
        this.radius = this.radius * scaleFaktor;
    }

    public static void printClassName(){
        System.out.println(CLASS_NAME);
    }
    public String toString() {
        String s = CLASS_NAME + " { Radius = " + this.radius + ", " +
                "Umfang = " + String.format("%.2f", this.berechneUmfang())  + ", " +
                "Fläche = " + String.format("%.2f", this.berechneFlaeche()) +
                ", " + this.position + ", Farbe: " + this.farbe + " }";
        return s;
    }
}
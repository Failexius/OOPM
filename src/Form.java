public abstract class Form {
    protected Position position;
    protected Farbe farbe;
    public static final String CLASS_NAME = "Form";

    public Form(){
        this.position = new Position();
        this.farbe = Farbe.rot;
    }
    public Form(Position position){
        this.position = new Position(position);
        this.farbe = Farbe.rot;
    }
    public Form(Farbe farbe){
        this.position = new Position();
        this.farbe = farbe;
    }
    public Form(Farbe farbe, Position position){
        this.position = new Position(position);
        this.farbe = farbe;
    }
    public Form(Form form){
        this.position = new Position(form.getPosition());
        this.farbe = form.getFarbe();
    }
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
    /*
    public double berechneFlaeche(){
        return 0;
    }
    */
    public abstract double berechneFlaeche();
    /*
    public double berechneUmfang(){
        return 0;
    }
    */
    public abstract double berechneUmfang();

    public String toString(){
        String s = CLASS_NAME + " { " +
                this.position + ", " +
                "Farbe: " + this.farbe + " } ";
        return s;
    }
}




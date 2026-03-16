public class LV04_20260316_1 {
    static void main(String[] args) {
        Position myPosition = new Position(1,1);
        Rechteck myRechteck = new Rechteck(6,4,myPosition, Farbe.gruen);
        Kreis myKreis = new Kreis(4,myPosition,Farbe.gruen);

        System.out.println(myRechteck);
        System.out.println(myKreis);

        System.out.println("Quadrant myRechteck: " + myRechteck.getPosition().getQuadrant());
        myKreis.getPosition().setY(-2);
        System.out.println("Quadrant myKreis: " + myKreis.getPosition().getQuadrant());

        myKreis.display();
        myRechteck.display();
    }
}
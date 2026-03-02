public class LV02_20260302_1 {
    static void main() {
        Kreis klKreis = new Kreis();
        Kreis myKreis = new Kreis(5);
        Kreis grKreis = new Kreis();

        klKreis.setRadius(2);

        System.out.print("klKreis: " + klKreis);
        System.out.print("grKreis: " + grKreis);
        System.out.print("myKreis: " + myKreis);

        Rechteck klRechteck = new Rechteck(6, 4);
        Rechteck myRechteck = new Rechteck(7);

        System.out.println("klRechteck: " + klRechteck);
        System.out.println("myRechteck: " + myRechteck);
    }
}




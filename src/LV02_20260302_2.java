public class LV02_20260302_2 {
    public static void main(String[] args) {
        Kreis klKreis = new Kreis(5);
        Kreis grKreis = new Kreis(8);
        System.out.println("1. klKreis: " + klKreis);
        System.out.println("1. grKreis: " + grKreis);
        klKreis = grKreis;
        System.out.println("2. klKreis: " + klKreis);
        System.out.println("2. grKreis: " + grKreis);
        grKreis.setRadius(9);
        System.out.println("3. klKreis: " + klKreis);
        System.out.println("3. grKreis: " + grKreis);

        Kreis myKreis = new Kreis(grKreis);
        System.out.println("4. grKreis: " + grKreis);
        System.out.println("4. myKreis: " + myKreis);

        myKreis.setRadius(11);
        System.out.println("5. grKreis: " + grKreis);
        System.out.println("5. myKreis: " + myKreis);

        Rechteck klRechteck = new Rechteck(6, 4);
        Rechteck myRechteck = new Rechteck(klRechteck);

        klRechteck.setLaenge(8);
        klRechteck.breite = 5;
        System.out.println("6. klRechteck: " + klRechteck);
        System.out.println("6. myRechteck: " + myRechteck);

    }
}




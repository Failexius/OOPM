public class LV05_20260326_2 {
    static void main(String[] args) {
        Form[] myFormen = new Form[6];

        Quadrat myQuadrat = new Quadrat();
        Rechteck myRechteck = new Rechteck();
        Kreis myKreis = new Kreis();

        modifyForm(myQuadrat);
        modifyForm(myRechteck);
        modifyForm(myKreis);

        System.out.println();
        System.out.println(myQuadrat);
        System.out.println(myRechteck);
        System.out.println(myKreis);
    }

    public static void modifyForm(Form form) {
        System.out.println("Modify Form: " + form);
        if (form instanceof Rechteck) {
            ((Rechteck) form).setLaenge(((Rechteck) form).getLaenge() - 1);
            ((Rechteck) form).breite = ((Rechteck) form).breite - 1;
        } else if (form instanceof Quadrat) {
            ((Quadrat) form).laenge = ((Rechteck) form).laenge - 1;
            ((Quadrat) form).breite = ((Rechteck) form).breite - 1;
        } else if (form instanceof Kreis) {
            ((Kreis) form).setRadius(((Kreis) form).getRadius() - 1);
        } else {

        }
    }
}




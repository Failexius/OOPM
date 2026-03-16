public class LV04_20260316_3 {
    static void main(String[] args) {
        Kreis myKreis = new Kreis(2, new Position(-1, -1), Farbe.gruen);
        Rechteck myRechteck = new Rechteck(6, 4, new Position(-1, 1), Farbe.gelb);
        Form[] myFormen = new Form[4];

        System.out.println(myKreis);
        System.out.println(myRechteck);
        System.out.println();

        myFormen[0] = new Kreis(1, -1, -1, Farbe.gruen);
        myFormen[1] = new Rechteck(7, 3, 1, -1, Farbe.blau);
        myFormen[2] = new Kreis();
        myFormen[2].setFarbe(Farbe.blau);
        myFormen[3] = new Rechteck(8, 4);

        for (int i = 0; i < myFormen.length; i++) {
            System.out.println(myFormen[i]);
        }
        System.out.println();
        for (int i = 0; i < myFormen.length; i++) {
            System.out.println(myFormen[i].getFarbe());
        }
        System.out.println();

        double gesamtFlaeche = 0;
        double gesamtUmfang = 0;

        for (int i = 0; i < myFormen.length; i++) {
            gesamtFlaeche += myFormen[i].berechneFlaeche();
            gesamtUmfang += myFormen[i].berechneUmfang();
        }
        System.out.printf("Gesamtfläche: %.2f", gesamtFlaeche);
        System.out.println();
        System.out.printf("Gesamtumfang: %.2f",  gesamtUmfang);
    }
}
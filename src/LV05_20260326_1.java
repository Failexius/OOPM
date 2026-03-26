public class LV05_20260326_1 {
    static void main(String[] args) {
        Form[] myFormen = new Form[6];

        myFormen[0] = new Quadrat();
        myFormen[1] = new Rechteck(7, 3, 1, -1, Farbe.blau);
        myFormen[2] = new Kreis();
        myFormen[2].setFarbe(Farbe.blau);
        myFormen[3] = new Rechteck(8, 4);
        //am 26.03.2026 als abstrakt definiert
        //myFormen[4] = new Form();
        myFormen[5] = new Quadrat(4, new Position(-1,4), Farbe.blau);

        for (int i = 0; i < myFormen.length; i++) {
            System.out.println(i + ": " + myFormen[i]);
        }
    }
}




public class LV03_20260309_4 {
    static void main(String[] args) {
        Kreis myKreis = new Kreis(9, 2, 1, Farbe.gelb);
        Kreis klKreis = new Kreis(1);
        Kreis grKreis = new Kreis(klKreis);
        grKreis.setRadius(grKreis.getRadius() * 4);

        System.out.println(myKreis);
        System.out.println(klKreis);
        System.out.println(grKreis);
    }
}




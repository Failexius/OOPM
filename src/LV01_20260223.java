public class LV01_20260223 {
    public static void main() {
        System.out.println("*** Rechteck Demo ***");

        Rechteck kleinesRechteck = new Rechteck();
        Rechteck grossesRechteck = new Rechteck();
        //kleinesRechteck.laenge = 6;
        kleinesRechteck.setLaenge(6);
        kleinesRechteck.breite = 4;

        //grossesRechteck.laenge = 14;
        grossesRechteck.setLaenge(14);
        grossesRechteck.breite = 9;

      leinesRechteck.getLaenge(), kleinesRechteck.breite, (kleinesRechteck.breite + kleinesRechteck.getLaenge()) * 2, kleinesRechteck.getLaenge() * kleinesRechteck.breite);

        System.out.println();
        System.out.println(kleinesRechteck);
        System.out.println(grossesRechteck);

    }
}




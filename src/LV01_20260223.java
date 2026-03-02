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

        System.out.printf("kleinesRechteck(l=%d, b=%d, u=%d, f=%d)\n",kleinesRechteck.getLaenge(), kleinesRechteck.breite, (kleinesRechteck.breite + kleinesRechteck.berechneFlaeche()) * 2,kleinesRechteck.getLaenge() * kleinesRechteck.breite);
        System.out.printf("grossesRechteck(l=%d, b=%d, u=%d, f=%d)\n", grossesRechteck.getLaenge(), grossesRechteck.breite, (grossesRechteck.getLaenge() + grossesRechteck.breite) * 2, grossesRechteck.getLaenge() * grossesRechteck.breite);

        System.out.printf("kleinesRechteck(l=%d, b=%d, u=%d, f=%d)\n",kleinesRechteck.getLaenge(), kleinesRechteck.breite, kleinesRechteck.berechneUmfang(),kleinesRechteck.berechneFlaeche());
        System.out.printf("grossesRechteck(l=%d, b=%d, u=%d, f=%d)\n", grossesRechteck.getLaenge(), grossesRechteck.breite, grossesRechteck.berechneUmfang(), grossesRechteck.berechneFlaeche());

        //kleinesRechteck.laenge = 5;
        kleinesRechteck.setLaenge(5);
        System.out.printf("kleinesRechteck(l=%d, b=%d, u=%d, f=%d)\n",kleinesRechteck.getLaenge(), kleinesRechteck.breite, (kleinesRechteck.breite + kleinesRechteck.getLaenge()) * 2,kleinesRechteck.getLaenge() * kleinesRechteck.breite);
        //kleinesRechteck.laenge = -5;
        kleinesRechteck.setLaenge(-5);
        System.out.printf("kleinesRechteck(l=%d, b=%d, u=%d, f=%d)\n",kleinesRechteck.getLaenge(), kleinesRechteck.breite, (kleinesRechteck.breite + kleinesRechteck.getLaenge()) * 2, kleinesRechteck.getLaenge() * kleinesRechteck.breite);

        System.out.println();
        System.out.println(kleinesRechteck);
        System.out.println(grossesRechteck);

    }
}




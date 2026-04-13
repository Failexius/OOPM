public class LV06_20260413_1 {
    static void main(String[] args) {
        /*Position myPosition = new Position();

        System.out.println(myPosition);
        myPosition.scan();
        System.out.println(myPosition);*/
        Position[] myPositions = {new Position(4, 6), new Position(), new Position(-1, -1)};
        Rechteck[] myRechtecke = {new Rechteck(),
                new Rechteck(2, 4, myPositions[1], Farbe.gruen),
                new Rechteck(5, 6, 1, 2, Farbe.blau)};

        for (int i = 0; i < myPositions.length; i++) {
            System.out.println(myPositions[i]);
        }
        scanPositions(myPositions);
        for (int i = 0; i < myPositions.length; i++) {
            System.out.println(myPositions[i]);
        }
        for (int i = 0; i < myRechtecke.length; i++) {
            System.out.println(myRechtecke[i]);
        }
        scanRechtecke(myRechtecke);
        for (int i = 0; i < myRechtecke.length; i++) {
            System.out.println(myRechtecke[i]);
        }
    }

    public static void scanPositions(Position[] positions) {
        for (Position pos : positions) {
            pos.scan();
        }
        /*for (int i = 0; i < positions.length; i++) {
            positions[i].scan();
        }*/
    }

    public static void scanRechtecke(Rechteck[] rechtecke) {
        for (Rechteck rechteck : rechtecke)
            rechteck.scan();
    }
}
public class LV03_20260309_2 {
    public static void main(String[] args) {
        Rechteck[] myRechtecke = new Rechteck[4];

        myRechtecke[0] = new Rechteck();
        myRechtecke[1] = new Rechteck(6,5, 2, 4, Farbe.blau);
        myRechtecke[2] = new Rechteck(9,6);
        myRechtecke[3] = new Rechteck(myRechtecke[1]);
        myRechtecke[3].scale(2);

        System.out.println("Ausgabe Rechteck-Array");
        for (int i = 0; i < myRechtecke.length; i++)
            System.out.println(myRechtecke[i]);

        myRechtecke[3].getPosition().setX(8);
        myRechtecke[3].getPosition().setY(9);
        myRechtecke[3].setFarbe(Farbe.gelb);

        System.out.println("Ausgabe Rechteck-Array");
        for (int i = 0; i < myRechtecke.length; i++)
            System.out.println(myRechtecke[i]);
    }
}




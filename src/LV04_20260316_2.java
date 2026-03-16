public class LV04_20260316_2 {
    static void main(String[] args) {
        Position myPosition = new Position(1,1);
        Form[] myFormen = new Form[4];

        myFormen[0] = new Form();
        myFormen[1] = new Form(Farbe.blau);
        myFormen[2] = new Form(Farbe.gelb, myPosition);
        myFormen[3] = new Form(myFormen[1]);

        myPosition.setX(-1);
        myFormen[3].setFarbe(Farbe.gruen);
        myFormen[3].setPosition(myPosition);

        for (int i = 0; i<myFormen.length; i++){
            System.out.println(myFormen[i]);
        }
    }
}
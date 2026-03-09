public class LV03_20260309_3 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(Rechteck.CLASS_NAME);
        System.out.println(Rechteck.Bezeichnung);
        Rechteck.printClassName();

        Rechteck.Bezeichnung = "RECHTECK";
        System.out.println(Rechteck.Bezeichnung);
        //Rechteck.CLASS_NAME = "neuer Klassenname";
    }
}
package CodeReview_1;

public class test {
    static void main(String[] args) {
        Buch myBuch = new Buch();
        System.out.println(myBuch);

        //CodeReview_1.Medien medien = new CodeReview_1.Medien();
        Buch buch = new Buch();

        Medien[] myMedien = new Medien[3];
        myMedien[0] = myBuch;
        myMedien[1] = new Buch();
        myMedien[2] = new Stream();

        for (int i = 0; i < myMedien.length; i++) {
            System.out.println(myMedien[i]);
        }
    }
}

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LV09_20260504_3 {
    static void main(String[] args) {
        List<Form> myFormList = new LinkedList<Form>();

        myFormList.add(new Kreis(9));
        myFormList.add(new Rechteck(4,3));
        myFormList.add(new Quadrat(8));
        myFormList.add(new Rechteck(9,6));
        myFormList.add(new Kreis(5));
        myFormList.add(new Kreis(12));

        System.out.println("Print unsorted myFormList");
        for (Iterator<Form> iterator = myFormList.iterator(); iterator.hasNext(); ) {
            Form tmpForm = iterator.next();
            System.out.println(tmpForm);
        }
        myFormList.sort(new FormComparatorFlaeche());
        System.out.println("Print sorted by Fläche myFormList");
        for (Iterator<Form> iterator = myFormList.iterator(); iterator.hasNext(); ) {
            Form tmpForm = iterator.next();
            System.out.println(tmpForm);
        }
        myFormList.sort(new FormComparatorUmfang());
        System.out.println("Print sorted by Umfang myFormList");
        for (Iterator<Form> iterator = myFormList.iterator(); iterator.hasNext(); ) {
            Form tmpForm = iterator.next();
            System.out.println(tmpForm);
        }
    }
}

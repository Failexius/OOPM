import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LV10_20260511_4 {
    static void main(String[] args) {
        List<Form> myFormList = new LinkedList<Form>();

        myFormList.add(new Kreis(9));
        myFormList.add(new Rechteck(4, 3));
        myFormList.add(new Quadrat(8));
        myFormList.add(new Rechteck(9, 6));
        myFormList.add(new Kreis(5));
        myFormList.add(new Kreis(12));

        myFormList.sort(new FormComparatorFlaeche());
        System.out.println("myFormList sorted by Fläche");

        System.out.println("Start Export...");
        try {
            BufferedWriter myBW = new BufferedWriter(new FileWriter("src/ExportFormen.txt"));
            myBW.write("Inhalt myFormList sorted by Fläche");
            myBW.newLine();
            for (Iterator<Form> iterator = myFormList.iterator(); iterator.hasNext(); ) {
                Form tmpForm = iterator.next();
                System.out.println(tmpForm);
                myBW.write(tmpForm.toString());
                myBW.write(";");
                myBW.newLine();
            }
            myBW.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Ende Export");
    }
}

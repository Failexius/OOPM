import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LV10_20260511_3 {
    static void main(String[] args) {
        System.out.println("*** Demo BufferedWriter ***");
        try {
            BufferedWriter myBW = new BufferedWriter(new FileWriter("src/export.txt"));
                    myBW.write("Demo BufferedWriter");
                    myBW.newLine();
                    myBW.write("*** File Ende ***");
                    myBW.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("*** Programm Ende ***");
    }
}

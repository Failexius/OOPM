import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LV10_20260511_5 {
    static void main(String[] args) {
        List<String> importiereZeilen = new ArrayList<>();

        System.out.println("Start Import...");
        try {
            BufferedReader myBR = new BufferedReader(new FileReader("src/ExportFormen.csv"));
            String header = myBR.readLine();

            String zeile;
            while ((zeile = myBR.readLine()) != null) {
                String[] teile = zeile.split(";");

                if (teile.length > 0) {
                    String formDaten = teile[0];
                    System.out.println("Gelesen: " + formDaten);
                    importiereZeilen.add(formDaten);
                }
            }
            myBR.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Import abgeschlossen. Anzahl Zeilen: " + importiereZeilen.size());
    }
}

package Uebung_FinalCodeReview;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main programm = new Main();
        Warehouse lager = new Warehouse("Zentrallager", 7);

        try {
            lager.searchForSKU(404); // Provozierte Exception
        } catch (ProductNotFoundException e) {
            System.err.println("[FEHLER] " + e.getMessage());
        }

        List<Product> produkte = List.of(
            new Product("Fernseher", 101, 599),
            new Product("Smartphone", 102, 499),
            new Product("Kopfhoerer", 103, 79)
        );
        programm.exportToCSV("produkte.csv", produkte);
    }

    public void exportToCSV(String filepath, List<Product> produkte) {
        try (FileWriter fw = new FileWriter(filepath)) {
            fw.write("Name,SKU,Preis\n");
            for (Product p : produkte) {
                fw.write(p.getName() + "," + p.getSku() + "," + p.getPreis() + "\n");
            }
            System.out.println("CSV erfolgreich exportiert!");
        } catch (IOException e) {
            System.err.println("Schreibfehler: " + e.getMessage());
        }
    }
}

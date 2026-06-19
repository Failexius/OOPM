package Uebung_FinalCodeReview;

import java.util.HashMap;
import java.util.List;

public class Warehouse {
    public List<Warehouse> Warehouses;
    public HashMap<String,Product> Products;

    public List<String> getTeureProdukteSortiert(List<Product> produktListe, int minPreis) {
        return produktListe.stream()
                .filter(p -> p.getPreis() > minPreis)
                .map(Product::getName)
                .sorted()
                .toList();
    }

    public Warehouse(String name,int sku) {}

    public void searchForSKU(int sku) throws ProductNotFoundException {
        boolean found = false;

        if (sku == 999) {
            System.out.println("Produkt gefunden!");
        } else {
            throw new ProductNotFoundException("Die SKU " + sku + " existiert nicht im System.");
        }
    }
}

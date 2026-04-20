public class LV07_20260420 {
    static void main(String[] args) {
        Rechteck myRechteck = new Rechteck();
        Kreis myKreis = new Kreis();
        myFormLinkedList myLinkedList = new myFormLinkedList();

        myLinkedList.add(myRechteck);
        myLinkedList.add(myKreis);

        System.out.println("Anzahl Formen in Liste: " + myLinkedList.size);

        for (int i = 0; i < myLinkedList.size; i++) {
            System.out.println(myLinkedList.getItem(i));
        }
    }
}

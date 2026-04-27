public class LV08_20260427_1 {
    static void main(String[] args) {
        Position position1 = new Position();
        Position position2 = new Position();

        myPositionLinkedList linkedList = new myPositionLinkedList();
        linkedList.add(position1);
        linkedList.add(position2);

        System.out.println("Anzahl Formen in Liste: " + linkedList.size);

        for (int i = 0; i < linkedList.size; i++) {
            System.out.println(linkedList.getItem(i));
        }
    }
}

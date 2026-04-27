import java.util.LinkedList;

public class LV08_20260427_2 {
    static void main(String[] args) {
        myLinkedList<Form> myFormList = new myLinkedList<Form>();
        myFormList.add(new Rechteck(4,5));
        myFormList.add(new Kreis());
        myFormList.add(new Kreis(6));
        for (int i = 0; i < myFormList.size; i++) {
            System.out.println(myFormList.getItem(i));
        }

        myLinkedList<Position> myPositionList = new myLinkedList<Position>();
        System.out.println("Print myPositionList");
        myPositionList.add(new Position(1,2));
        myPositionList.add(new Position(3,2));
        for (int i = 0; i < myPositionList.size; i++) {
            System.out.println(myPositionList.getItem(i));
        }
    }
}

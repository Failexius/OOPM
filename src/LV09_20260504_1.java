import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LV09_20260504_1 {
    static void main(String[] args) {
        List<Position> myPositionList = new LinkedList<Position>();

        myPositionList.add(new Position(3, 4));
        Position myPosition = new Position(6, 7);
        myPositionList.add(myPosition);
        myPositionList.add(new Position(10, 10));
        myPositionList.add(new Position(2, 9));
        Position myPositionX = new Position(9, 9);

        for (Iterator<Position> iterator = myPositionList.iterator(); iterator.hasNext(); ) {
            Position position = iterator.next();
            System.out.println(position);
        }

        if (myPositionList.remove(myPosition))
            System.out.println("Listenelement " + myPosition + " erfolgreich aus Liste entfernt.");
        else
            System.out.println("Listenelement " + myPosition + " konnte nicht aus Liste entfernt werden.");

        if (myPositionList.remove(myPositionX))
            System.out.println("Listenelement " + myPositionX + " erfolgreich aus Liste entfernt.");
        else
            System.out.println("Listenelement " + myPositionX + " konnte nicht aus Liste entfernt werden.");


        System.out.println("Size myPositionList: " + myPositionList.size());
        for (Iterator<Position> iterator = myPositionList.iterator(); iterator.hasNext(); ) {
            Position tmpPosition = iterator.next();
            System.out.println(tmpPosition);
        }
        myPositionList.add(1, myPositionX);

        System.out.println("Size myPositionList: " + myPositionList.size());
        for (Iterator<Position> iterator = myPositionList.iterator(); iterator.hasNext(); ) {
            Position tmpPosition = iterator.next();
            System.out.println(tmpPosition);
        }
        //myPositionList.add(100, myPositionX);
        //System.out.println("Einfügen an Position 100 nicht möglich");
    }
}

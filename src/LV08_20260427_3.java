import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LV08_20260427_3 {
    static void main(String[] args) {
        List<Form> myFormList = new LinkedList<Form>();
        myFormList.add(new Rechteck(5,6));
        myFormList.add(new Kreis(9));

        List<Position> myPositionList = new LinkedList<Position>();
        myPositionList.add(new Position(3,4));
        Position myPosition = new Position(6,7);
        myPositionList.add(myPosition);

        for (Iterator<Form> iterator = myFormList.iterator(); iterator.hasNext(); ) {
            Form form = iterator.next();
            System.out.println(form);
        }
        for (Iterator<Position> iterator = myPositionList.iterator(); iterator.hasNext(); ) {
            Position position = iterator.next();
            System.out.println(position);
        }
    }
}

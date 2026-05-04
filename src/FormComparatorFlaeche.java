import java.util.Comparator;

public class FormComparatorFlaeche implements Comparator<Form> {
    @Override
    public int compare(Form o1, Form o2) {
        return Double.compare(o1.berechneFlaeche(), o2.berechneFlaeche());
    }
}

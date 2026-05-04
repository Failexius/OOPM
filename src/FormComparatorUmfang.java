import java.util.Comparator;

public class FormComparatorUmfang implements Comparator<Form> {
    @Override
    public int compare(Form o1, Form o2) {
        return Double.compare(o1.berechneUmfang(), o2.berechneUmfang());
    }
}

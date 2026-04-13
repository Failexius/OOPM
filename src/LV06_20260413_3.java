import java.time.LocalDate;

public class LV06_20260413_3 {
    static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);
        myDate = myDate.plusMonths(8);
        System.out.println(myDate);

        System.out.println(myDate.getDayOfMonth());

        if (LocalDate.now().isAfter(myDate)){
            System.out.println("is after");
        } else {
            System.out.println("is not after");
        }
    }
}
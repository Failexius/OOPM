import java.util.Scanner;

public class LV10_20260511_1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, result;

        System.out.println("*** Exception Demo ***");

        // validate exit code 1 vs 0 and program output
        // result = 5 / 0;

        System.out.println("a: ");
        a = sc.nextInt();
        System.out.println("b: ");
        b = sc.nextInt();

        // demo without try-catch block (validate exit code 1 vs 0) and program output
        // result a / b

        try {
            result = a / b;
            System.out.println("Result = a / b: " + result);
        } catch (Exception e) {
            System.out.println("Division durch Null nicht möglich.");
            e.printStackTrace();
        }

        System.out.println("*** Ende Exception Demo ***");
    }
}

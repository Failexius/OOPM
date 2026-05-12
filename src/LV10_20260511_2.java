import java.util.Scanner;

public class LV10_20260511_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, result;

        System.out.println("*** Exception Demo ***");
        System.out.println("a: ");
        a = sc.nextInt();
        System.out.println("b: ");
        b = sc.nextInt();

        // error: Unhandled exception -> implementation using try-catch
        // System.out.println("result: " + Division(a,b));

        try {
            System.out.println("result: " + Division(a,b));
        } catch (myException e){
            e.printStackTrace();
        }

        System.out.println("*** Ende Exception Demo ***");
    }

    public static int Division(int a, int b) throws myException {
        int result = 0;
        if (b == 0)
            throw new myException("Fehler: Division durch Null nicht möglich.");
        result = a / b;
        return result;
    }
}

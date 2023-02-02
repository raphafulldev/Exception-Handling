import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

public class BlocoTryCatch {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        method1();
        System.out.println("End of program");

    }
    public static void method1 (){
        System.out.println("***METHOD 1 START***");
        method2();

        System.out.println("***METHOD 1 END***");

    }

    public static void method2() {
        Scanner sc = new Scanner(in);
        System.out.println("***METHOD 2 START***");

        try {
            String[] vect = sc.nextLine().split(" ");

            int position = sc.nextInt();

            System.out.println(vect[position]);
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid position");
            e.printStackTrace();
            sc.next();
        }
        System.out.println("***METHOD 2 END***");

        sc.close();
    }
}
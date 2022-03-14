package Boolean;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//In this example, the aIsBigger() method should return true if the int parameter a is larger than b by 2 or more.
// This code uses an if with && ("and") to return true if the condition is met.
// Alternately, the run falls through to the return-false at the bottom.
// This is a pretty simple way to do it.
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Please provide 2 intigers");
        for (int i = 0; i<2;i++) {
            try {
                int a = scanner.nextInt ( );
                int b = scanner.nextInt ();
                System.out.println ("Wprowadzono " + a + " " + b );
                aIsBigger(a,b);
            } catch (InputMismatchException ime) {
                String LastEnteredValueFromUser = scanner.next ( );
                System.err.println ("Entered incorrect data " + LastEnteredValueFromUser + " please try again");
                i--; // cofamy iterator o 1
            }
        }
    }

    private static void aIsBigger(int a, int b) {
        boolean status;

        if (a > b && (a - b) >= 2) {
            System.out.println ("True");
            status = true;
        } else {
            System.out.println ("False");
            status = false;
        }
    }
}

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //01. Print all even numbers till n.
        /*for(int i = 0; i <= n; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }*/

        //02.Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
        //If the user enters 1 then keep taking input from the user for a student’s
        // marks(out of 100).
        //If they enter 0 then stop.
        //If he/ she scores :
        //Marks >=90 -> print “This is Good”
        //89 >= Marks >= 60 -> print “This is also Good”
        //59 >= Marks >= 0 -> print “This is Good as well”
        //    Because marks don’t matter but our effort does.

        do {
            if(n >= 90) {
                System.out.println("This is Good.");
            } else if (n >= 60 || n >= 89) {
                System.out.println("This is also Good.");
            } else if (n >= 1 || n >= 59) {
                System.out.println("This is Good as well.");
            } else {
                System.out.println("Because marks don't matter but our effort does.");
            }
        } while (n == 1);


    }
}

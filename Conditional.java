import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        //Set user Input method
        Scanner userInput = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        //01. Checking Is Adult *************
        /* int age = userInput.nextInt();
        if(age >= 18) {
            System.out.println("Is Adult.");
        } else{
            System.out.println("Not Adult.");
        } */

        //02. Odd or Even number x % 2 = 0 (Even) *************
        /*int reminderNumber = userInput.nextInt();
        if(reminderNumber % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        } */

        //03. Equality or Grater or Lesser
        /*int firstNumber = userInput.nextInt();
        int secondNumber = userInput.nextInt();
        if(firstNumber == secondNumber) {
            System.out.println("The both number is Equal number");
        } else if (firstNumber > secondNumber) {
            System.out.println("First number is Granter.");
        } else {
            System.out.println("First number is Lesser.");
        }*/


        //04. Start Motor button function
        /*int button = userInput.nextInt();
        switch (button){
            case 1: System.out.println("Start Motor...");
                break;
            case 2: System.out.println("Gear shift Forward");
                break;
            case 3: System.out.println("Gear shift Reverse");
                break;
            default:System.out.println("Stop Motor!");
        }*/

        // *** Homework Problems ***
        /*01.Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
        1 : + (Addition) a + b
        2 : - (Subtraction) a - b
        3 : * (Multiplication) a * b
        4 : / (Division) a / b
        5 : % (Modulo or remainder) a % b
        Calculate the result according to the operation given and display it to the user.*/

        /*System.out.print("Please Type your First Calculating number: ");
        float firstCalNumber = userInput.nextFloat();
        System.out.print("Please Type your Second Calculating number: ");
        float secondCalNumber = userInput.nextFloat();
        System.out.print("Please Type Method +(1),-(2),*(3),/(4),%(5): ");
        int operator = userInput.nextInt();
        switch (operator){
            case 1: System.out.println("Addition is: " + firstCalNumber + secondCalNumber);
                break;
            case 2: System.out.println(firstCalNumber - secondCalNumber);
                break;
            case 3: System.out.println("Multiplication is: " + firstCalNumber * secondCalNumber);
                break;
            case 4: System.out.println("Division is: " + firstCalNumber / secondCalNumber);
                break;
            case 5: System.out.println("Reminder is: " + firstCalNumber % secondCalNumber);
                break;
            default: System.out.println("Invalid option");
        }*/


        //02. Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on
        /*int yearListNumber = userInput.nextInt();
        switch (yearListNumber) {
            case 1: System.out.println("January");
                break;
            case 2: System.out.println("February");
                break;
            case 3: System.out.println("March");
                break;
            case 4: System.out.println("April");
                break;
            case 5: System.out.println("May");
                break;
            case 6: System.out.println("June");
                break;
            case 7: System.out.println("July");
            case 8: System.out.println("August");
                break;
            case 9: System.out.println("September");
                break;
            case 10: System.out.println("October");
                break;
            case 11: System.out.println("November");
                break;
            default: System.out.println("December");
        }*/

        //03. Greatest Common Divisor(GCD) & Least Common Multiple(LCM)
        System.out.println("Enter 2 integer number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int n1 = num1;
        int n2 = num2;
        int rem, gcd, lcm;
        while (n2 != 0) {
            rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        gcd = n1;
        lcm = (num1*num2) / gcd;
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);




    }
}

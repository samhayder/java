import java.util.Scanner;

public class FunctionEx {

    //01. Enter 3 numbers from the user & make a function to print their average.
    public static int calcAverage(int firstNum, int secondNum, int thirdNum){
        int sum =  firstNum+secondNum+thirdNum;
        return sum/3;
    }

    //02. Write a function to print the sum of all odd numbers from 1 to n.
    public static void sumOddNumber(int userInput){
        int sum = 0;
        for (int i = 1; i <= userInput; i++){
            if(i % 2 != 0){
                sum += i;
                System.out.println(sum);
            }
        }
    }

    //03. Write a function which takes in 2 numbers and returns the greater of those two.
    public static void returnsGreater(int firstNum, int secondNum){
        if (firstNum > secondNum){
            System.out.println(firstNum);
        }  else {
            System.out.println(secondNum);
        }
    }

    //04. Write a function that takes in the radius as input and returns the circumference of a circle.
    public static double circumferenceCircle(double userInput){
        final double PI = 3.1415;
        double cir = 2 * PI * userInput; //userInput => Radius
        return cir;
    }

    //05. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
    public static void votePermission(int userInput){
        if (userInput >= 18){
            System.out.println("Congratulation! You eligible to vote.");
        } else {
            System.out.println("Sorry! You don't eligible to vote");
        }
    }

    //06. Write an infinite loop using do while condition.
    public static void infiniteLoop(int userInput){
        do {
            System.out.println(userInput);
        } while (userInput > 0);
    }

    //07. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

    //08. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
    public static void raisedValue(int x, int n){
        int result = 1;
        for (int i = 0; i < n; i++){
            result = result * x;
            System.out.println(result);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int userInput = sc.nextInt();
        //01 function user input
        //System.out.print("Enter 3 number to calculate average: ");
        //int firstNum = sc.nextInt();
        //int secondNum = sc.nextInt();
        //int thirdNum = sc.nextInt();
        int x = sc.nextInt();
        int n = sc.nextInt();

        // Print 01 calculate average function =>
        //System.out.println("3 Numbers their Average is: "+ calcAverage(firstNum,secondNum,thirdNum));

        //Print 02 odd number function =>
        //sumOddNumber(userInput);

        //Print 03 returns greater number function =>
        //returnsGreater(firstNum, secondNum);

        //Print 04 returns the circumference of a circle =>
        //System.out.println(circumferenceCircle(userInput));

        //Print 05 eligible to vote function
        //votePermission(userInput);

        //Print 06 infinite loop function
        //infiniteLoop(userInput);

        //Print 07

        //Print 08 Raised Value function
        raisedValue(x,n);
    }
}

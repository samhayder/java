import java.util.Scanner;

public class Functions {

    //Print My Name
    public static void printMyName(String name){
        System.out.println("My name is: "+ name);
        return;
    }

    //Calculate sum of 2 numbers
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    //Calculate multiply 2 numbers
    public static int calculateProduct(int a, int b){
        return a*b;
    }

    //Print Factorial Numbers => nx(n-1) x nx(n-2) x nx(n-3) .... x1
    public static void showFactorial(int factorialInput){
        if (factorialInput < 0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        for (int i = factorialInput; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println("The Factorial Number is: "+ factorial);
        return;
    }

    //Make a function to check if a number is prime or not.
    public static void checkPrimeNumber(int positiveNumber){
        int count = 0;
        for (int i = 2; i < positiveNumber; i++){
            if(positiveNumber % i == 0){
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println(positiveNumber +" is Prime Number.");
        } else {
            System.out.println(positiveNumber + " is not Prime Number.");
        }
        return;
    }

    //Make a function to check if a given number n is even or not.
    public static void checkEvenNumber(int num){
        if(num % 2 == 0) {
            System.out.println(num + " is Even Number");
        }else {
            System.out.println(num + " is not Even Number");
        }
        return;
    }

    //Make a function to print the table of a given number n.
    public static void printTableNumber(int num){
        for (int i = 1; i <= 10; i++){
            int multiply = i * num;
            System.out.println(num + " x " + i + " = " + multiply);
        }
        return;
    }

    //Recursion call aging function
    public  static  int fact(int num){
        if (num == 1){
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String name = sc.nextLine();
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //int factorialInput = sc.nextInt();
        //int positiveNumber = sc.nextInt();
        int num = sc.nextInt();

        //Print my name function
        //printMyName(name);

        //Print calculateSum function
        //System.out.println("Calculate Two Numbers by Sum: "+calculateSum(a,b));

        //Print calculateProduct function
        //System.out.println("Multiply two Products by: "+ calculateProduct(a,b));

        //Print Factorial numbers function
        //showFactorial(factorialInput);

        //Print Check Prime number function
        //checkPrimeNumber(positiveNumber);

        //Print Check Even number function
        //checkEvenNumber(num);

        //Print Table Number
        //printTableNumber(num);

        //Print Recursion call aging function
        System.out.println(fact(num));
    }
}

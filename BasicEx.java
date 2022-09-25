//https://www.w3resource.com/java-exercises/basic/index.php

import java.util.Scanner;

public class BasicEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //2. To print the sum of two numbers.
        /*int a = 74;
        int b = 36;
        System.out.println(a + b);*/

        //3. To divide two numbers and print on the screen.
       /* int a = 50;
        int b = 3;
        System.out.println(a / b);*/

        //4. To print the result of the following operations.
        /*System.out.println(-5 + 8 * 6); // 43
        System.out.println((55+9) % 9); // 1
        System.out.println(20 + 3 * 5 / 8); //21
        System.out.println(5 + 15 / 3 * 2 - 8 % 3); //*/

        //5. Takes two numbers as input and display the product of two numbers.
        /*int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        System.out.println(firstNumber + " x " + secondNumber + " = " + firstNumber*secondNumber);*/

        //6. To print the sum (addition), multiply, subtract, divide and remainder of two numbers.
       /* int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int addition = firstNum + secondNum;
        int subtract = firstNum - secondNum;
        int multiply = firstNum * secondNum;
        double divide = firstNum / secondNum;
        int remainder = firstNum % secondNum;
        System.out.println(firstNum + " + " + secondNum + " = " + addition);
        System.out.println(firstNum + " - " + secondNum + " = " + subtract);
        System.out.println(firstNum + " * " + secondNum + " = " + multiply);
        System.out.println(firstNum + " / " + secondNum + " = " + divide);
        System.out.println(firstNum + " % " + secondNum + " = " + remainder);*/

        //7. Takes a number as input and prints its multiplication table upto 10.
        /*int num = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        };*/

        //8. To display the following pattern.
        /*System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");*/

        //9. To compute the specified expressions and print the output.
        /*double result = ((25.5 * 3.5) - (3.5 * 3.5)) / (40.5 - 4.5);
        System.out.println(result);*/

        //10. To compute a specified formula.
        //4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
        //4.0 * (1 - 0.3333333333333333 + 0.2 - 0.1428571428571429 + 0.1111111111111111 - 0.0909090909090909)
        //4.0 * (1.311111111111111 - 0.5670995670995671)
        //4.0 * 0.7440115440115439
        //2.9760461760461765
        /*double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(result);*/


    }
}

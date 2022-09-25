import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        /*System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);*/
        //Output of array
        for (int i = 0; i < marks.length; i++){
            //System.out.println(marks[i]);
        }

        //01. User input of array
        /*int size = sc.nextInt();
        int numbers[] = new int[size];
        //Input array list
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        //Output of array
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }*/

        //02. Take an array as input from the user. Search for a given number X and print the index at which it occurs.
        /*int students[] = new int[6];
        //Input for user
        for (int i = 0; i < students.length; i++){
            students[i] = sc.nextInt();
        }
        //Search the item and print X
        int userSearch = sc.nextInt();
        for (int i = 0; i < students.length; i++){
            if (students[i] == userSearch){
                System.out.println("X" + i);
            }
        }
        //Output
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }*/

        //03. Take an array of names as input from the user and print them on the screen.
       /* String names[] = new String[3];
        //Input from user
        for (int i = 0; i < names.length; i++){
            names[i] = sc.nextLine();
        }
        for (int i = 0; i < names.length; i++){
            System.out.print(names[i]+" ");
        }*/

        //04. Find the maximum & minimum number in an array of integers.
        int arr[] = new int[6];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }

        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);












    }
}

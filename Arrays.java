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

        //****** 2D Array ****************
        /*System.out.println("Please type your rows.");
        int rows = sc.nextInt();
        System.out.println("please type your colum");
        int colum = sc.nextInt();

        int arr2D [][] = new int[rows][colum];

        //Input
        //Outer Loops for rows
        for (int i = 0; i < rows; i++){
            //Inner loops for colum
            for (int j = 0; j < colum; j++){
                arr2D[i][j] = sc.nextInt();
            }
        }

        System.out.println("Type Searching number.");
        int search = sc.nextInt(); //Search number
        //Search Looping
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < colum; j++){
                if (arr2D[i][j] == search){
                    System.out.println(search + " Number location is " + i + "," + j);
                }else {
                    System.out.println(search + " Not found");
                }
            }
        }*/


        //04. Print the spiral order matrix as output for a given matrix of numbers.
        int matrixRow = 5;
        int matrixColum = 6;
        int matrixArr [][] = new int[matrixRow][matrixColum];
        //Input
        for (int i = 0; i < matrixRow; i++){
            for (int j = 0; j < matrixColum; j++){
                matrixArr[i][j] = sc.nextInt();
            }
        }
        //Output
        for (int i = 0; i < matrixRow; i++){
            for (int j = 0; j < matrixColum; j++){
                System.out.print(matrixArr[i][j] + " ");
            }
            System.out.println();
        }













    }
}

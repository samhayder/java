import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = 5;
        //int colum = sc.nextInt();
        //int number = 0;

        for (int i = 1; i <= rows; i++ ){
            for (int s= 1; s <= rows-i; s++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }








    }
}

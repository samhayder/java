public class Patterns {
    public static void main(String[] args) {
        //01.Solid Rectangle ************************
        //  *****
        //  *****
        //  *****
        //  *****
        int rows = 5;
        int colum = 5;
        // Outer Loops (Rows)
        /*for (int i = 1; i <= rows; i++){
            //Inner Loops (Colum)
            for (int j = 1; j <= colum; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //02.Hollow Rectangle **************
        //  *****
        //  *   *
        //  *   *
        //  *****
        // Outer Loops (Rows)
        /*for (int i = 1; i <= rows; i++){
            //Inner Loops (Colum)
            for (int j = 1; j <= colum; j++){
                if (i == 1 || j == 1|| i == rows || j == colum){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }*/


        //03. Half Pyramid ****************
        //  *
        //  **
        //  ***
        //  ****
        //Outer Loops (Rows)
        /*for (int i = 1; i <= rows; i++) {
            //Inner Loops (rows update)
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/


        //04. Inverted Half Pyramid
        //  ****
        //  ***
        //  **
        //  *
        //Outer Loops (Rows)
        /*for (int i = rows; i >= 1; i--){
            //Inner Loops (Rows updating)
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //05. Inverted Half Pyramid (rotated by 180deg)
        //     *
        //    **
        //   ***
        //  ****
        //Outer Loops (Rows)
        /*for (int i = 1; i <= rows; i++){
            //Inner Loops (Space)
            for (int j = 1; j <= rows-i; j++){
                System.out.print(" ");
            }
            //Inner Loops (Colum)
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //06. Half Pyramid with Number
        //  1
        //  1 2
        //  1 2 3
        //  1 2 3 4
        //Outer Loops (Rows)
        /*for (int i = 1; i <= rows; i++){
            //Inner Loops (Rows updating)
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        //07. Inverted Half Pyramid with number
        //  1 2 3 4
        //  1 2 3
        //  1 2
        //  1
        //Outer Loops(Rows)
        /*for (int i = rows; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/

        //08. Floyd's Triangle
        //  1
        //  2 3
        //  4 5 6
        //  7 8 9 10

        //Outer Loops(Rows)
        //int number = 1;
        /*for (int i = 1; i <= rows; i++){
            //Inner Loops (Rows updating)
            for (int j = 1; j <= i; j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }*/

        //09. 0-1 Triangle
        //  1
        //  0 1
        //  1 0 1
        //  0 1 0 1
        /*for (int i = 1; i <= rows; i++){
            //Inner Loops
            for (int j = 1; j <= i; j++){
                int sum = i + j;
                if(sum % 2 == 0){ //Even
                    System.out.print("1 ");
                } else { //Odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }*/

        //10. Butterfly Pattern
        //  *        *
        //  **      **
        //  ***    ***
        //  ****  ****
        //  **********
        //  **********
        //  ****  ****
        //  ***    ***
        //  **      **
        //  *        *

        //Print Upper Part Outer Loops
        /*for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //Print Upper Right part
            int spaces = 2 * (rows - i);
            for (int s = 1; s <= spaces; s++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Print Lower Part
        for (int i = rows; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //Print Lower Right part
            int spaces = 2 * (rows - i);
            for (int s = 1; s <= spaces; s++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //11. Solid Rhombus
        //      *****
        //     *****
        //    *****
        //   *****
        //  *****

        //Print Outer Loops (Rows)
        /*for (int i = 1; i <= rows; i++){
            //Print Space
            for (int s = 1; s <= rows-i; s++){
                System.out.print(" ");
            }
            //Print * Inner Loops
            for (int j = 1; j <= rows; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //12. Number Pyramid
        //     1
        //    1 2
        //   1 2 3
        //  1 2 3 4

        //Print Outer Loops
        /*for (int i = 1; i <= rows; i++){
            //Print Space
            for (int s = 1; s <= rows-i; s++){
                System.out.print(" ");
            }
            //Print Inner Loops Number
            for (int j = 1; j <= i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }*/

        //13. Palindromic Pattern
        //     1
        //    212
        //   32123
        //  4321234

        //Print Outer Loops
        /*for (int i = 1; i <= rows; i++){
            //Print Space
            for (int s = 1; s <= rows-i; s++){
                System.out.print(" ");
            }
            //Print Inner Loops First part
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            //Print Right part
            for (int k = 2; k <= i; k++){
                System.out.print(k);
            }
            System.out.println();
        }*/

        //14.Diamond Pattern
        //    *
        //   ***
        //  *****
        // *******
        //*********
        //*********
        // *******
        //  *****
        //   ***
        //    *

        //Print Top Part Outer Loops
        /*for (int i = 1; i <= rows; i++){
            //Print Space
            for (int s = 1; s <= rows-i; s++){
                System.out.print(" ");
            }
            //Print Inner Loops Left Side *
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //Print Right side
            for (int k = 1; k <= i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Print Bottom Part Loops
        for (int i = rows; i >= 1; i--){
            //Print Space
            for (int s = 1; s <= rows-i; s++){
                System.out.print(" ");
            }
            //Print Inner Loops Left Side *
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //Print Right side
            for (int k = 1; k <= i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //15. Print a hollow Butterfly.
        //  *        *
        //  **      **
        //  * *    * *
        //  *  *  *  *
        //  *   **   *
        //  *   **   *
        //  *  *  *  *
        //  * *    * *
        //  **      **
        //  *        *

        //Print First Part M Outer Loops
        for (int i = 1; i <= rows; i++){
            //Print inner loops Left Part A
            for (int j= 1; j <= i; j++){
                //Print space of lest side
                if (j==1 || j==i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //Print Space
            int space = 2*(rows-i);
            for (int s = 1; s <= space; s++){
                System.out.print(" ");
            }
            //Print Right part
            for (int k = 1; k <= i; k++){
                //Print space of lest side
                if (k==1 || k==i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        //Print Second Bottom Part W Outer Loops
        for (int i = rows; i >= 1; i--){
            //Print inner loops Left Part A
            for (int j= 1; j <= i; j++){
                //Print space of lest side
                if (j==1 || j==i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //Print Space
            int space = 2*(rows-i);
            for (int s = 1; s <= space; s++){
                System.out.print(" ");
            }
            //Print Right part
            for (int k = 1; k <= i; k++){
                //Print space of lest side
                if (k==1 || k==i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }





    }
}

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Samhayder";
        //String result = name.replace('S', 'H'); //Replace
        //System.out.println(result);
        //Concatenation
        String firstName = "Samsuddin";
        String lastName = "Hayder";
        String fullName = firstName + "@" + lastName;
        //System.out.println(fullName.length()); //Length
        //SubString
        String subname = fullName.substring(10, fullName.length());
        System.out.println(subname);
        //CharAt
        for (int i = 0; i < fullName.length(); i++){
            //System.out.println(fullName.charAt(i));
        }

        //CompareTo
        if (firstName.compareTo(lastName) == 0){
            System.out.println("Is Equal");
        } else {
            System.out.println("Not Equal");
        }

        //ParseInt Method
        String str = "123";
        int num = Integer.parseInt(str);
        //System.out.println(num);

        //01. Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

        /*String strArray[] = new String[3];
        int arrTotalLength = 0;
        //Input
        for (int i = 0; i < strArray.length; i++){
            strArray[i] = sc.nextLine();
            arrTotalLength += strArray[i].length();
        }
        //output
        System.out.println(arrTotalLength);*/

        //02. Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
        String repStr  = sc.nextLine();
        String result = "";
        for (int i = 0; i < repStr.length(); i++){

            if (repStr.charAt(i) == 'e'){
                result += 'i';
            } else {
                result += repStr.charAt(i);
            }
        }
        System.out.println(result);



    }
}

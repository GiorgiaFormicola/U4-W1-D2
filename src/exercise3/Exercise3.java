package exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      /*  while (true) {
            System.out.println("Insert a string to divide it in single characters (type the string ':q' to exit):");
            String string = scanner.nextLine();
            StringBuilder stringDivided = new StringBuilder();
            if (string.equals(":q")) break;
            //if(string == ":q") break;
            for (int i = 0; i < string.length(); i++) {
                if (i != string.length() - 1) {
                    stringDivided.append(string.charAt(i)).append(",");
                } else {
                    stringDivided.append(string.charAt(i));
                }
            }
            string = stringDivided.toString();
            System.out.println(string);
        }*/

        while (true) {
            System.out.println("Insert a string to divide it in single characters (type the string ':q' to exit):");
            String string = scanner.nextLine();
            if (string.equals(":q")) break;
            String[] charactersArray = string.split("");
            string = String.join(",", charactersArray);
            System.out.println(string);
        }
    }
}

package exercise3;

import java.util.Objects;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* while (true) {
            System.out.println("Insert a string to divide it in single characters (type the string ':q' to exit):");
            String stringToDivide = scanner.nextLine();
            StringBuilder stringDivided = new StringBuilder();
            if (Objects.equals(stringToDivide, ":q")) break;
            for (int i = 0; i < stringToDivide.length(); i++) {
                if (i != stringToDivide.length() - 1) {
                    stringDivided.append(stringToDivide.charAt(i)).append(",");
                } else {
                    stringDivided.append(stringToDivide.charAt(i));
                }
            }
            System.out.println(stringDivided);
        }*/

        while (true) {
            System.out.println("Insert a string to divide it in single characters (type the string ':q' to exit):");
            String string = scanner.nextLine();
            //StringBuilder stringDivided = new StringBuilder();
            if (Objects.equals(string, ":q")) break;
            for (int i = 0; i < string.length(); i++) {
                if (i != string.length() - 1) {
                    System.out.print(string.charAt(i) + ",");
                } else {
                    System.out.print(string.charAt(i) + "\n");
                }
            }

        }
    }
}

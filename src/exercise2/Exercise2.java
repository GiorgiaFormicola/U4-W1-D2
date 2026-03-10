package exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number from 0 to 3 to print it:");
        int number = Integer.parseInt(scanner.nextLine());
        switch (number) {
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("One");
            case 3 -> System.out.println("Three");
            default -> System.out.println("Error: the chosen number is not available");
        }
    }
}

package exercise4;

import java.util.Scanner;

public class Exercise4 {
    static String countdownReport(int secondsToLaunch) {
        StringBuilder countdown = new StringBuilder();
        for (int i = secondsToLaunch; i > 0; i--) {

            if (i % 2 == 0) {
                countdown.append("[OK] ").append(i).append("\n");
                if (i == 10) {
                    countdown.append("--- SEPARATION STAGE ---").append("\n");
                }
            } else {
                if (i != 1) {
                    countdown.append("[CHECK] ").append(i).append("\n");
                } else {
                    countdown.append("[CHECK] ").append(i);
                }
            }

        }
        return countdown.toString();
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the amounts of seconds before launch: ");
        int secondsToLaunch = Integer.parseInt(scanner.nextLine());
        secondsToLaunch = secondsToLaunch < 0 ? -secondsToLaunch : secondsToLaunch;
        secondsToLaunch = Math.min(secondsToLaunch, 20);
        System.out.println("Seconds to launch: " + secondsToLaunch);
        System.out.println(countdownReport(secondsToLaunch));
        System.out.println("--- \uD83D\uDE80 IGNITION ---");
    }
}

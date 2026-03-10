package exercise1;

public class Exercise1 {
    static boolean evenUnevenString(String string) {
        return string.length() % 2 == 0;
    }

    static boolean leapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else {
            return year % 4 == 0 && year % 100 != 0;
        }
    }

    ;

    public static void main(String[] args) {
        System.out.println("----- evenUnevenString METHOD TEST");
        String string = "Ciao";
        System.out.println("The string '" + string + "' as an " + (evenUnevenString(string) ? "even" : "uneven") + " number of characters");

        string = "Ciao!";
        System.out.println("The string '" + string + "' as an " + (evenUnevenString(string) ? "even" : "uneven") + " number of characters");

        System.out.println("----- leapYear METHOD TEST");
        int year = 2000;
        System.out.println("The year " + year + " is" + (leapYear(year) ? "" : "not") + " a leap year");

        year = 2004;
        System.out.println("The year " + year + " is" + (leapYear(year) ? "" : "not") + " a leap year");

        year = 1900;
        System.out.println("The year " + year + " is" + (leapYear(year) ? "" : " not") + " a leap year");


    }
}

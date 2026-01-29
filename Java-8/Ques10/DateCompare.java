package Ques10;

import java.time.LocalDate;
import java.util.Scanner;

public class DateCompare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first date (yyyy-mm-dd): ");
        LocalDate date1 = LocalDate.parse(sc.next());
        System.out.println("Enter second date (yyyy-mm-dd): ");
        LocalDate date2 = LocalDate.parse(sc.next());

        if (date1.isBefore(date2)) {
            System.out.println("first date is before the second date");
        } else if (date1.isAfter(date2)) {
            System.out.println("first date is after the second date");
        } else {
            System.out.println("both dates are equal");
        }

        sc.close();
    }
}

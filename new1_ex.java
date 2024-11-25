//experimant no-1 Clender
import java.io.*;

class Calendar1 {
    public static void main(String[] args) {
        int d = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (isLeapYear(y)) 
        {
            monthDays[1] = 29; // February has 29 days in a leap year
        }

        int totalDays = 0;

        // Adding days of the years before the given year
        for (int j = 1; j < y; j++) {
            totalDays += isLeapYear(j) ? 366 : 365;
        }

        // Adding days of the months before the given month in the given year
        for (int i = 1; i < m; i++) {
            totalDays += monthDays[i - 1];
        }

        // Adding days in the given month
        totalDays += d;

        // The day of the week for the given date
        int dayIndex = (totalDays - 1) % 7; // -1 because 1 Jan 1 AD was a Monday

        System.out.println("The day of date " + d + "/" + m + "/" + y + ": " + days[dayIndex]);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

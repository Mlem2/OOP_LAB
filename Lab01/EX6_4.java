import java.util.Scanner;

public class EX6_4 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        int year = 0;
        int days = 0;

        while (year <= 0) {
            System.out.print("Enter year: ");
            String yearString = s.next();
            try {
                year = Integer.parseInt(yearString);
                if (year <= 0) {
                    System.out.println("Error, invalid year");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Error, invalid year");
            }
        }

        while (days <= 0) {
            System.out.print("Enter month: ");
            String monthString = s.next();
            if (monthString.equals("January") || monthString.equals("Jan.") || monthString.equals("Jan") || monthString.equals("1")) {
                days = 31;
            } else if (monthString.equals("Febuary") || monthString.equals("Feb.") || monthString.equals("Feb") || monthString.equals("2")) {
                if (year % 4 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
            } else if (monthString.equals("March") || monthString.equals("Mar.") || monthString.equals("Mar") || monthString.equals("3")) {
                days = 31;
            } else if (monthString.equals("April") || monthString.equals("Apr.") || monthString.equals("Apr") || monthString.equals("4")) {
                days = 30;
            } else if (monthString.equals("May") || monthString.equals("5")) {
                days = 31;
            } else if (monthString.equals("June") || monthString.equals("Jun") || monthString.equals("6")) {
                days = 30;
            } else if (monthString.equals("July") || monthString.equals("Jul") || monthString.equals("7")) {
                days = 31;
            } else if (monthString.equals("August") || monthString.equals("Aug.") || monthString.equals("Aug") || monthString.equals("8")) {
                days = 31;
            } else if (monthString.equals("September") || monthString.equals("Sep.") || monthString.equals("Sep") || monthString.equals("9")) {
                days = 30;
            } else if (monthString.equals("October") || monthString.equals("Oct.") || monthString.equals("Oct") || monthString.equals("10")) {
                days = 31;
            } else if (monthString.equals("November") || monthString.equals("Nov.") || monthString.equals("Nov") || monthString.equals("11")) {
                days = 30;
            } else if (monthString.equals("December") || monthString.equals("Dec.") || monthString.equals("Dec") || monthString.equals("12")) {
                days = 31;
            } else {
                System.out.println("Error, invalid month");
            }

        }

        s.close();

        System.out.print("Number of days: " + days);

    }
}

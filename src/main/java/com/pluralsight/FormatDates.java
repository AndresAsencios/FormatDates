package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormatDates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();


        System.out.println("Today is: " + today);

        LocalTime currentTime = LocalTime.now();
        System.out.println("The current time is: " + currentTime);

        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("Right now, it is: " + rightNow);

        // Format 1: 09/05/2021
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        //2021-09-05
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //September 5, 2021
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");

        //Sunday, Sep 5, 2021  10:02
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");

        System.out.println(today.format(format1));
        System.out.println(today.format(format2));
        System.out.println(today.format(format3));
        System.out.println(rightNow.format(format4));

        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy");

    }
}

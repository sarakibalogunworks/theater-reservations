package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String fullName = myscanner.nextLine().trim();

        System.out.println("What date will you be coming (MM/dd/yyyy: ");
        String dateInput = myscanner.nextLine().trim();

        System.out.println("How many tickets would you like? ");
        int numTickets = myscanner.nextInt();

        String firstName = "";
        String lastName = "";

        int spaceIndex = fullName.indexOf(" ");
        if (spaceIndex > 0){
            firstName = fullName.substring(0, spaceIndex);
            lastName = fullName.substring(spaceIndex + 1);
        } else {
            firstName = fullName;
        }


        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateInput, inputFormatter);


        String ticketWord = (numTickets == 1) ? "ticket" : "tickets";

        System.out.println(numTickets + " " + ticketWord + " reversed for " + date + " under " + lastName + ", " + firstName);


        myscanner.close();





    }
}

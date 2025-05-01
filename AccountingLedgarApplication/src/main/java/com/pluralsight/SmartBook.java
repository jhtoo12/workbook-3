package com.pluralsight;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class SmartBook {

    public static Scanner sc = new Scanner(System.in);
    public static File file = new File("Data/Dexter.csv");
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static double balance;


    public static boolean running;

    public static void main(String[] args) {
        balance = 1000;
        running = true;
        while (running) {
            HomeScreen();
//            String HomeScreen = sc.nextLine();
            System.out.println("----");
        }
    }
    public static void HomeScreen() {
        System.out.println("------------------------");
        System.out.println("Home Screen");
        System.out.println("------------------------");
        System.out.println("Where do you want to go?");
        System.out.println("------------------------");
        System.out.println(" D: Add Deposit");
        System.out.println(" P: Make a Payment");
        System.out.println(" L: See Ledgar Record");
        System.out.println(" X: Exit Page");
        System.out.println(" ");
        System.out.println("Enter a command");

        String option = sc.nextLine();

        switch (option.toUpperCase()) {
            case "D":
                addDeposit();
                break;
            case "P":
                makePayment();
                break;
            case "L":
                Ledgar();
                break;
            case "X":
                System.out.println("Goodbye");
                running = false;
                break;
            default:
                System.out.println("Error!!. Try again.");

        }
    }

    public static void addDeposit() {
        System.out.println("Add Deposit Amount: ");
        double depositAmount = sc.nextDouble();
        balance += depositAmount;

        LocalDateTime time = LocalDateTime.now();
        Transaction transaction = new Transaction(time, depositAmount);

        try {
            FileWriter fileWriter = new FileWriter("Data/Dexter.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            LocalDateTime date = LocalDateTime.now();
            bufferedWriter.write(transaction.toCsv() + "\n");

        } catch (IOException e) {
            System.out.println("Failed to write to file.");
        }


    }

    public static void makePayment() {
        String paymentDescription;
        String paymentVendor;
        double paymentPrice;

        System.out.print("\n Add Description: ");
        paymentDescription = sc.nextLine();

        System.out.print("\n Add Vendor: ");
        paymentVendor = sc.nextLine();

        System.out.print("\n Add Price: ");
        paymentPrice = sc.nextDouble();
        sc.nextLine();

        LocalDateTime time = LocalDateTime.now();
        Transaction transaction = new Transaction(time, paymentDescription, paymentVendor, paymentPrice);

        try {
            FileWriter fileWriter = new FileWriter("Data/Dexter.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(transaction.toCsv() + "\n");

        } catch (IOException e) {
            System.out.println("Failed to write to file.");
        }




//        try {
//            FileReader fileReader = new FileReader("Data/Dexter.csv");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            bufferedReader.readLine();
//
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] tokens = line.split("\\|");
//
//                LocalDateTime dateTime = LocalDateTime.parse(tokens[0] + "T" + tokens[1]);
//                String description = tokens[2];
//                String vendor = tokens[3];
//                double price = Double.parseDouble(tokens[4]);
//                Transaction transaction1 = new Transaction(dateTime, description, vendor, price);
//            }
//            bufferedReader.close();
//
//
//            FileWriter fileWriter = new FileWriter("Data/Dexter.csv", true);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//            LocalDateTime date = LocalDateTime.now();
//            bufferedWriter.write("\n" + transaction.toCsv());
//
//            bufferedWriter.close();
//
//
//        } catch (IOException e) {
//            System.out.println("Error!!. Please try again.");
//            e.getStackTrace();
//        }

        HomeScreen();
    }
    public static void Ledgar() {
        System.out.println("------------------------");
        System.out.println("Ledgar");
        System.out.println("------------------------");
        System.out.println("Where do you want to go?");
        System.out.println("------------------------");
        System.out.println(" A: Display all Entries");
        System.out.println(" D: Deposits");
        System.out.println(" P: Payments");
        System.out.println(" R: Reports");
        System.out.println(" H: Home");
        System.out.println(" ");
        System.out.println("Enter a command");

        String option = sc.nextLine();

        switch (option.toUpperCase()) {
            case "A":
                All();
                break;
            case "D":
                makePayment();
                break;
            case "P":
                ledgerRecord();
                break;
            case "R":
                System.out.println("Goodbye");
                running = false;
                break;
            case "H":
                HomeScreen();
                break;
            default:
                System.out.println("Error!!. Try again.");

        }
    }

    public static void All() {
        try {
            FileReader fileReader = new FileReader("Data/Dexter.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            int length = 0;
            while (line != null) {
                System.out.println(line);
                length += line.length();
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            System.out.println("Failed to write to file.");
        }
    }



    private static void promptReturnToMenu() {
    }

    public static void ledgarRecord() {
        System.out.println("\nledgarRecord");
        System.out.println();
        System.out.println();
        promptReturnToMenu();
    }
    private static void ledgerRecord() {
    }
}






//    public static void main(String[] args) {
//        try {
//            FileReader fileReader = new FileReader("Data/Dexter.csv");
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            bufferedReader.readLine();
//
//            String line;
//            while ((line = bufferedReader.readLine()) !=null) {
//                String[] tokens = line.split("\\|");
//
//                LocalDateTime deposit = LocalDateTime.parse(tokens[0] + "T" + tokens[1]);
//                String description = tokens[2];
//                String vendor = tokens[3];
//                double price = Double.parseDouble(tokens[4]);
//                Transaction transaction1 = new Transaction(deposit, description, vendor, price);
//                System.out.println(deposit);
//            }
//            bufferedReader.close();
//    }
//
//    private static void promptUserToMenu() {
//        sc.nextLine();
//    }
//}

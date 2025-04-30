package com.pluralsight;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class SmartBook {

    public static Scanner sc = new Scanner(System.in);
    public static File file = new File("Data/Dexter.csv");
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static boolean running;

    public static void main(String[] args) {

        running = true;
        while (running) {
            showMainMenu();
            String HomeScreen = sc.nextLine();
        }
    }
    public static void showMainMenu() {
        System.out.println("Smart Book");
        System.out.println("--");
        System.out.println("Where do you want to go?");
        System.out.println(" D: Deposit a Payment");
        System.out.println(" P: Make a Payment");
        System.out.println(" L: See Ledgar Record");
        System.out.println(" X: Exit Page");
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
                ledgerRecord();
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
        String depositDescription;
        String depositVendor;
        double depositPrice;

        System.out.print("\n Add Description: ");
        depositDescription = sc.nextLine();

        System.out.print("\n Add Vendor: ");
        depositVendor = sc.nextLine();

        System.out.print("\n Add Price: ");
        depositPrice = sc.nextDouble();

        LocalDateTime time = LocalDateTime.now();
        Transaction transaction = new Transaction(time, depositDescription, depositVendor, depositPrice);

        try {
            FileWriter fileWriter = new FileWriter("Data/Dexter.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            LocalDateTime date = LocalDateTime.now();
            bufferedWriter.write("\n" + transaction.display());

        } catch (IOException e) {
            System.out.println("Failed to write to file.");
        }
        showMainMenu();

        public static void addPayment() {
            System.out.println("\nAdd Description");
            String paymentDescription = sc.nextLine();

            System.out.println("Add Vendor");
            String paymentVendor = sc.nextLine();

            System.out.println("Add price");
            double paymentPrice = sc.nextDouble();
            sc.nextLine();

            paymentPrice *= -1;

            LocalDateTime now = LocalDateTime.now();
            Transaction transaction1 = new Transaction(now, paymentDescription, paymentVendor, paymentPrice);
        }

        try {
            FileReader fileReader = new FileReader("Data/Dexter.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                LocalDateTime deposit = LocalDateTime.parse(tokens[0] + "T" + tokens[1]);
                String description = tokens[2];
                String vendor = tokens[3];
                double price = Double.parseDouble(tokens[4]);
                Transaction transaction1 = new Transaction(deposit, description, vendor, price);
                System.out.println(deposit);
            }
            bufferedReader.close();


            FileWriter fileWriter = new FileWriter("Data/Dexter.csv", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            LocalDateTime date = LocalDateTime.now();
            bufferedWriter.write("\n" + transaction.display());

            bufferedWriter.close();


        } catch (IOException e) {
            System.out.println("Error!!. Please try again.");
            e.getStackTrace();
        }

        showMainMenu();
    }

    private static void promptReturnToMenu() {
    }

    public static void makePayment() {
        System.out.println("\nmakePayment");
        System.out.println();
        System.out.println();
        promptReturnToMenu();
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









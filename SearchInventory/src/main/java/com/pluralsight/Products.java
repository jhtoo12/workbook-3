package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class PayRollCalculator {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Product\\Product.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String BufferedReader = bufferedReader.readLine();

            String input;
            while ((input = bufferedReader.readLine()) != null) {
                String[] arraysSplit = input.split("\\|");
                System.out.println(input);
                System.out.println(Arrays.toString(arraysSplit));
                String[] tokens = input.split("\\|");

                int itemId = Integer.parseInt(tokens[0]);
                String itemName = tokens[1];
                int itemPrice = Integer.parseInt(tokens[2]);

                Inventory inventory = new Employee(employeeId, payRate, hoursWorked, name);
                System.out.printf("employeeId: %d, name: %s, grossPay: $%.2f", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File error");
//            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);







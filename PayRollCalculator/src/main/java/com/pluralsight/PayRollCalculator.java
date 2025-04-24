package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.IOException;
import java.io.IOException;
import java.util.Arrays;


public class PayRollCalculator {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("DataFile\\employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String BufferedReader = bufferedReader.readLine();

            String input;
            while ((input = bufferedReader.readLine()) != null) {
                String[] arraysSplit = input.split("\\|");
                System.out.println(input);
                System.out.println(Arrays.toString(arraysSplit));
                String[] tokens = input.split("\\|");

                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(employeeId, payRate, hoursWorked, name);
                System.out.printf("employeeId: %d, name: %s, grossPay: $%.2f", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File error");
//            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}



//        Employees employees = new Employee(employeeId, name, hoursWorked, payRate);
//        System.out.printf("Employee ID: %")

//                int employeeId = 0;
//                String name = "";
//                int hoursWorked = 8;
//                double payRate = 0.0;
//                double grossPay = 00.000;

//                System.out.println(tokens); tokens: ["10", "Dana Wyatt", "52.5", "12.50"]
//
//                int employeeId = token[0];
//                int hoursWorked = double.parseDouble(token[1]);
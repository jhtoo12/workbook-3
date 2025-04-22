package com.pluralsight;

import java.nio.channels.ScatteringByteChannel;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] quotes = {
                "Art enables us to find ourselves and lose ourselves at the same time. - Thomas Merton",
                "Every artist was first an amateur. - Ralph Waldo Emerson",
                "Art is not what you see, but what you make others see. - Edgar Degas",
                "The purpose of art is washing the dust of daily life off our souls. - Pablo Picasso",
                "Creativity takes courage. - Henri Matisse",
                "Art should comfort the disturbed and disturb the comfortable. - Cesar A. Cruz",
                "Art speaks where words are unable to explain. - Unknown",
                "A work of art is above all an adventure of the mind. - Eugene Ionesco",
                "Art is the lie that enables us to realize the truth. - Pablo Picasso",
                "To be an artist is to believe in life. - Henry Moore"
        };

        System.out.println("Display a number from 1 - 10: ");

        Scanner scanner = new Scanner(System.in);
        String Scanner = scanner.nextLine();
        Arrays.sort(quotes);

        try {
            System.out.println("Display a quote from 1 - 10: ");
            System.out.println(quotes[0]);

        } catch (RuntimeException e) {
            System.out.println(quotes[9]);
            throw new RuntimeException(e);
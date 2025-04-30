package com.pluralsight;

import java.util.ArrayList;

public class BookInventory {
    public static void main(String[] args) {

    }

    ArrayList<String> getInventory() {
        ArrayList<String>books = new ArrayList<>();
        books.add("Hole");
        books.add("Lord of the Fireflies");
        books.add("Mice and Men");
        books.add("Sorcerer Stone");
        books.add("Beautiful Boy");

        System.out.println(books.get(3));
        books.remove(2);
        System.out.println(books);

        return books;

    }

    }


package com.pluralsight;

public class books {
    private String book = "";
    private int price = 0;
    private String name = "";

    public books(String book, int price, String name) {
        this.book = book;
        this.price = price;
        this.name = name;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    }


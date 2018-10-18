package com.my;

public class Books extends Goods{
    private String author;
    private static int count;

    public Books() {
    }

    public Books(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public static void setCount(int count) {
        Books.count = count;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                " author='" + author + '\'' +
                '}';
    }

    @Override
    public void avgCount() {
        System.out.println("Average price of " + getName()+ " is: " + getPrice()/count);
    }
}

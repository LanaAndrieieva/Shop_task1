package com.my;

public class Main {
    public static void main(String[] args) {
        Toys fox1 = new Toys("fox", 23.5, "wood", 5);
        System.out.println(fox1);
        Toys.setCount(3);
        fox1.avgCount();
        Books novel = new Books("novel", 50, "J. Smith");
        System.out.println(novel);
        Books.setCount(2);
        novel.avgCount();
    }
}

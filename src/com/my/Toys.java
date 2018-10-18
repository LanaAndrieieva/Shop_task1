package com.my;

public class Toys extends Goods {
    private String material;
    private int forAge;
    private static int count = 0;

    public Toys() {
    }

    public Toys(String name, double price, String material, int forAge) {
        super(name, price);
        this.material = material;
        this.forAge = forAge;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getForAge() {
        return forAge;
    }

    public void setForAge(int forAge) {
        this.forAge = forAge;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "name='" + super.getName() + '\'' +
                ", price=" + super.getPrice() +
                " material='" + material + '\'' +
                ", forAge=" + forAge +
                '}';
    }

    public static void setCount(int count) {
        Toys.count = count;
    }


@Override
    public void avgCount(){
        System.out.println("Average price of " + getName() + " is: " + getPrice()/count);
    }
}

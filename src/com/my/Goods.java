/*1. Создать 3 класса, описывающие 2 типа некоего товара. Один из классов – базовый, второй и третий – описывают типы товаров.
В первом – обязательны поля «цена» и «название». В наследниках должны быть объявлены новые поля.
 1.1. В классах должны быть два конструктора: пустой и параметризованный, методы get set для каждого поля,
 метод public String toString(), возвращающий строковое представление объекта.
1.2. Базовый класс должен быть абстрактным.
1.3. При помощи статических полей и метода найти и отпечатать среднюю цену товара.*/

package com.my;

abstract public class Goods implements AvgCount{
private String name;
private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    
}

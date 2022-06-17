package com.company;

public class Main {
//Реалізувати клас Goods. Поле first – дробове додатне число, ціна товару; поле second
//– ціле додатне число, кількість одиниць товару. Реалізувати метод cost( ) – обчислення
//вартості товару.
    public static void main(String[] args) {
        Goods goods = new Goods(0, 0);
       /* goods.setPrice(2);
        goods.setQuantity(12);*/
        goods.cost(goods);
    }
}

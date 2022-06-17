package com.company;

import java.util.Scanner;

public class Goods {
    private double price;
    private int quantity;

    private Scanner sc = new Scanner(System.in);

    public Goods(){}

    public Goods(Goods goods){
        this.price = goods.getPrice();
        this.quantity = goods.getQuantity();
    }

    public Goods(double price, int quantity) {


        do {
            System.out.println("Уведіть значення ціни.");
            price = sc.nextDouble();

            if (price < 0)
                CommonErrors.printBasicError();
        }while(price < 0);
        this.price = price;

        do {
            System.out.println("Уведіть кількість товару.");
            quantity = sc.nextInt();

            if (quantity < 0)
                CommonErrors.printBasicError();
        }while (quantity < 0);
        this.quantity = quantity;

    }


    public void cost(Goods goods){
        System.out.println("Ціна товару: " + goods.getPrice() * goods.getQuantity());

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
        this.price = price;
        else {
                CommonErrors.printBasicError();
            System.exit(0);
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity >= 0)
        this.quantity = quantity;
        else {
            CommonErrors.printBasicError();
            System.exit(0);
        }
    }
}

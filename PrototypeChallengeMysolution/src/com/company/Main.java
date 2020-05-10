package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        BasicCarCache.loadCar();

        BasicCar cloneNano = (BasicCar) BasicCarCache.getBasicCar("Nano");
        cloneNano.price = cloneNano.price+ BasicCar.setPrice();
        System.out.println("Car is:" + cloneNano.getModelName()+" and it's price is $" + cloneNano.price);
    }
}

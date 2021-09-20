package org.example.car;

public class Car {
    int speed;
    double regularPrice;
    String color;
    public car( int speed, double regularPrice, String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    public double getsalePrice( double regularPrice, double discount ){
        this.regularPrice = regularPrice;
        double salesPrice = this.regularPrice - discount;
        return salesPrice;
    };

}

class Truck extends Car {
    int weight = 2500;

    double getSalePrice() {
        if (weight > 2000) {
            regularPrice = regularPrice - (0.1 * regularPrice);
        else
            regularPrice = regularPrice - (0.2 * regularPrice);
        }
        return regularPrice;
    }
}

class Ford extends Car {
    int year = 2020;
    int manufacturerDiscount = 12000;
    Ford(){
        super.color = "Yellow";
        super.regularPrice = 200000.0;
        super.speed = 220;
    }
    public double getSalePrice(){
        double salesPrice = regularPrice - manufacturerDiscount;
        return salesPrice;
    }
    }


class Sedan extends Car {
    int length = 25;
    Sedan(){
        super.regularPrice = 100000.00;
        super.color = "red";
        super.speed = 120;
    }
    double getSalePrice() {
        if ( length > 20 )
            regularPrice -= (0.05 * regularPrice);
        else
            regularPrice -= (0.05 * regularPrice)

    }
}

class MyownAutoShop {
    public static void main(String[] args) {
        Sedan s1 = new Sedan();
        Ford f1  = new Ford();
        Ford f2 = new Ford();
        Car c1 = new Car( 200, 250000, "White");

    }
}
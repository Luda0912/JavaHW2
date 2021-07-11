package com.demo;
import com.task.*;

public class Demonstrate {
    private static void print(String value ) {
        System.out.println(value);
    }

    public static void main() {

        MyCar myCar = new MyCar("AMG", "200", "white");
        print(myCar.gas(100));
        print(myCar.brake(0));
        print(myCar.description());

        print("\r\n");

        HisCar hisCar = new HisCar("Panamera", "210", "black");
        print(hisCar.gas(120));
        print(hisCar.brake(10));
        print(hisCar.description());
    }
}

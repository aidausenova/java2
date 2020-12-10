package com.company;

public class Main {

    public static void main(String[] args) {
        Runner r1 = new Runner("R1");
        Runner r2 = new Runner("R2");
        Runner r3 = new Runner("R3");
        Runner r4 = new Runner("R4");
        Runner r5 = new Runner("R5");
        r1.setR1(r2,r5);
        r2.setR1(r3,r1);
        r3.setR1(r4,r2);
        r4.setR1(r5,r3);
        r5.setR1(r1,r4);
        r1.start();
        }
}


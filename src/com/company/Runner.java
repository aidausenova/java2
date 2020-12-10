package com.company;

public class Runner extends Thread {
    private Runner r1;
    private Runner r2;

    public Runner(String name) {
        super(name);
    }

    public void setR1(Runner r1, Runner r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public void run() {
        try {
            System.out.println(getName() + " берет палочку ");
            if (getName().equals("R5")) {
                System.out.println(getName() + " бежит к финишу");
            } else {
                System.out.println(getName() + " бежит к " + r1.getName());
                r1.start();
                r1.join();
            }
            if (!getName().equals("R1")) {
                System.out.println(getName() + " бежит к " + r2.getName());
                System.out.println(r2.getName() + " берет палочку");
            }


        } catch (Exception e) {
        }
    }
}

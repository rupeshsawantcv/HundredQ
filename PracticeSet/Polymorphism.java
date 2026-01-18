package com.Try;

class Parent {
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    @Override
    void show() {
    	super.show();
        System.out.println("Child show");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show(); // Outputs: Child show
    }
}

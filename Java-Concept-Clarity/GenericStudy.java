package com.practiceSet;

class Box<T> {
    private T item;
    
    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
}

public class GenericStudy {
    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.setItem("Rupesh");
        System.out.println(b1.getItem());
        Box<Integer> b2 = new Box<>();
        b2.setItem(10);
        System.out.println(b2.getItem());
    }
}

package oop;

public abstract class Item {
    private String name;
    private int quantity;

    // Constructor
    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public int getQuantity(){
        return quantity;
    }

//    // Method for Polymorphism - It isn't needed in Item class when using abstraction
//    @Override
//    public String toString(){
//        return "Item: " + name + ", Quantity: " + quantity;
//    }

    // Method for Abstraction
    public abstract void displayInfo();
}

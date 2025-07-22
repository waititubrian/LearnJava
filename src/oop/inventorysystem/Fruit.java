package oop.inventorysystem;

public class Fruit extends Item {
    private String type;

    // Constructor
    public Fruit(String name, int quantity, String type){
        super(name, quantity);
        this.type = type;
    }

    public String getType() {
        return type;
    }

//    // Method for Polymorphism
//    @Override
//    public String toString(){
//                return "Item: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + getType();
//     }

    // Method for Abstraction
    @Override
    public void displayInfo(){
        System.out.println("Item: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + getType());
    }
}

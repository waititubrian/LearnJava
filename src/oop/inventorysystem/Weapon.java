package oop;

public class Weapon extends Item {
    private int damage;
    private String type;

    // Constructor
    public Weapon(String name, int quantity, int damage, String type){
       super(name, quantity);
       this.damage = damage;
       this.type = type;
    }

    public int getDamage(){
        return damage;
    }

    public String getType(){
        return type;
    }

//    // Method for Polymorphism
//    @Override
//    public String toString(){
//        return "Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage() + ", Type: " + getType();
//    }

    // Method for Abstraction
    @Override
    public void displayInfo(){
        System.out.println("Weapon: " + getName() + ", Quantity: " + getQuantity() + ", Damage: " + getDamage() + ", Type: " + getType());
    }
}

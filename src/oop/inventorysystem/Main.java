package oop.inventorysystem;

// Inventory system which holds Items - Like you would find in a video game
public class Main {
    public static void main(String[] args){

        Inventory inventory = new Inventory();

//        Item item =  new Item("Generic Item", 10);
        Fruit fruit = new Fruit("Apple", 20, "Fuji");
        Weapon weapon = new Weapon("Sword", 2, 75, "Melee");

//        inventory.addItem(item);
        inventory.addItem(fruit);
        inventory.addItem(weapon);

        inventory.displayInventory();
        inventory.displayInventory("Fuji");

    }
}

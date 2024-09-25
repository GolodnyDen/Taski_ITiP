package TASK1;

public class WarehouseInventory {

    public static int calculateTotalItems(int boxes, int bags, int barrels) {
        int itemsPerBox = 20;
        int itemsPerBag = 50;
        int itemsPerBarrel = 100;
        int totalItems = (boxes * itemsPerBox) + (bags * itemsPerBag) + (barrels * itemsPerBarrel);

        return totalItems;
    }

    public static void main(String[] args) {
        int numberOfBoxes = 10;
        int numberOfBags = 5;    
        int numberOfBarrels = 3;

        int totalItems = calculateTotalItems(numberOfBoxes, numberOfBags, numberOfBarrels);
        System.out.println("Общее количество товаров на складе: " + totalItems);
    }
}


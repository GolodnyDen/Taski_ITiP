package TASK1;

public class GallonsToLitersConverter {
    public static double convertGallonsToLiters(int gallons) {
        double litersInOneGallon = 3.78541;
        return gallons * litersInOneGallon;
    }

    public static void main(String[] args) {
        int gallons = 5;
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " галлонов = " + liters + " литров");
    }

}

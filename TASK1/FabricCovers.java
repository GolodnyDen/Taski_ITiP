package TASK1;

public class FabricCovers {

    public static int calculateFabricCovers(double fabricLength, double duvetWidth, double duvetLength) {
        double fabricArea = fabricLength;

        double duvetArea = duvetWidth * duvetLength;

        return (int) (fabricArea / duvetArea);
    }

    public static void main(String[] args) {

        double fabricLength = 50.0;   
        double duvetWidth = 2.0;      
        double duvetLength = 2.5;     

        int fabricCovers = calculateFabricCovers(fabricLength, duvetWidth, duvetLength);
        System.out.println("Количество пододеяльников: " + fabricCovers);
    }

}

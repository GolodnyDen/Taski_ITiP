package TASK1;

public class TriangleType {

    public static String determineTriangleType(int x, int y, int z) {
 
        if (x + y > z && x + z > y && y + z > x) {
            if (x == y && y == z) {
                return "равносторонний";
            } else if (x == y || x == z || y == z) {
                return "равнобедренный";
            } else {
                return "разносторонний";
            }
        } else {
            return "не является треугольником";
        }
    }

    public static void main(String[] args) {
  
        int x = 5;
        int y = 5;
        int z = 8;

        String triangleType = determineTriangleType(x, y, z);
        System.out.println("Тип треугольника: " + triangleType);
    }
}


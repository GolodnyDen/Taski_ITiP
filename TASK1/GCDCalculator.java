package TASK1;

public class GCDCalculator {
    public static int findGCD(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
 
        int num1 = 104;
        int num2 = 32;

        int gcd = findGCD(num1, num2);
        System.out.println("Наибольший общий делитель " + num1 + " и " + num2 + ": " + gcd);
    }
}

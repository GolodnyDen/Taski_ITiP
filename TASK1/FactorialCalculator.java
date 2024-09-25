package TASK1;

public class FactorialCalculator {

    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел.");
        }

        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        
        int num = 5; 

        long result = calculateFactorial(num);
        System.out.println("Факториал числа " + num + " равен " + result);
    }
}


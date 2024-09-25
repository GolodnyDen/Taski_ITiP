package TASK1;

public class CalorieCalculator {
    public static double calculateCaloriesBurned(int minutes, int intensity) {

        double caloriesPerMinute;
        
        switch (intensity) {
            case 1:
                caloriesPerMinute = 3.5;
                break;
            case 2:
                caloriesPerMinute = 7.0;
                break;
            case 3:
                caloriesPerMinute = 10.0;
                break;
            default:
                throw new IllegalArgumentException("Неправильная интенсивность: должна быть 1, 2 или 3.");
        }
        
        return minutes * caloriesPerMinute;
    }

    public static void main(String[] args) {

        int workoutMinutes = 120;  
        int intensity = 3;        

        double caloriesBurned = calculateCaloriesBurned(workoutMinutes, intensity);
        System.out.println("Калории, сожженные за " + workoutMinutes + " минут при интенсивности " + intensity + ": " + caloriesBurned);
    }
}

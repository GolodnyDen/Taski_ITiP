package TASK1;

public class TicketSales {
    public static double calculateTotalRevenue(int ticketsSold, double ticketPrice, double serviceFee) {

        double totalTicketCost = ticketPrice + serviceFee;

        return ticketsSold * totalTicketCost;
    }

    public static void main(String[] args) {

        int ticketsSold = 100;          
        double ticketPrice = 500.0; // цена в рублях     
        double serviceFee = 25.0;        

        double totalRevenue = calculateTotalRevenue(ticketsSold, ticketPrice, serviceFee);
        System.out.println("Общая выручка от продажи билетов: " + totalRevenue);
    }
}


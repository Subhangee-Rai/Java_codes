import java.util.Scanner;

public class MovieTheater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Initialize the theater seating arrangement with 5 rows and 5 columns
        int rows = 5;
        int cols = 5;
        boolean[][] seats = new boolean[rows][cols]; // false indicates the seat is available
        
        while (true) {
            System.out.println("Movie Theater Seating Arrangement:");
            displaySeatingArrangement(seats);
            
            System.out.println("\nOptions:");
            System.out.println("1. Book a Seat");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            
            if (option == 1) {
                System.out.print("Enter row number (1-5): ");
                int row = sc.nextInt() - 1;
                System.out.print("Enter column number (1-5): ");
                int col = sc.nextInt() - 1;
                
                if (row < 0 || row >= rows || col < 0 || col >= cols) {
                    System.out.println("Invalid seat number. Please try again.");
                } else if (seats[row][col]) {
                    System.out.println("Seat already booked. Please choose another seat.");
                } else {
                    seats[row][col] = true;
                    System.out.println("Seat booked successfully.");
                }
            } else if (option == 2) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
    
    public static void displaySeatingArrangement(boolean[][] seats) {
        System.out.print("  ");
        for (int col = 1; col <= seats[0].length; col++) {
            System.out.print(col + " ");
        }
        System.out.println();
        
        for (int row = 0; row < seats.length; row++) {
            System.out.print((row + 1) + " ");
            for (int col = 0; col < seats[row].length; col++) {
                if (seats[row][col]) {
                    System.out.print("B "); // B indicates the seat is booked
                } else {
                    System.out.print("A "); // A indicates the seat is available
                }
            }
            System.out.println();
        }
    }
}

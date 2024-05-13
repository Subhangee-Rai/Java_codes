public class LoopExample {
    public static void main(String[] args) {
        // Example 1: For loop
        System.out.println("Example 1: For loop");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // Example 2: While loop
        System.out.println("\nExample 2: While loop");
        int j = 1;
        while (j <= 5) {
            System.out.println("Count: " + j);
            j++;
        }

        // Example 3: Do-while loop
        System.out.println("\nExample 3: Do-while loop");
        int k = 1;
        do {
            System.out.println("Count: " + k);
            k++;
        } while (k <= 5);
    }
}

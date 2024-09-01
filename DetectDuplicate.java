import java.util.HashSet;
import java.util.Scanner;

public class DetectDuplicate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of elements
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        // Validate the number of elements
        if (n <= 0) {
            System.out.println("The number of elements should be greater than 0.");
            return;
        }

        // Create an array to hold the input elements
        int[] numbers = new int[n];

        // Prompt user to enter the elements
        System.out.println("Enter " + n + " numbers separated by spaces:");

        for (int i = 0; i < n; i++) {
            // Read each integer
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter integers only.");
                scanner.next(); // Clear invalid input
            }
            numbers[i] = scanner.nextInt();
        }

        // Check for duplicates
        String result = containsDuplicate(numbers);
        System.out.println(result);
    }

    public static String containsDuplicate(int[] array) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : array) {
            // If the number is already in the set, it is a duplicate
            if (!set.add(num)) {
                return "Yes";
            }
        }
        return "No";
    }
}

import java.util.HashMap;
import java.util.Scanner;

public class Checker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input for ransomNote
        System.out.println("Enter the ransom note:");
        String ransomNote = scanner.nextLine();

        // Read input for magazine
        System.out.println("Enter the magazine:");
        String magazine = scanner.nextLine();

        // Check and print results
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println(result ? "true" : "false");

        // Close the scanner
        scanner.close();
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = new HashMap<>();

        // Count the frequency of each character in magazine
        for (char c : magazine.toCharArray()) {
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) <= 0) {
                return false;
            }
            magazineMap.put(c, magazineMap.get(c) - 1);
        }

        return true;
    }
}

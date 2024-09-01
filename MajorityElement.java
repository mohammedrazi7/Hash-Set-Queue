import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements separated by spaces:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Find and print the majority element
        int majorityElement = findMajorityElement(nums);
        System.out.println("The majority element is: " + majorityElement);
    }

    public static int findMajorityElement(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int n = nums.length;

        // Populate the HashMap with frequencies of elements
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Find the majority element
        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        // If no majority element is found (though the problem guarantees one), return -1
        return -1;
    }
}

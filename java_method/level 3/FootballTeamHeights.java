import java.util.*;

public class FootballTeamHeights {

    // Method to find the sum of all elements
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int height : arr) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] arr) {
        int shortest = arr[0];
        for (int height : arr) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallest(int[] arr) {
        int tallest = arr[0];
        for (int height : arr) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        // Generate random heights between 150 and 250
        System.out.println("Heights of 11 Players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150–250
            System.out.print(heights[i] + " ");
        }

        System.out.println("\n-----------------------------");
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + String.format("%.2f", findMean(heights)) + " cm");
    }
}

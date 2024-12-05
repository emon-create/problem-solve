import java.util.Scanner;

public class RectangleArrangement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        // Iterate through each test case
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt(); // Number of stamps
            int totalWidth = 0;
            int maxHeight = 0;

            // Read each stamp's width and height
            for (int j = 0; j < n; j++) {
                int w = scanner.nextInt();
                int h = scanner.nextInt();

                // We add the larger dimension to totalWidth and keep track of maxHeight
                totalWidth += Math.max(w, h);
                maxHeight = Math.max(maxHeight, Math.min(w, h));
            }

            // Calculate the minimum perimeter
            int perimeter = 2 * (totalWidth + maxHeight);
            System.out.println(perimeter); // Output the result for the current test case
        }

        scanner.close();
    }
}


import java.util.Scanner;

public class TheatreSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the values for n, m, and a
        System.out.print("Enter the value for n (length of the rectangle): ");
        long n = scanner.nextLong();
        System.out.print("Enter the value for m (width of the rectangle): ");
        long m = scanner.nextLong();
        System.out.print("Enter the value for a (side of the square tile): ");
        long a = scanner.nextLong();

        // Calculate the number of tiles needed along each dimension
        long tilesAlongLength = (n + a - 1) / a;
        long tilesAlongWidth = (m + a - 1) / a;

        // Total number of tiles is the product of the two
        long totalTiles = tilesAlongLength * tilesAlongWidth;

        // Output the result
        System.out.println("Total number of tiles needed: " + totalTiles);

        scanner.close();
    }
}

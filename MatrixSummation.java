import java.util.Scanner;

public class MatrixSummation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size N: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int totalRowSum = 0;
        int totalColSum = 0;
        int forwardDiag = 0;
        int reverseDiag = 0;

        
        System.out.println("\n--- Individual Row Sums ---");
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
                
                
                if (i == j) forwardDiag += matrix[i][j];
                if (i + j == n - 1) reverseDiag += matrix[i][j];
            }
            totalRowSum += rowSum;
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        
        System.out.println("\n--- Individual Column Sums ---");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            totalColSum += colSum;
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }

        System.out.println("\n--- Diagonal Sums ---");
        System.out.println("Forward Diagonal: " + forwardDiag);
        System.out.println("Reverse Diagonal: " + reverseDiag);

        System.out.println("\n--- Final Totals ---");
        System.out.println("Sum of all Rows: " + totalRowSum);
        System.out.println("Sum of all Columns: " + totalColSum);

        sc.close();
    }
}
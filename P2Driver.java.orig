import java.io.*;

/*
 * Purpose: Data Structure and Algorithms Lab 7 Problem 2
 * Status: Complete and thoroughly tested
 * Last update: 10/31/23
 * Submitted:  10/31/23
 * Comment: test suite and sample run attached
 * Comment: I declare that this is entirely my own work
 * @author: William Carr
 * @version: 2023.10.31
 */

public class P2Driver {

    static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException, InstantiationException, ClassNotFoundException, IllegalAccessException {

        System.out.println("\nSelect from the following menu:\n"
                           +"\t0. Exit Program\n"
                           +"\t1. Recursive binomial coefficient\n"
                           +"\t2. Draw pascal's triangle\n"
                           +"\t3. Iterative binomial coefficient\n"
                           +"\t4. Formulaic binomial coefficient");

        int selection;
        boolean continuing = true, repeat = false;
        do {

            System.out.print("Make your menu selection now: ");
            selection = Integer.parseInt(stdin.readLine().trim());
            System.out.println(selection);

            switch(selection) {
            case 1:
                recursiveBinCo();
                break;
            case 2:
                displayPascal();
                break;
            case 3:
                iterativeBinCo();
                break;
            case 4:
                formulaicBinCo();
                break;
            default: // continuing unless told to stop
                continuing = false;
                System.out.println("Exiting program... Goodbye!");
                break;
            }

        } while(continuing);

    }

    private static int readInt(String prompt) {
        System.out.print(prompt);
        int input;
        try {
            input = Integer.parseInt(stdin.readLine().trim());
            System.out.print(input);
        } catch(Exception ex) {
            input = 0;
        }
        return input;
    }

    public static void recursiveBinCo() throws IOException, NumberFormatException {
        int n = readInt("\n\tEnter n: ");
        int k = readInt("\n\tEnter k: ");

        int result = BinCoeff_1(n, k);
        System.out.printf("%n%n%d choose %d"+
                          " is %d.%n%n", n, k, result);
    }

    public static int BinCoeff_1(int n, int k) {
        if(k == 0 || k == n)
            return 1;
        else
            return BinCoeff_1(n-1, k-1) + BinCoeff_1(n-1, k);
    }

    public static void displayPascal() {
        int n = readInt("\n\tEnter n: ");

        int[][] triangle = new int[n+1][n+1];
        for(int row = 0; row < n+1; row++) {
            System.out.println();
            for(int k = 0; k <= row; k++) {
                triangle[row][k] = ( k == 0 || k == n ) ? 
                    1 : (triangle[row-1][k-1] + triangle[row-1][k]);
                System.out.printf("%d ", triangle[row][k]);
            }
        }

        System.out.println();
    }

    public static void iterativeBinCo() {
        int n = readInt("\n\tEnter n: ");
        int k = readInt("\n\tEnter k: ");

        int result = BinCoeff_2(n, k);
        System.out.printf("%n%n%d choose %d"+
                          " is %d.%n%n", n, k, result);
    }

    public static int BinCoeff_2(int n, int k) {
        int kstar = Math.min(k, n-k);
        int rowMax;

        int[][] triangle = new int[n+1][kstar+1];
        for(int row = 0; row < n+1; row++) {
            rowMax = Math.min(row, kstar);
            for(int curK = 0; curK <= rowMax; curK++) {
                triangle[row][curK] = ( curK == 0 || curK == n ) ? 
                    1 : (triangle[row-1][curK-1] + triangle[row-1][curK]);
            }
        }
        return triangle[n][kstar];
    }

    public static void formulaicBinCo() {
        int n = readInt("\n\tEnter n: ");
        int k = readInt("\n\tEnter k: ");

        int result = BinCoeff_3(n, k);
        System.out.printf("%n%n%d choose %d"+
                          " is %d.%n%n", n, k, result);
    }

    public static int BinCoeff_3(int n, int k) {
        int kstar = Math.min(k, n-k);
        int result = 1;

        for(int i = 0; i < kstar; i ++) {
            result = result * (n-i) / (kstar-i);
        }

        return result;
    }

}
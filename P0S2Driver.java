import java.io.*;

/*
 * Purpose: Data Structure and Algorithms Lab 7 Problem 0 Solution 2
 * Status: Complete and thoroughly tested
 * Last update: 10/25/23
 * Submitted:  10/25/23
 * Comment: test suite and sample run attached
 * Comment: I declare that this is entirely my own work
 * @author: William Carr
 * @version: 2023.10.25
 */

public class P0S2Driver {

    static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {

        System.out.println("\nEnter the number to find the factorials to:\n");
        int number = Integer.parseInt(stdin.readLine().trim());
        // System.out.println(number);

        for(int i = 1; i <= number; i++) {
            System.out.printf("%d \t %d %n", factorial((long)i), i);
        }

    }

    public static long factorial(long n) {
        if(n == 1)
            return 1;
        return n*factorial(n-1);
    }

}
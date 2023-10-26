import java.io.*;
import java.math.BigInteger;

/*
 * Purpose: Data Structure and Algorithms Lab 7 Problem 0 Solution 3
 * Status: Complete and thoroughly tested
 * Last update: 10/25/23
 * Submitted:  10/25/23
 * Comment: test suite and sample run attached
 * Comment: I declare that this is entirely my own work
 * @author: William Carr
 * @version: 2023.10.25
 */

public class P0S3Driver {

    static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException {

        System.out.println("\nEnter the number to find the factorials to:\n");
        int number = Integer.parseInt(stdin.readLine().trim());
        // System.out.println(number);

        for(int i = 1; i <= number; i++) {
            BigInteger n = new BigInteger(""+i);
            System.out.printf("%s \t %s %n", factorial(n).toString(), 
                n.toString());
        }

    }

    public static BigInteger factorial(BigInteger n) {
        if(n.equals(BigInteger.ONE))
            return BigInteger.ONE;
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

}
import java.io.*;

/*
 * Purpose: Data Structure and Algorithms Lab 7 Problem 1
 * Status: Complete and thoroughly tested
 * Last update: 10/25/23
 * Submitted:  10/25/23
 * Comment: test suite and sample run attached
 * Comment: I declare that this is entirely my own work
 * @author: William Carr
 * @version: 2023.10.25
 */

public class PreP1Driver {

    static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws ArithmeticException, NumberFormatException, IOException {

        System.out.print("\nEnter the number of disks for the Towers of Hanoi: ");
        int number = Integer.parseInt(stdin.readLine().trim());
        // System.out.println(number);

        System.out.println("\n");

        int[] counters = {0, 0}; // first is calls to solve second is disk moves
        solve(number, "The Left Tower", "The Right Tower", "The Middle Tower", counters);
        System.out.printf("%ncalls: %d%ndisk moves: %d%n", counters[0], counters[1]);
    }

    public static void solve(int n, String I, String D, String T, int[] counters) {
		counters[0]++;
		if(n > 0) {
			solve(n-1, I, T, D, counters);
			System.out.printf("move disk %d from %s to %s%n", n, I, D);
			counters[1]++;
			solve(n-1, T, D, I, counters);
		}
	}

}
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
                           +"\t3. text\n"
                           +"\t4. text");

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
            // case 2:
            //     popFront();
            //     break;
            // case 3:
            //     peekFront();
            //     break;
            // case 4:
            //     dequeueAll();
            //     break;
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
        System.out.printf("%d choose %d"+
                          " is %d.%n%n", n, k, result);
    }

    public static int BinCoeff_1(int n, int k) {
        if(k == 0 || k == n)
            return 1;
        else
            return BinCoeff_1(n-1, k-1) + BinCoeff_1(n-1, k);
    }

}
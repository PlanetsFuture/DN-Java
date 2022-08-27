/***************************************************************************
 * @author Danny Ramírez
 *
 * Compilation:   javac DNArrayIO.java
 * Execution:     java DNArrayIO < input.txt
 * Dependencies:  DNOut.java
 *                DNIn.java
 *
 *
 * A library for reading in 1D and 2D arrays of integers, doubles
 * and booleans from standard input and printing them out to
 * standard output.
 *
 * cat tinyDouble1D.txt tinyDouble2D.txt tinyBoolean2D.txt | java DNArrayIO
 *
 * % more tinyDouble1D.txt
 * 5
 * 3.0 1.0 2.0 5.0 4.0
 *
 * % more tinyDouble2D.txt
 * 4 3
 * .00  .23  .00
 * .24  .65  .12
 * .22  .33  .44
 * .43  .54  .81
 *
 * % more tinyBoolean2D.txt
 * 4 3
 * 1   1   0
 * 0   0   0
 * 0   1   1
 * 1   0   0
 *
 ***************************************************************************/

/**
 * Standard array IO. This class provides methods for reading
 * in 1D and 2D from standard input and printing out to standard output.
 */
public class DNArrayIO {

    // don't instantiate
    private DNArrayIO() {
    }

    /*
     * Reads 1 1D array of doubles from standard input and returns it.
     *
     * @return the 1D array of doubles
     */
    public static double[] readDouble1D() {
        int n = DNIn.readInt();
        double[] a = new double[n];

        for (int i = 0; i < n; i++)
            a[i] = DNIn.readDouble();

        return a;
    }

    /**
     * Prints an array of doubles to standard output.
     *
     * @param a the 1D array of doubles
     */
    public static void print(double[] a) {
        int n = a.length;
        DNOut.println(n);

        for (int i = 0; i < n; i++)
            DNOut.printf("%9.5f ", a[i]);
        DNOut.println();
    }

    /**
     * Reads a 2D array of doubles from standard input and returns it.
     *
     * @return the 2D array of doubles
     */
    public static double[][] readDouble2D() {
        int m = DNIn.readInt();
        int n = DNIn.readInt();
        double[][] a = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = DNIn.readDouble();
        }
        return a;
    }

    /**
     * Prints the 2D array of doubles to standard output.
     *
     * @param a the 2D array of doubles
     */
    public static void print(double[][] a) {
        int m = a.length;
        int n = a[0].length;
        DNOut.println(m + " " + n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                DNOut.printf("%9.5f ", a[i][j]);
            DNOut.println();

        }
    }

    /**
     * Prints the 2D array of doubles to standard output.
     *
     * @param a the 2D array of doubles
     */
    public static int[] readInt1D() {
        int n = DNIn.readInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = DNIn.readInt();

        return a;
    }

    /**
     * Prints an array of integers to standard output.
     *
     * @param a the 1D array of integers
     */
    public static void print(int[] a) {
        int n = a.length;
        DNOut.println(n);

        for (int i = 0; i < n; i++)
            DNOut.printf("%9d ", a[i]);
        DNOut.println();
    }

    /**
     * Reads a 2D array of integers from standard input and returns it.
     *
     * @return the 2D array of integers
     */
    public static int[][] readInt2D() {
        int m = DNIn.readInt();
        int n = DNIn.readInt();
        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = DNIn.readInt();
        }
        return a;
    }

    /**
     * Print a 2D array of integers to standard output.
     *
     * @param a the 2D array of integers
     */
    public static void print(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        DNOut.println(m + " " + n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                DNOut.printf("%9d ", a[i][j]);
            DNOut.println();
        }
    }

    /**
     * Reads a 1D array of booleans from standard input and returns it.
     *
     * @return the 1D array of booleans
     */
    public static boolean[] readBoolean1D() {
        int n = DNIn.readInt();
        boolean[] a = new boolean[n];

        for (int i = 0; i < n; i++)
            a[i] = DNIn.readBoolean();
        return a;
    }

    /**
     * Prints a 1D array of booleans to standard output.
     *
     * @param a the 1D array of booleans
     */
    public static void print(boolean[] a) {
        int n = a.length;
        DNOut.println(n);

        for (int i = 0; i < n; i++) {
            if (a[i])
                DNOut.print("1 ");
            else
                DNOut.print("0 ");
        }
        DNOut.println();
    }

    /**
     * Reads a 2D array of booleans from standard input and returns it.
     *
     * @return the 2D array of booleans
     */
    public static boolean[][] readBoolean2D() {
        int m = DNIn.readInt();
        int n = DNIn.readInt();
        boolean[][] a = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = DNIn.readBoolean();
        }
        return a;
    }

    /**
     * Prints a 2D array of booleans to standard output.
     *
     * @param a the 2D array of booleans
     */
    public static void print(boolean[][] a) {
        int m = a.length;
        int n = a[0].length;
        DNOut.println(m + " " + n);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j])
                    DNOut.print("1 ");
                else
                    DNOut.print("0 ");
            }
            DNOut.println();
        }
    }

    /*
     * Unit tests {@code DNArrayIO}
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // read and print an array of doubles
        double[] a = DNArrayIO.readDouble1D();
        DNArrayIO.print(a);
        DNOut.println();

        // read and print a matrix of doubles
        double[][] b = DNArrayIO.readDouble2D();
        DNArrayIO.print(b);
        DNOut.println();

        // read and print a matrix of booleans
        boolean[][] d = DNArrayIO.readBoolean2D();
        DNArrayIO.print(d);
        DNOut.println();
    }
}

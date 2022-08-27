public class QuickFind {
    public static void main(String[] args) {
        int[] a = DNArrayIO.readInt1D();
        int N = 3;
        for (int i = 0; i < N; i++)
            a[i] = i;
        DNOut.println("a[0] = " + a[0]);

    }
}

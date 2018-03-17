import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        sort(a, n);
    }

    public static int sort(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            Arrays.sort(a, 0, i + 1);
            for (int j = i; j >= 0; j--)
                if (j < 5) {
                    System.out.print(a[j] + " ");
                }
            System.out.println();
        }
        return 0;
    }
}

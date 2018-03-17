import java.util.Scanner;

public class Stepen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int count = search(n);
        System.out.print(count);

    }

    public static int search(long n){
       int count = 1;
        if(n >= 1) {
            for (long i = 2; i <= n; i *= 2) {
                if (i <= n)
                    count++;
            }
            return count;
        }
        else
            return 0;
    }
}

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class UnChi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TreeSet<Integer> a = new TreeSet<>();
        for(int i = 0; i<n; i++){
            a.add(scanner.nextInt());
        }
        System.out.print(a.size());
    }
}

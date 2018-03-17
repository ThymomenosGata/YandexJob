import java.util.Scanner;

public class FixPrice {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        long[] arr = new long[5];
        for(int i = 0; i < 5; i++){
            arr[i]=scanner.nextLong();
        }
        search(arr);
    }
    public static void search(long[] a){
        int flag = 1;
        for(long i = a[1]; i<=a[2]; i++){
            for(long j = a[3]; j<=a[4]; j++){
                if(a[0] == i+j) {
                    if(flag == 1) {
                        System.out.print(i + " " + j);
                        flag++;
                    }
                }

            }
        }
        if(flag == 1)
            System.out.print(-1);
    }
}

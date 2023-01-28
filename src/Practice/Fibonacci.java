package Practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        fib(n);
    }

    static public void fib(int n) {
        if(n < 2) {
            System.out.println(1);
            return;
        }
        int[] fibos = new int[n];
        fibos[0] = 1;
        fibos[1] = 1;
        for (int i = 2; i < n; i++) {
            fibos[i] = fibos[i - 1] + fibos[i - 2];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(fibos[i]);
        }
    }
}

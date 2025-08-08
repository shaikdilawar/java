import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();;
        int ans = fib(N);
        System.out.println(ans);
    }

    static int fib(int n){
        if(n<2) return n;
        return fib(n-1) + fib(n-2);
    }
}

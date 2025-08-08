import java.util.Scanner;

public class Sum_of_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        f(1,N);
        System.out.println(sum);
    }

    static int sum = 0;
    static void f(int i,int n){
        if(i>n) return;
        sum+=i;
        f(i+1,n);
    }
}

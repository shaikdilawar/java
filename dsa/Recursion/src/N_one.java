import java.util.Scanner;

public class N_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        f(N,1); // f(N,N);
    }
    static void f(int N,int i){
        if(N<i) return ;   // if(i<N) return;
        System.out.println(N);
        f(N-1,1);     //f(i-1,N)
    }
}

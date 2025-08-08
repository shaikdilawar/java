import java.util.Scanner;

public class N_one_BT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        f(1,N);
    }
    static void f(int i,int n){
        if(i>n) return;
        f(i+1,n);
        System.out.println(i);
    }
}

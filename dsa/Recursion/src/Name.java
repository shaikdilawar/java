import java.util.Scanner;
//Print name N times
public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        f(1,N);
    }

    static void f(int i,int N){
        if(i>N) return;
        System.out.println("Dillu");
        f(i+1,N);
    }
}

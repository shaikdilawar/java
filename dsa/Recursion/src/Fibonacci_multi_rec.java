public class Fibonacci_multi_rec {
    public static void main(String[] args) {
        System.out.println(f(4,0,0));

    }

    static int f(int n,int last,int slast){
        if(n<=1) return n;
        last = f(n-1,last,slast);
        slast = f(n-2,last,slast);
        return last + slast;
    }
}

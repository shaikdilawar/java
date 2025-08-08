//Functional
public class Sum_of_N_BT_Funct {
    public static void main(String[] args) {
        int n = 3;
        f(n);
        System.out.println(f(n));
    }

    static int f(int n){
        if(n == 0) return 0;
        return n + f(n-1);
    }
}

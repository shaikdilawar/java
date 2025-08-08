//Parameter recurssion

public class Sum_of_N_BT_Param{
    static int N = 5;
    public static void main(String[] args) {
        f(1,0);
    }
    static void f(int i,int sum){
        if(i>N) {
            System.out.println(sum);
            return;}
        f(i+1,sum+i);
    }
}

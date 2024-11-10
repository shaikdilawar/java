import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,3,5,56,64,80);
        multiple(5,8,"Dillu","Java","Spl");
    }

    static void multiple(int a ,int b ,String  ...v){//if we have multiple no of variables we use ... and it must be at end
        System.out.println("a:" + a + ", b:" + b);
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v) {
    System.out.println(Arrays.toString(v));

    }
}

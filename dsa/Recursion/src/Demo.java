
import java.util.*;

public class Demo {

    public static void main(String[] args) {
        int n = 1221;
        String s = Integer.toString(n);
        StringBuilder str = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(iseven(s.charAt(i)) && iseven(s.charAt(i+1)))
                str.append(s.charAt(i) + "-");
            else {
                str.append(s.charAt(i));
            }
        }
        System.out.println(str);

    }
        static boolean iseven(int n){
        int x = (char)n;
        return (x%2==0)? true : false;
        }
}
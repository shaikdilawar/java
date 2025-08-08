import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args) {
        String s = "MADAM";
       boolean ans =  f(0,s);
        System.out.println(ans);
    }

    static boolean f(int i,String s) {
        if (i >= s.length() / 2) return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;
        return f(i + 1, s);
    }
}
